package Danny.database.bank;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class TestStart {



    public void testHistory() throws SQLException {

        CRUIDTestKunde cruidTestKunde  = new CRUIDTestKunde ();
        CRUIDTestKonto cruidTestKonto = new CRUIDTestKonto();
        CRUIDTestTransaktion cruidTestTransaktion = new CRUIDTestTransaktion();

        List<CRUIDTest> cruidTests = new LinkedList<>();
        cruidTests.add(cruidTestKunde);
        cruidTests.add(cruidTestKonto);
        cruidTests.add(cruidTestTransaktion);

        for (CRUIDTest test: cruidTests) {
            test.setUp();
            test.testInsertAndSelect();
            test.tearDown();
        }

        DatabaseTest databaseTest = new DatabaseTest();
        databaseTest.testConnectAndDisconnect();
        databaseTest.testFailedConnection();

    }





}
