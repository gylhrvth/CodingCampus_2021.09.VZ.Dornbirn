package Rauan.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public Connection getconnection;
    private String url;
    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/bank?user=root&password=Rauan1234");
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
