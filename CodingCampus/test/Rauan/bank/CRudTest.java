package Rauan.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class CRudTest {

    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database= new Database("jdbc:mysql://localhost:3306/banktest?user=root&password=Rauan1234");
        database.connect();

        deletTable("konto");
        deletTable("kunde");
        deletTable("konto_kunde");
        deletTable("transaktion");
    }
    private void deletTable(String table) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM " + table);
        statement.executeUpdate();
    }

    @Test
    public void testInserAndSelect() throws SQLException {
        Database database= new Database();
        database.connect();
    }
    @AfterEach
    public void tearDown() throws SQLException {
        database.disconnect();
    }
    @Test
    public void testInsertAndSelect(){
        Connection connection= database.getConnection();
        try {
            String sql = "Insert Into Kunde(Name, Adresse, Geburtsdatum)Values (?,?,?)";
            PreparedStatement statement= connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, "Alfons");
            statement.setString(2, "Nüziders");

            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 0, 1);
            Date date = calendar.getTime();

            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            statement.setDate(3, sqlDate);

            int rows = statement.executeUpdate();

            Assertions.assertEquals(1, rows);

            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                long kontoNr = resultSet.getLong(1);
                Assertions.assertTrue(kontoNr > 0);
            } else {
                Assertions.fail("No primary key returned...");
            }
        } catch (SQLException exc) {
            Assertions.fail("Could not insert kunde", exc);
        }
    }
}

