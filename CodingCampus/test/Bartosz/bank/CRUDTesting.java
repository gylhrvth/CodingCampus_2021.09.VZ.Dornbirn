package Bartosz.bank;

import Bartosz.bank.model.Kunde;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CRUDTesting {
    private Database database;

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank2test?user=root&password=Eka1Re15.");
        database.connect();

        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("kunde");
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

    private long createKunde(String name, String adresse, Date geburtsdatum) throws SQLException {
        String sql = "INSERT INTO kunde(name, addresse, geburtsdatum) VALUES (?, ?, ?);";

        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, name);
        statement.setString(2, adresse);

        java.sql.Date sqlDate = new java.sql.Date(geburtsdatum.getTime());

        statement.setDate(3, sqlDate);

        int rows = statement.executeUpdate();

        Assertions.assertEquals(1, rows);

        ResultSet resultSet = statement.getGeneratedKeys();

        long kundenNr = 0;
        if (resultSet.next()) {
            kundenNr = resultSet.getLong(1);
            Assertions.assertTrue(kundenNr > 0);
        } else {
            Assertions.fail("No primary key returned...");
        }
        return kundenNr;
    }

    private List<Kunde> queryKunden(String whereClause) throws SQLException {
        String query = "SELECT kundenNr, addresse, geburtsdatum, name FROM kunde " + whereClause + ";";
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        List<Kunde> kunden = new ArrayList<>();
        while (resultSet.next()) {
            long queriedKundenNr = resultSet.getLong(1);
            String adresse = resultSet.getString(2);
            java.sql.Date geburtsdatum = resultSet.getDate(3);
            String name = resultSet.getString(4);

            Kunde kunde = new Kunde(queriedKundenNr, name, adresse, new Date(geburtsdatum.getTime()));
            kunden.add(kunde);
        }
        return kunden;
    }

    private Date getCalendarDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    @Test
    public void testInsertAndSelect() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 0, 1, 0, 0, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            long kundenNr = createKunde("Alfons", "Nüziders", calendar.getTime());

            List<Kunde> kunden = queryKunden("");

            Assertions.assertEquals(1, kunden.size());
            Assertions.assertEquals(kundenNr, kunden.get(0).getKundenNr());
            Assertions.assertEquals("Nüziders", kunden.get(0).getAdresse());
            Assertions.assertEquals(calendar.getTime(), kunden.get(0).getGeburtsdatum());
            Assertions.assertEquals("Alfons", kunden.get(0).getName());

            for (int i = 0; i < 10; i++) {
                createKunde("Peter" + i, "Bregenzerwald Löwenzahstraße", getCalendarDate(1990, 2, 3));
            }

            kunden = queryKunden("");
            Assertions.assertEquals(11, kunden.size());

            for (int i = 1; i < kunden.size(); i++) {
                Assertions.assertEquals("Bregenzerwald Löwenzahstraße", kunden.get(i).getAdresse());
                Assertions.assertEquals(getCalendarDate(1990, 2, 3), kunden.get(i).getGeburtsdatum());
                Assertions.assertEquals("Peter" + (i - 1), kunden.get(i).getName());
            }

            kunden = queryKunden(" WHERE name like 'P%ter%'");
            Assertions.assertEquals(10, kunden.size());
        } catch (SQLException exc) {
            Assertions.fail("Could not insert kunde", exc);
        }
    }
}
