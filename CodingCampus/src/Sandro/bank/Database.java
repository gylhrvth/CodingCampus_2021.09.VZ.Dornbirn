package Sandro.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;

    // Connection wird in Objekt Connection gespeichert
    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/bank2?user=root&password=DJSJcnn324!");

    }

    public Database(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        //Method
       connection = DriverManager.getConnection(url);
    }

    public void disconnect() throws SQLException {
        connection.close();
    }

}
