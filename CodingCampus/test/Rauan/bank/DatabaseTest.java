package Rauan.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {

    @Test
    public void testConnectAndDisconnect() {
        Database database = new Database();
        database.connect();
        database.disconnect();
    }

   @Test
   public void testFailedConnection() throws SQLException {
       Database database = new Database("jdbc:mysql://localhost:3306/bank?user=root&password=asdf");
       database.connect();
   }
}
