package Eray.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseManager {
    private String query = "jdbc:mysql://localhost:3306/banktest?user=root&password=5858";
    private DataBase dataBase;

    public DataBaseManager() {
        dataBase = new DataBase(query);
    }

    public void connectDataBase() throws SQLException {
        dataBase.connect();
    }

    public Connection getConnection(){
        return dataBase.getConnection();
    }

    public void deleteTable(String table) throws SQLException {
        PreparedStatement statement = dataBase.getConnection().prepareStatement("DELETE FROM " + table);
        statement.executeUpdate();
    }

    public void tearDown() throws SQLException {
        dataBase.disconnect();
    }


}
