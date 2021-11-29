package Mahir.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;
    public void conect() throws SQLException {
        connection = DriverManager.getConnection("jdbc://localhost:3306/bank?user=root&password=Mahirmahir0");
    }

    public void disconect() throws SQLException {
        connection.close();
    }
}
