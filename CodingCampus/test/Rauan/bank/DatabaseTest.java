package Rauan.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DatabaseTest {

    @Test
    public void testConnectAndDisconnect() {
        Database database = new Database();
        try {
            database.connect();
        } catch (SQLException exc) {
            Assertions.fail("Database connection failed...", exc);
        }
        try {
            database.disconnect();
        } catch (SQLException exc) {
            Assertions.fail("Database disconnect failed...", exc);
        }
    }

   @Test
   public void testFailedConnection() throws SQLException {
       Database database = new Database("jdbc:mysql://localhost:3306/bank?user=root&password=asdf");
       try {
           database.connect();
           Assertions.fail("Database should not be connected...");
        } catch(SQLException exc) {

        }
   }
}
