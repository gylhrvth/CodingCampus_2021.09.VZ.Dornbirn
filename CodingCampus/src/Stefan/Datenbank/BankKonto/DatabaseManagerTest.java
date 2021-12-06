package Stefan.Datenbank.BankKonto;


import org.junit.jupiter.api.Assertions;

import java.sql.*;
import java.util.Calendar;
import java.util.Date;

public class DatabaseManagerTest {

    private Database database;
    private DatabaseManager databaseManager;

    public DatabaseManagerTest(Database database) {
        this.database = database;
        this.databaseManager = new DatabaseManager(database);
    }

    public void insertTransaktion() throws SQLException {
        DatabaseManagerTest databaseManagerTest = new DatabaseManagerTest(database);
        databaseManagerTest.executeTransaktion(new Transaktion(0, 500, createDate(2021,12,1), 8, 9));
    }


    public boolean executeTransaktion(Transaktion transaktion) throws SQLException {
        long transaktionId = createTransaktion(transaktion);

        if(transaktionId == 0) {
            return false;
        }

        if(transaktion.getQuelle_kontoNr_fk() != 0){
            //Quellkonto aktualisieren
            //Konto holen betrag abziehen und konto aktualisieren
            Konto quellkonto = databaseManager.readKonto(transaktion.getQuelle_kontoNr_fk());
            if(quellkonto == null) {
                return false;
            }
            quellkonto.setKontostand(quellkonto.getKontostand() - transaktion.getBetrag());



        }
        if(transaktion.getZiel_kontoNr_fk() != 0) {
            //Zielkonto aktualisieren
            //Konto holen betrag hinzufügen und konto aktualisieren

            Konto zielkonto = databaseManager.readKonto(transaktion.getZiel_kontoNr_fk());
            if (zielkonto == null) {
                return false;
            }
            zielkonto.setKontostand(zielkonto.getKontostand() + transaktion.getBetrag());


        }
        return true;
    }

    private void updateTransaktion() {

    }


    public long createTransaktion(Transaktion transaktion) throws SQLException {

        String sql = "INSERT INTO transaktion(betrag, zeitstempel, quelle_kontoNr_fk, ziel_kontoNr_fk) VALUES(?, ?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setDouble(1, transaktion.getBetrag());
        statement.setDate(2, new java.sql.Date(transaktion.getZeitstempel().getTime()));
        statement.setInt(3, transaktion.getQuelle_kontoNr_fk());
        statement.setInt(4, transaktion.getZiel_kontoNr_fk());

        int rows = statement.executeUpdate();
        if (rows > 0) {
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                return  resultSet.getLong(1);
            } else {
                return 0;
            }
        } else {
            return 0;
        }

    }

    private Date createDate(int year, int month, int day) {
        Calendar calender = Calendar.getInstance();
        calender.set(year,month,day,0,0,0);
        return calender.getTime();

    }
}
