package Danny.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;
    private Connection connection;


    public Database() {
        this("jdbc:mysql://localhost:3306/bank2?user=root&password=Voegel79");
    }

    public Database(String url) {
        this.url = url;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);

    }

    public void disconnect() throws SQLException {
        connection.close();

    }
}