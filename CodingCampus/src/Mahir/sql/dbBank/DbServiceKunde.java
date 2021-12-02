package Mahir.sql.dbBank;

import Mahir.sql.model.Kunde;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DbServiceKunde {
    private Database database;

    public DbServiceKunde(Database database) {
        this.database = database;
    }

    long createKunde(String name, String adresse, Date geburtsdatum) throws SQLException {

        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES (?, ?, ?);";

        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, name);
        statement.setString(2, adresse);

        java.sql.Date sqlDate = new java.sql.Date(geburtsdatum.getTime());

        statement.setDate(3, sqlDate);

        ResultSet resultSet = statement.getGeneratedKeys();

        long kundenNr = 0;
        if (resultSet.next()) {
            kundenNr = resultSet.getLong(1);
        }
        return kundenNr;
    }
    private List<Kunde> queryKunden(String whereClause) throws SQLException {
        String query = "SELECT kundenNr, adresse, geburtsdatum, name FROM kunde " + whereClause + ";";
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

    java.sql.Date getCalendarDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        java.util.Date date = calendar.getTime();
        return new java.sql.Date(date.getTime());
    }

}
