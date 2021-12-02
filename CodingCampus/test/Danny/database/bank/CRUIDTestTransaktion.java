package Danny.database.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class CRUIDTestTransaktion extends CRUIDTest {

    @Test
    public void testInsertAndSelect() throws SQLException {
        Connection connection = database.getConnection();
        try {
            // Transaktion in Datenbank einfügen

            String sql = "INSERT INTO transaktion(betrag, zeitstempel) VALUES (?,?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, 1000);
            Calendar calendar = Calendar.getInstance();
            calendar.set(2021, Calendar.NOVEMBER, 26, 1, 1, 1);
            calendar.set(Calendar.MILLISECOND, 0);
            Date date = calendar.getTime();
            java.sql.Timestamp sqlDate = new java.sql.Timestamp(date.getTime());
            statement.setTimestamp(2, sqlDate);

            int rows = statement.executeUpdate();

            // Ergebnis überprüfen
            Assertions.assertEquals(1, rows);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long transaktionsNr = resultSet.getLong(1);
                Assertions.assertTrue(transaktionsNr > 0);
            } else {
                Assertions.fail("No primary key returned");
            }
            String query = "SELECT transaktionsNr, betrag, zeitstempel, quelle_kontoNr_fk, ziel_kontoNr_fk from transaktion";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                long transaktionsNr = resultSet.getLong(1);
                int betrag = resultSet.getInt(2);
                java.sql.Timestamp zeitstempel = resultSet.getTimestamp(3);
                int quelle_kontoNr_fk = resultSet.getInt(4);
                int ziel_kontoNr_fk = resultSet.getInt(5);

                Assertions.assertEquals(1000, betrag);
                Assertions.assertEquals("2021-11-26 01:01:01.0", zeitstempel.toString());
                Assertions.assertEquals(0, quelle_kontoNr_fk);
                Assertions.assertEquals(0, ziel_kontoNr_fk);
                if (resultSet.next()) {
                    Assertions.fail("Too many Transaktions");
                }
            } else {
                Assertions.fail("No Transaktion found...");
            }
        } catch (
                SQLException exc) {
            Assertions.fail("Could not insert Account", exc);
        }
    }
}
