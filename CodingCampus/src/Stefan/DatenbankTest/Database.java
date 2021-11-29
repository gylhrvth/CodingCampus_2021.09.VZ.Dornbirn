package Stefan.DatenbankTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url;
    private Connection connection;

    public Database() {
        this("jdbc:mysql://localhost:3306/bank3test?user=root&password=%23root%231234");
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
