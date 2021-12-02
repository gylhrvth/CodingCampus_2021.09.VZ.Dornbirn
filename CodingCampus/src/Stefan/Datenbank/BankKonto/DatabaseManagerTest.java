package Stefan.Datenbank.BankKonto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManagerTest {

    private Database database;

    public DatabaseManagerTest(Database database) {
        this.database = database;
    }

    public long inserCreateKunde(Kunde kunde) throws SQLException {
        DatabaseManagerTest databaseManagerTest = new DatabaseManagerTest(database);


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
}
