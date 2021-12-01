package Eray.bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private Connection connection;
    private String url;

    public DataBase(){
        this("jdbc:mysql://localhost:3306/banktest?user=root&password=5858");
    }

    public DataBase(String url){
        this.url = url;
    }


    public void connect() throws SQLException {
        connection = DriverManager.getConnection(url);
    }


    public void disconnect()throws SQLException{
        connection.close();
    }


    public Connection getConnection() {
        return connection;
    }
}
