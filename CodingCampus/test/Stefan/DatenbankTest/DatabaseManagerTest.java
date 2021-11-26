package Stefan.DatenbankTest;

import Lena.Calender;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;


public class DatabaseManagerTest {
    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank3test?user=root&password=%23root%231234");
        database.connect();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        database.disconnect();
    }

    @Test
    public void testInsertKunde() {
        DatabaseManager databaseManager = new DatabaseManager(database);

        try {
            long kontoNr = databaseManager.createKunde("Markus","Kohlendorf", createDate(1980,1,1));
            Assertions.assertTrue(kontoNr > 0);
        } catch (SQLException exc) {
            Assertions.fail("Customer could not be created ...", exc);
        }

    }

    private Date createDate(int year, int month, int day) {
        Calendar calender = Calendar.getInstance();
        calender.set(year,month,day,0,0,0);
        return calender.getTime();

    }
}
