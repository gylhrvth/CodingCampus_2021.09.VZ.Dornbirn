package Mahir;

import Mahir.sql.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {
    @Test
    public void testConnectionAndDisconnection(){
        Database database= new Database();
        try {
            database.conect();
        }catch(SQLException exc){
            Assertions.fail("Database connection faild...", exc);
        }

    }


}
