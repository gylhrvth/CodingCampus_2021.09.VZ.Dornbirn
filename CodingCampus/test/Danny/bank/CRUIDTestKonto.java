package Danny.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class CRUIDTestKonto {
    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank2test?user=root&password=Voegel79");
        database.connect();

        deleteTabele("kunde");
        deleteTabele("konto");
        deleteTabele("konto_kunde");
        deleteTabele("transaktion");
    }

    private void deleteTabele(String table) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("Delete from" + table);
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
            /** Kunde in Datenbank einfügen
             *
             */
            String sql = "INSERT INTO konto(KontoNr, Kontostand, Name) VALUES (?,?,?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, 123456);
            statement.setInt(2, 1200);
            statement.setString(3, "Alfons");

            //Hier wird das statement ausgeführt
            int rows = statement.executeUpdate();

            /**
             * Ergebniss überprüfen
             */
            Assertions.assertEquals(1, rows);

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long kontoNr = resultSet.getLong(1);
                Assertions.assertTrue(kontoNr > 0);
            } else {
                Assertions.fail("No primary key returned...");
            }

            String query = "SELECT KontoNr, Kontostand, Name FROM konto ";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                long kontoNr = resultSet.getLong(1);
                int kontostand = resultSet.getInt(2);
                String name = resultSet.getString(3);
                Assertions.assertEquals(123456, kontoNr);
                Assertions.assertEquals(1200, kontostand);
                Assertions.assertEquals("Alfons", name);

                if (resultSet.next()) {
                    Assertions.fail("Too many customers...");
                }
            } else {
                Assertions.fail("No customer found...");
            }
        } catch (SQLException exc) {
            Assertions.fail("Could not insert konto", exc);
        }
    }
}
