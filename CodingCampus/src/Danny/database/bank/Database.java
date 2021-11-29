package Danny.database.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public String url = "jdbc:mysql://localhost:3306/bank2?user=root&password=Voegel79";
    private Connection connection;

    public Database() {}

    public Database(String url) {this.url = url;}

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(this.url);
    }

    public void disconnect() throws SQLException {
        connection.close();
    }


}
