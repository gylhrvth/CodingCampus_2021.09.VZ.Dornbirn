package Stefan.DatenbankTest;

import Stefan.DatenbankTest.model.Kunde;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class DatabaseManagerTest {
    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank3test?user=root&password=%23root%231234");
        database.connect();

        deleteTable("kunde");
        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("transaktion");

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
    public void testInsertKunde() {
        DatabaseManager databaseManager = new DatabaseManager(database);

        try {
            long kontoNr = databaseManager.createKunde(new Kunde(0,"Markus","Kohlendorf", createDate(1980,1,1)));
            Assertions.assertTrue(kontoNr > 0);
        } catch (SQLException exc) {
            Assertions.fail("Customer could not be created ...", exc);
        }

    }

    @Test
    public void testReadKunden() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager(database);

        long kundenNr1 = databaseManager.createKunde(new Kunde(0,"Test1","Teststrasse 2", createDate(2001,10,5)));
        long kundenNr2 = databaseManager.createKunde(new Kunde(0,"Test2","Teststrasse 5", createDate(2010,11,8)));
        long kundenNr3 = databaseManager.createKunde(new Kunde(0,"Test3","Teststrasse 1", createDate(2011,6,23)));
        long kundenNr4 = databaseManager.createKunde(new Kunde(0,"Test4","Teststrasse 8", createDate(1901,5,8)));

        List<Kunde> kunden = databaseManager.readKunde();
        Assertions.assertEquals(4,kunden.size());

        Kunde kunde1 = kunden.get(0);

        Assertions.assertEquals(kundenNr1,kunde1.getKundenNr());
        Assertions.assertEquals("Test1", kunde1.getName());
        Assertions.assertEquals("Teststrasse 2", kunde1.getAdress());
        Assertions.assertEquals(createDate(2001,10,5), kunde1.getGeburtsdatum());
    }

    private Date createDate(int year, int month, int day) {
        Calendar calender = Calendar.getInstance();
        calender.set(year,month,day,0,0,0);
        return calender.getTime();

    }
}
