package Danny.bank;

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
}
