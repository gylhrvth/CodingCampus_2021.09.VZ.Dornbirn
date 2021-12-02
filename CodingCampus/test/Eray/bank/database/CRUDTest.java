package Eray.bank.database;

import Eray.bank.DataBase;
import Eray.bank.Kunde;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CRUDTest {
    private DataBase dataBase;

    @BeforeEach
    public void setUp() throws SQLException {
        dataBase = new DataBase("jdbc:mysql://localhost:3306/banktest?user=root&password=5858");
        dataBase.connect();

        deleteTable("kunde");
        deleteTable("konto");
        deleteTable("konto_kunde");
        deleteTable("transaktion");
    }

    private void deleteTable(String table) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("DELETE FROM " + table);
        statement.executeUpdate();
    }

    @AfterEach
    public void tearDown() throws SQLException {
        dataBase.disconnect();
    }

    private long createKunde(String name, String adresse, Date geburtsdatum) throws SQLException {

        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

        PreparedStatement statement = dataBase.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
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
            Assertions.fail("No primary Key returned...");
        }
        return kundenNr;
    }

    private List<Kunde> queryKunden() throws SQLException {
        String query = "SELECT kundenNr, name, adresse, geburtsdatum FROM kunde";
        PreparedStatement statement = dataBase.getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        List<Kunde> kunden = new ArrayList<>();
        while (resultSet.next()) {
            long querriedKundenNr = resultSet.getLong(1);
            String name = resultSet.getString(2);
            String adresse = resultSet.getString(3);
            java.sql.Date geburtsdatum = resultSet.getDate(4);

            Kunde kunde = new Kunde(querriedKundenNr, name, adresse, new Date(geburtsdatum.getTime()));
            kunden.add(kunde);

        }
        return kunden;
    }

    @Test
    public void testInsertAndSelect() {
        Connection connection = dataBase.getConnection();
        try {

            Calendar calendar = Calendar.getInstance();
            calendar.set(2018, 0, 1, 0, 0, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            long kundenNr = createKunde("Alfons", "Nüziders", calendar.getTime());

            List<Kunde> kunden = queryKunden();
            Assertions.assertEquals(1, kunden.size());

            Assertions.assertEquals(kundenNr, kunden.get(0).getKundenNr());
            Assertions.assertEquals("Nüziders", kunden.get(0).getAdresse());
            Assertions.assertEquals(calendar.getTime(), kunden.get(0).getGeburtsdatum());
            Assertions.assertEquals("Alfons", kunden.get(0).getName());



        } catch (SQLException exc) {
            Assertions.fail("Could not put Kunde", exc);
        }
    }


}
