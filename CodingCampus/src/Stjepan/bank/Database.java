package Stjepan.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;
    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/banktest?user=root&password=Bogihrvati1212");
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

    public Connection getConnection() {
        return connection;
    }
}

