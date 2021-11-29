package Stefan.Datenbank.BankKonto;

import java.sql.*;

public class BankKontoMain {

    public static void main(String[] args) throws SQLException {
        Database database = new Database();
        DatabaseManager dbManager = new DatabaseManager(database);

        database.connect();
//        dbManager.insertKunde();
        System.out.println(dbManager.readKunde());

//        dbManager.insertKonto();
        System.out.println(dbManager.readKonto());


    }
}
