package Danny.database.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUIDTest {
    public Database database;

    public CRUIDTest() {
    }

    @BeforeEach
    public void setUp() throws SQLException {
        database = new Database("jdbc:mysql://localhost:3306/bank2?user=root&password=Voegel79");
        database.getConnection();

        deleteTabele("kunde");
        deleteTabele("konto");
        deleteTabele("konto_kunde");
        deleteTabele("transaktion");
    }

    private void deleteTabele(String table) throws SQLException {
        PreparedStatement statement = database.getConnection().prepareStatement("Delete from " + table);
        statement.executeUpdate();
    }


    @AfterEach
    public void tearDown() throws SQLException {
        database.disconnect();
    }

    @Test
    public void testInsertAndSelect() throws SQLException{}

}
