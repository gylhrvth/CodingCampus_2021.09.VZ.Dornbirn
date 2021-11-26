package Stefan.DatenbankTest;

import Stefan.DatenbankTest.model.Kunde;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    public long createKunde(Kunde kunde) throws SQLException {
        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES(?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, kunde.getName());
        statement.setString(2, kunde.getAdress());
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

    public List<Kunde> readKunde() throws SQLException {
        String sql = "SELECT kundenNr, name, adresse, geburtsdatum FROM kunde";
        PreparedStatement statement = database.getConnection().prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Kunde> kunden = new ArrayList<>();

        while (resultSet.next()) {
            long kontoNr = resultSet.getLong(1);
            String name = resultSet.getString(2);
            String adresse = resultSet.getString(3);
            java.sql.Date geburtsdatum = resultSet.getDate(4);

            Kunde kunde = new Kunde(kontoNr, name, adresse, geburtsdatum);
            kunden.add(kunde);
        }

        return kunden;
    }
}
