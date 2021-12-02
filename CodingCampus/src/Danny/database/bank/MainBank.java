package Danny.database.bank;

import java.sql.SQLException;
import java.text.ParseException;

public class MainBank {

    //Kunde anlegen,löschen
    //Kunde eröffnet Konto
    //Kunde schließt Konto
    //Kunde hebt Geld ab
    //Kunde zahlt Geld ein
    //Kunde überweist auf anderes Konto


    public static void main(String[] args) throws SQLException, ParseException {

        Database database = new Database();
        database.getConnection();
        DatabaseComunication databaseComunication = new DatabaseComunication(database);

        UserMenu userMenu = new UserMenu();
        userMenu.addServiceMap();
        Kunde currentCustomer;
        Boolean again = true;


        while (again) {
            int selection = userMenu.questionWithScannerMap("Was können wir für Sie tun?\n", userMenu.serviceMap);
            if (selection == 1) {
                // Kunde anlegen Datum so eingeben "dd/MM/yyyy"
                databaseComunication.addCustomerTable(
                        new Kunde(userMenu.selectWithScannerReturnString("Geben Sie Ihren Namen ein."),
                                userMenu.selectWithScannerReturnString("Geben Sie Ihre Adresse ein."),
                                userMenu.selectWithScannerReturnString("Geben Sie Ihr Geburtsdatum ein. " +
                                        "\nHinweis: Datum so eingeben dd/MM/yyyy ")));
                again = userMenu.againService();
            }
            if (selection == 2) {
                // Konto anlegen
                databaseComunication.readPrintCustomerTabel();
                databaseComunication.addKontoTable(
                        new Konto(userMenu.giroOrBankbook()),
                        userMenu.selectWithScannerReturnInt("Geben Sie Ihre KundenNr ein."));
                again = userMenu.againService();
            }
            if (selection == 3) {
                // Geld einzahlen
                databaseComunication.readPrintCustomerTabel();
                int kundenNr = userMenu.selectWithScannerReturnInt("Geben Sie Ihre KundenNr ein.");
                databaseComunication.readPrintKundeAndKonto(kundenNr);
                databaseComunication.changeKonto(userMenu.selectWithScannerReturnInt(
                                "Auf welches Konto wollen Sie einzahlen?\nBitte KontoNr eingeben."),
                        userMenu.selectWithScannerReturnDouble("Welchen Betrag wollen Sie einzahlen?"));
                System.out.println("Der Betrag wurde eingezahlt.");
                databaseComunication.readPrintKundeAndKonto(kundenNr);
                again = userMenu.againService();
            }
            if (selection == 4) {
                // Geld überweisen
                databaseComunication.readPrintCustomerTabel();
                int kundenNr = userMenu.selectWithScannerReturnInt("Geben Sie Ihre KundenNr ein.");
                databaseComunication.readPrintKundeAndKonto(
                        kundenNr);
                int targetKundenNr = userMenu.selectWithScannerReturnInt("Geben Sie die Ziel KundenNr ein.");
                databaseComunication.readPrintKundeAndKonto(targetKundenNr);
                double betrag = userMenu.selectWithScannerReturnDouble("Welchen Betrag wollen Sie überweisen?");
                databaseComunication.addTransaktionTable(new Transaktion(betrag,
                        userMenu.selectWithScannerReturnInt("Geben Sie die Quell KontoNr ein."),
                        userMenu.selectWithScannerReturnInt("Geben Sie die Ziel KontoNr ein.")));
                System.out.println("\nDer Betrag wurde überwiesen.");
                databaseComunication.readPrintKundeAndKonto(kundenNr);
                databaseComunication.readPrintKundeAndKonto(targetKundenNr);
                again = userMenu.againService();
            }
        }
        database.disconnect();
    }
}
