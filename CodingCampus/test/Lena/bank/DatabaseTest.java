package Lena.bank;

import Lena.bank.database.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {

    @Test

    public  void testConnectAndDisconnect(){
        Database database = new Database("jdbc:mysql://localhost:3306/banktest?user=root&password=root1234");

        try {
            database.connect();
        }catch (SQLException sqlException){
            Assertions.fail("Database connection failed...", sqlException);
        }

        try{
            database.disconnect();
        }catch (SQLException sqlException){
            Assertions.fail("Database disconnection failed...", sqlException);
        }
    }

    @Test
    public  void testConnectAndDisconnect2(){
        Database database = new Database("jdbc:mysql://localhost:3306/bank?user=root&password=blablabla");

        try {
            database.connect();
            Assertions.fail("Database should not be connected");
        }catch (SQLException sqlException){
           //success;
        }

    }

}
