package Danny.database.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public String url = "jdbc:mysql://localhost:3306/bank2?user=root&password=Voegel79";
    private Connection connection = null;

    public Database() {
    }

    public Database(String url) {
        this.url = url;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null) {
            System.out.println("Create Connection\n");
            connection = DriverManager.getConnection(url);
        }
        return connection;
    }

//    public void connection()

    public void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
            System.out.println("\nClose Connection");
        }
    }


}
