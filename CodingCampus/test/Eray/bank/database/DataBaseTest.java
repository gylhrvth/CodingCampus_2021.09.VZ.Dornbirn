package Eray.bank.database;

import Eray.bank.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DataBaseTest {
    @Test
    public void testConnectAndDisconnect() {
        DataBase database = new DataBase("jdbc:mysql://localhost:3306/bank?user=root&password=5858");

        try {
            database.connect();
        } catch (SQLException exc) {
            Assertions.fail("Data Base connection failed", exc);
        }

        try {
            database.disconnect();
        } catch (SQLException exc) {
            Assertions.fail("Data Base disconnect failed", exc);
        }
    }

    @Test
    public void failedTestConnectAndDisconnect(){
        DataBase dataBase = new DataBase("jdbc:mysql://localhost:3306/bank?user=root&password=asddf");
        try {
            dataBase.connect();
            Assertions.fail("DataBase should not be connected......");
        }catch (SQLException exc){
           //success
        }
    }
}
