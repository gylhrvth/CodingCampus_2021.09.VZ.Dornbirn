package Stefan.Datenbank.BankKonto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;
    private Connection connection;

    //Passwort root # = %23 (#root#1234 = %23root%231234
    public Database() {
        this("jdbc:mysql://localhost:3306/bank3test?user=root&password=%23root%231234");
    }
    public Database(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }

    public void disconnect() throws SQLException {
        connection.close();
    }
}
