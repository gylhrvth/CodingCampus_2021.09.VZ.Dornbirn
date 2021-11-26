package Danny.database.bank;

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
            Assertions.fail("Database disconnection failed...", exc);
        }

    }

    @Test
    public void testFailedConnection() {
        Database database = new Database("jdbc:mysql://localhost:3306/bank2?user=root&password=Voegel79_FALSCH");
        try {
            database.connect();
            Assertions.fail("Database should not be connected...");
        } catch (SQLException exc) {
// success
        }
    }
}
