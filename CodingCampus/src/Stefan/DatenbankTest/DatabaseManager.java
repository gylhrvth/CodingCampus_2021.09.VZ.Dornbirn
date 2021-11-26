package Stefan.DatenbankTest;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    public long createKunde(String name, String adresse, Date geburtsdatum) throws SQLException {
        String sql = "INSERT INTO kunde(name, adresse, geburtsdatum) VALUES(?, ?, ?)";
        PreparedStatement statement = database.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, name);
        statement.setString(2, adresse);
        statement.setDate(3, new java.sql.Date(geburtsdatum.getTime()));

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
}
