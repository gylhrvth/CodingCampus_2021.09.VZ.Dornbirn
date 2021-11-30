package Danny.database.bank;

import java.sql.*;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class DatabaseComunication {
    private Database database;

    public DatabaseComunication(Database database) {
        this.database = database;
    }

    public void changeKonto(int kontoNr, double betrag) throws SQLException {
        String query = "select konto.KontoNr, konto.Kontostand from konto\n" +
                "where konto.KontoNr like '" + kontoNr + "'";
        PreparedStatement statement = database.getConnection().prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        double kontostand = 0;
        if (resultSet.next()) {
            kontostand = resultSet.getDouble(2);
        }
        statement.close();
        kontostand += betrag;
        String sql = "UPDATE konto set konto.Kontostand = " + kontostand +  " where KontoNr = '" + kontoNr + "'";
        PreparedStatement statementKonto = database.getConnection().prepareStatement(sql);
        statementKonto.executeUpdate();
        statementKonto.close();
    }

    public void readPrintKundeAndKonto(int kundenNr) throws SQLException {
        String query = "select KundenNr, kunde.Name, konto.KontoNr, konto_kunde.rolle, konto.Kontostand, konto.Name from kunde\n" +
                "inner join konto_kunde on kunde.KundenNr = konto_kunde.KundenNr_fk\n" +
                "inner join konto on konto_kunde.KontoNr_fk = konto.KontoNr\n" +
                "where KundenNr like '" + kundenNr + "'";
        PreparedStatement statement = database.getConnection().prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
        do {
            kundenNr = (int) resultSet.getLong(1);
            String nameKunde = resultSet.getString(2);
            int kontoNr = (int) resultSet.getLong(3);
            String rolle = resultSet.getString(4);
            double kontostand = resultSet.getDouble(5);
            String nameKonto = resultSet.getString(6);
            System.out.printf("\n| KundenNR: %4d | Name: %15s | KontoNr: %6d | Rolle: %6s |\n| Kontostand: %.2f € | NameKonto: %8s |\n",kundenNr,nameKunde,kontoNr,rolle,kontostand,nameKonto) ;
        }while (resultSet.next());
        }
        statement.close();
    }

    public void addCustomerTable(Kunde kunde) throws SQLException {
        String sql = "INSERT INTO kunde(name, adresse, Gebdatum) VALUES (?,?,?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, kunde.getName());
        statement.setString(2, kunde.getAdresse());
        java.sql.Date sqlDate = new java.sql.Date(kunde.getGebDatumDate().getTime());
        statement.setDate(3, sqlDate);
        int kundenNr = 0;
        int rows = statement.executeUpdate();
        if (rows > 0) {
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                kundenNr = (int) resultSet.getLong(1);
            }
            resultSet.close();
        }
        statement.close();
        kunde.setKundenNr(kundenNr);
    }

    public void addKontoTable(Konto konto, int kundenNr) throws SQLException {
        String sql = "INSERT INTO konto(Kontostand,Name) VALUES (?,?)";
        PreparedStatement statementKonto = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statementKonto.setDouble(1, konto.getKontoStand());
        statementKonto.setString(2, String.valueOf(konto.getName()));
        long kontoNr = 0;
        int rows = statementKonto.executeUpdate();
        if (rows > 0) {
            ResultSet resultSet = statementKonto.getGeneratedKeys();
            if (resultSet.next()) {
                kontoNr = resultSet.getLong(1);
            }
            resultSet.close();
        }
        statementKonto.close();
        String sqlKonto_kunde = "INSERT INTO konto_kunde(KundenNr_fk,KontoNr_fk,rolle) VALUES (?,?,?)";
        PreparedStatement statementKonto_kunde = database.getConnection().prepareStatement(sqlKonto_kunde);
        statementKonto_kunde.setInt(1, kundenNr);
        statementKonto_kunde.setInt(2, (int) kontoNr);
        statementKonto_kunde.setString(3, "Besitzer");
        statementKonto_kunde.executeUpdate();
    }

    public void addTransaktionTable(Transaktion transaktion) throws SQLException {
        Connection connection = database.getConnection();
        String sql = "INSERT INTO transaktion(betrag, zeitstempel, quelle_kontoNr_fk, ziel_kontoNr_fk) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, transaktion.getBetrag());
        Calendar calendar = new GregorianCalendar();
        java.util.Date date = calendar.getTime();
        java.sql.Timestamp sqlDate = new java.sql.Timestamp(date.getTime());
        statement.setTimestamp(2, sqlDate);
        statement.setInt(3, transaktion.getQuelleKontoNr());
        statement.setInt(4, transaktion.getZielKontoNr());
        statement.executeUpdate();
        changeKonto(transaktion.getQuelleKontoNr(), transaktion.getBetrag() * -1);
        changeKonto(transaktion.getZielKontoNr(), transaktion.getBetrag());
    }

    public void readPrintCustomerTabel() throws SQLException, ParseException {
        Connection connection = database.getConnection();
        List<Kunde> kundenList = new LinkedList<>();
        String query = "SELECT kundenNr, name, adresse, Gebdatum from kunde";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int kundenNr = (int) resultSet.getLong(1);
            String name = resultSet.getString(2);
            String adresse = resultSet.getString(3);
            Date geburtsdatum = resultSet.getDate(4);

            Kunde listKunde = new Kunde(kundenNr, name, adresse, geburtsdatum);
            kundenList.add(listKunde);
        }
        System.out.println();
        for (Kunde kunde : kundenList) {
            System.out.println(kunde);
        }
    }

    public void printCustomerList(List<Kunde> kundenList) {
        for (Kunde kunde : kundenList) {
            System.out.println(kunde);
        }
    }

    public void readPrintKontoTabel() throws SQLException, ParseException {
        Connection connection = database.getConnection();
        List<Konto> kontoList = new LinkedList<>();
        String query = "SELECT kontoNr, kontostand, name from konto";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int kontoNr = (int) resultSet.getLong(1);
            double kontostand = resultSet.getDouble(2);
            String name = resultSet.getString(3);

            Konto listKonto = new Konto(kontoNr, kontostand, name);
            kontoList.add(listKonto);
        }
        for (Konto konto : kontoList) {
            System.out.println(konto);
        }
    }

    public void printKontoList(List<Konto> kontoList) {
        for (Konto konto : kontoList) {
            System.out.println(konto);
        }
    }

    public List readTransaktionTabel() throws SQLException, ParseException {
        Connection connection = database.getConnection();
        List<Transaktion> transList = new LinkedList<>();
        String query = "SELECT transaktionsNr,betrag,zeitstempel,quelle_kontoNr_fk,ziel_kontoNr_fk from transaktion";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            long transaktionsNr = resultSet.getLong(1);
            double betrag = resultSet.getDouble(2);
            Timestamp zeitstempel = resultSet.getTimestamp(3);
            int quelle_kontoNr_fk = resultSet.getInt(4);
            int ziel_kontoNr_fk = resultSet.getInt(5);

            Transaktion transaktion = new Transaktion(transaktionsNr, betrag, zeitstempel, quelle_kontoNr_fk, ziel_kontoNr_fk);
            transList.add(transaktion);
        }
        return transList;
    }

    public void printTransaktionList(List<Transaktion> transList) {
        for (Transaktion transaktion : transList) {
            System.out.println(transaktion);
        }
    }

}
