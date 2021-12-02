package Rauan.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;
    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/bank?user=root&password=Rauan1234");
    }

    public Database(String url) {
        this.url = url;
    }

    public void connect(){
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException sqle) { // do nothing
            }
            connection = null;
        }
    }

    public Connection getConnection() {
        if (connection == null){
            connect();
        }
        return connection;
    }
}
