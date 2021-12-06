package Lena.bank;


import Lena.bank.database.Database;
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
        database = new Database("jdbc:mysql://localhost:3306/banktest?user=root&password=root1234");
        database.connect();

        deleteTable("kunden");
        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("transaktionen");
    }

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
            String sqlInsert = "INSERT INTO kunden(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "Tim");
            statement.setString(2, "Lauterach");
            Calendar calender = Calendar.getInstance();
            calender.set(2019, 5, 14);
            Date date = calender.getTime();

            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            statement.setDate(3, sqlDate);
            int rows = statement.executeUpdate();

            Assertions.assertEquals(1, rows);

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long kundenNr = resultSet.getLong(1);
                Assertions.assertTrue(kundenNr > 0);
            } else {
                Assertions.fail("No primary key returned ...");
            }
            String query = "SELECT kundenNr, name, adresse, geburtsdatum FROM kunden";
            PreparedStatement preparedStatement2 = connection.prepareStatement(query);
            ResultSet resultSet1= preparedStatement2.executeQuery(query);
            while(resultSet1.next()){
                long kundenNr = resultSet1.getLong(1);
                String name = resultSet1.getString(2);
                String adress = resultSet1.getString(3);
                java.sql.Date gepurtsdatum = resultSet1.getDate(4);
                System.out.printf("KontoNr: %d, Name: %s, Adresse: %s, Geburtsdatum: %s",kundenNr,name,adress,gepurtsdatum.toString());
               // Assertions.assertEquals("Tim", resultSet1.getString(1));
            }

        } catch (SQLException sqlException) {
            Assertions.fail("Could not insert kunde", sqlException);
        }
    }
}
