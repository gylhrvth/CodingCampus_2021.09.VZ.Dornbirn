package Lukas.bank;

import Lukas.bank.model.Kunde;
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
        database = new Database("jdbc:mysql://localhost:3306/bank2test?user=root&password=root");
        database.connect();

        deleteTable("kunde");
        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("transaktion");
    }

    private void deleteTable(String table) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM "+table);
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
            long kontoNr = databaseManager.createKunde(new Kunde(0, "Test", "Testdorf", createDate(2000, 0, 1)));
            Assertions.assertTrue(kontoNr > 0);
        } catch(SQLException exc) {
            Assertions.fail("Customer could not be created...");
        }
    }

    @Test
    public void updateKunde() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager(database);

        Kunde originKunde = new Kunde(0, "Test", "Testdorf", createDate(2000, 0, 1));

        long kundenNr = databaseManager.createKunde(originKunde);

        originKunde.setKundenNr(kundenNr);
        originKunde.setName("Test2");
        originKunde.setAdress("Testdorf2");

        Assertions.assertTrue(databaseManager.updateKunde(originKunde));

        Kunde updatedKunde = databaseManager.readKunde(kundenNr);

        Assertions.assertNotNull(updatedKunde);

        Assertions.assertEquals("Test2", updatedKunde.getName());
        Assertions.assertEquals("Testdorf2", updatedKunde.getAdresse());
    }

    @Test
    public void testReadKunden() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager(database);

        long kundenNr1 = databaseManager.createKunde(new Kunde(0, "Test", "Testdorf2", createDate(1900, 0, 1)));
        long kundenNr2 = databaseManager.createKunde(new Kunde(0, "Test", "Testdorf2", createDate(1900, 0, 1)));
        long kundenNr3 = databaseManager.createKunde(new Kunde(0, "Test", "Testdorf2", createDate(1900, 0, 1)));

        List<Kunde> kunden = databaseManager.readKunden();
        Assertions.assertEquals(3, kunden.size());

        Kunde kunde1 = kunden.get(0);

        Assertions.assertEquals(kundenNr1, kunde1.getKundenNr());
        Assertions.assertEquals("Test", kunde1.getName());
        Assertions.assertEquals("Testdorf2", kunde1.getAdresse());
        Assertions.assertEquals(createDate(1900, 0, 1), kunde1.getGeburtsdatum());
    }

    private Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
