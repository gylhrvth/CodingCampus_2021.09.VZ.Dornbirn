package Rauan.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class DatabaseManagerTest {

    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/banktest?user=root&password=Rauan1234");
        database.connect();

        deletTable("kunde");
        deletTable("konto");
        deletTable("konto_kunde");
        deletTable("transaktion");
    }

    private void deletTable(String table) throws SQLException {
        PreparedStatement statement = database.getconnection.prepareStatement("DELETE FROM " + table);
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
            long kontoNr = databaseManager.creatKunde(new Kunde(0, "Sara", "testDorf",
                    createDate(1990, 01, 01)));
            Assertions.assertTrue(kontoNr > 0);
        } catch (SQLException exc) {
            Assertions.fail("Customer could not be created...");
        }
    }

    @Test
    public void testReadKunden() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager(database);

        long kundenNr1 = databaseManager.creatKunde(new Kunde(1, "sara",
                "Dorf", createDate(2000, 4, 4)));
        long kundenNr2 = databaseManager.creatKunde(new Kunde(1, "sara",
                "Dorf", createDate(2000, 4, 4)));
        long kundenNr3 = databaseManager.creatKunde(new Kunde(1, "sara",
                "Dorf", createDate(2000, 4, 4)));
        List<Kunde> kundes = databaseManager.readKunden();
        Assertions.assertEquals(3, kundes.size());

        Kunde kunde1 = kundes.get(0);

       Assertions.assertEquals(kundenNr1,kunde1.getKundeNr());
       Assertions.assertEquals("sara",kunde1.getName());
       Assertions.assertEquals("Dorf",kunde1.getAdresse());
       Assertions.assertEquals(createDate(2000,4,4),kunde1.getGeburtsdatum());
    }

    private Date createDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return (Date) calendar.getTime();

    }
}
