package Mahir;

import Mahir.sql.bank.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {
    @Test
    public void testConnectionAndDisconnection(){
        Database database= new Database();
        try {
            database.connect();
        }catch(SQLException exc){
            Assertions.fail("Database connection faild...", exc);
        }

        try {
            database.disconnect();
        } catch(SQLException exc) {
            Assertions.fail("Database disconnect failed...", exc);
        }

    }


}
