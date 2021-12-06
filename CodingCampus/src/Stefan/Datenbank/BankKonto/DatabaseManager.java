package Stefan.Datenbank.BankKonto;

import org.junit.jupiter.api.Assertions;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class DatabaseManager {
    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    //Kunde mit Konto verbinden
    public void insertKundeZuKonto() throws SQLException {

        DatabaseManager databaseManager = new DatabaseManager(database);
        databaseManager.createKundeZuKonto(new Konto_Kunde(77,12, "Besitzer"));
    }

    public void createKundeZuKonto(Konto_Kunde konto_kunde) throws SQLException {
        String sql = "INSERT INTO konto_kunde(kundenNr_fk, kontoNr_fk, rolle) VALUES(?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);

        statement.setInt(1, konto_kunde.getKundenNr_fk());
        statement.setInt(2,konto_kunde.getKontoNr_fk());
        statement.setString(3,konto_kunde.getRolle());

    }

    //Auslesen Kunde mit Kontonummer
    public void readKontoKunde() throws SQLException {
        String sql = "select * from kunde\n" +
                "join konto_kunde on kundenNr_fk = kundenNr\n" +
                "join konto on kontoNr_fk = kontoNr";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String adresse = resultSet.getString("adresse");
            java.sql.Date geburtsdatum = resultSet.getDate("geburtsdatum");
            int kontoNr_fk = resultSet.getInt("kontoNr");
            double kontostand = resultSet.getDouble("kontostand");
            String name1 = resultSet.getString("konto.name");

            System.out.printf("Name: %s\nAdresse: %s\nGebDat: %s\nKontoNr: %s\nKontoSt: %s Euro\nKontoName: %s\n", name, adresse, geburtsdatum, kontoNr_fk, kontostand, name1);
            System.out.println();
        }
    }




    //Kunden erstellen
    public void insertKunde() throws SQLException {
//        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM kunde");
//        statement.executeUpdate();
        DatabaseManager databaseManager = new DatabaseManager(database);
        try {
            long kundenNr = databaseManager.createKunde(new Kunde(0,"Karlheinz Möser","Klientelweg 73", createDate(1920,10,13)));
            Assertions.assertTrue(kundenNr > 0);
        } catch (SQLException exc) {
            Assertions.fail("Customer could not be created ...", exc);
        }
    }


    public long createKunde(Kunde kunde) throws SQLException {
        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES(?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, kunde.getName());
        statement.setString(2, kunde.getAdresse());
        statement.setDate(3, new java.sql.Date(kunde.getGeburtsdatum().getTime()));

        int rows = statement.executeUpdate();
        if (rows > 0) {
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    //Kunden Auflisten
    public List<Kunde> readKunde() throws SQLException {
        String sql = "SELECT kundenNr, name, adresse, geburtsdatum FROM kunde";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Kunde> kunden1 = new ArrayList<>();

        while (resultSet.next()) {
            int kundenNr = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String adresse = resultSet.getString(3);
            java.sql.Date geburtsdatum = resultSet.getDate(4);

            Kunde kunde = new Kunde(kundenNr, name, adresse, geburtsdatum);
            kunden1.add(kunde);
        }
        return kunden1;
    }

    //Konto erstellen
    public void insertKonto() throws SQLException {
//        PreparedStatement statement = database.getConnection().prepareStatement("DELETE FROM konto");
//        statement.executeUpdate();
        DatabaseManager databaseManager = new DatabaseManager(database);
        try {
            long kontoNr = databaseManager.createKonto((new Konto(0,2500,"Gehaltskonto")));
            Assertions.assertTrue(kontoNr > 0);
        } catch (SQLException exc) {
            Assertions.fail("Konto could not be created ...", exc);
        }

    }

    public long createKonto(Konto konto) throws SQLException {
        String sql = "INSERT INTO konto(kontostand, name) VALUES(?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        statement.setDouble(1, konto.getKontostand());
        statement.setString(2, konto.getName());

        int rows = statement.executeUpdate();
        if (rows > 0) {
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getLong(1);
            } else {
                return 0;
            }
        } return 0;
    }

    //Konten auflisten
    public List<Konto> readKonto() throws SQLException {
        String sql = "SELECT kontoNr, kontostand, name FROM konto";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Konto> kontos = new ArrayList<>();

        while (resultSet.next()) {
            int kontoNr = resultSet.getInt(1);
            int kontostand = resultSet.getInt(2);
            String name = resultSet.getString(3);

            Konto konto = new Konto(kontoNr, kontostand, name);
            kontos.add(konto);
        }
        return kontos;
    }

    public Konto readKonto(int kontoNr) throws SQLException {
        String sql = "SELECT kontoNr, kontostand, name FROM konto WHERE kontoNr = ?";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        statement.setInt(1, kontoNr);
        ResultSet resultSet = statement.executeQuery();

        if(resultSet.next()) {
            int kontostand = resultSet.getInt(2);
            String name = resultSet.getString(3);

            Konto konto = new Konto(kontoNr, kontostand, name);
            return konto;
        } else {
            return null;
        }
    }

    private Date createDate(int year, int month, int day) {
        Calendar calender = Calendar.getInstance();
        calender.set(year,month,day,0,0,0);
        return calender.getTime();

    }
}
