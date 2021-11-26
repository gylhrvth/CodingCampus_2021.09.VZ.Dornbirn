package Rauan.bank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DatabaseManager {
    private Database database;

    public DatabaseManager (Database database){
        this.database=database;
    }
    public long creatKunde(String name, String adresse, Date geburtsdatum) throws SQLException {
        String sql = "Insert into kunde (Name , Adresse, Geburtsdatum) Values(?, ?, ?)...!";
        PreparedStatement statement = database.getconnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, name);
        statement.setString(2, adresse);
        statement.setString(3, String.valueOf(new java.sql.Date(geburtsdatum.getTime())));

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
