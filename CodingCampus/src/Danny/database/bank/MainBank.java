package Danny.database.bank;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

public class MainBank {

    //Kunde anlegen,löschen
    //Kunde eröffnet Konto
    //Kunde schließt Konto
    //Kunde hebt Geld ab
    //Kunde zahlt Geld ein
    //Kunde überweist auf anderes Konto
    private static Database database = new Database();


    public static void main(String[] args) throws SQLException, ParseException {

        Kunde kunde = new Kunde("Danny", "Dornbirn", "31/12/1979");
        kunde.createCustomer();

//        deleteTable("kunde", "KundenNr", 5);


    }


    public static void deleteTable(String table, String column, int rowNr) throws SQLException {
        database.connect();
        PreparedStatement statement = database.getConnection().prepareStatement("Delete from ? where ?"
                + "= ? ");
        statement.setString(1, table);
        statement.setString(2, column);
        statement.setInt(3, rowNr);
        statement.executeUpdate();
        database.disconnect();
    }
}
