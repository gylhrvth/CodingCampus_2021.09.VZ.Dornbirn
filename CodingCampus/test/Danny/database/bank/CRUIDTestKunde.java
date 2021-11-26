package Danny.database.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class CRUIDTestKunde extends CRUIDTest {

    public CRUIDTestKunde() throws SQLException {
    }

    @Test
    public void testInsertAndSelect()throws SQLException {
        Connection connection = database.getConnection();
        try {
            /**
             * Kunde in Datenbank einfügen
             */
            String sql = "INSERT INTO kunde(name, adresse, GebDatum) VALUES (?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "Alfons");
            statement.setString(2, "Nüziders");
            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 0, 1);
            Date date = calendar.getTime();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            statement.setDate(3, sqlDate);

            //Hier wird das statement ausgeführt
            int rows = statement.executeUpdate();

            /**
             * Ergebnis überprüfen
             */
            Assertions.assertEquals(1, rows);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long kundenNr = resultSet.getLong(1);
                Assertions.assertTrue(kundenNr > 0);
            } else {
                Assertions.fail("No primary key returned...");
            }
            String query = "SELECT kundenNr, name, adresse, GebDatum FROM kunde";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                long kundenNr = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String adresse = resultSet.getString(3);
                java.sql.Date geburtsdatum = resultSet.getDate(4);
                Assertions.assertEquals("Alfons", name);
                Assertions.assertEquals("Nüziders", adresse);
                Assertions.assertEquals("2018-01-01", geburtsdatum.toString());
                if(resultSet.next()) {
                    Assertions.fail("Too many customers...");
                }
            } else {
                Assertions.fail("No customer found...");
            }
        } catch (SQLException exc) {
            Assertions.fail("Could not insert kunde", exc);
        }
    }
}
