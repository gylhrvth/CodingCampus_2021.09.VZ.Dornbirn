package Ingo.bankkonto;

import Lukas.bank.Database;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class CRUDTest {

    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank2test?user=root&password=root");
        database.connect();
/*
        deleteTable("kunde");
        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("transaktion");
*/    }

    private void deleteTable(String table) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM " + table);
        statement.executeUpdate();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        database.disconnect();
    }

    @Test
    public void testInsertAndSelect() {
        Connection connection = database.getConnection();

        try {
            String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "Alfons");
            statement.setString(2, "Nüziders");

            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 0, 1);
            Date date = calendar.getTime();

            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            statement.setDate(3, sqlDate);

//            int rows = statement.executeUpdate();

//            Assertions.assertEquals(1, rows);

            ResultSet resultSet = statement.getGeneratedKeys();

            long id = 0;    // kundenNr ersetzt
            if (resultSet.next()) {
                id = resultSet.getLong(1);
                Assertions.assertTrue(id > 0);
            } else {
                Assertions.fail("No primary key returned...");
            }

            String query = "SELECT kundenNr, adresse, geburtsdatum, name FROM kunde";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if(resultSet.next()) {
                long queriedid = resultSet.getLong(1);
                String adresse = resultSet.getString(2);
                java.sql.Date geburtsdatum = resultSet.getDate(3);
                String name = resultSet.getString(4);

                Assertions.assertEquals(id, queriedid);
                Assertions.assertEquals("Nüziders", adresse);
                Assertions.assertEquals("2018-01-01", geburtsdatum.toString());
                Assertions.assertEquals("Alfons", name);

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
