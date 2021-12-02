package Lena.bank.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;
    private String url;

    public Database(){
        this("jdbc:mysql://localhost:3306/bank?user=root&password=root1234");
    }

    public Database(String url){
        this.url=url;
    }

    public void connect () throws SQLException {
        connection= DriverManager.getConnection(this.url);

    }

    public void disconnect() throws SQLException {

        connection.close();

    }

    public Connection getConnection() {
        return connection;
    }
}
