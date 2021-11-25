package Danny.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;


    public void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank2?user=root&password=root");

    }

    public void disconnect() throws SQLException {
        connection.close();

    }
}
