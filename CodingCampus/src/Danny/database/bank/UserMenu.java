package Danny.database.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserMenu {

    public Map<Integer, String> serviceMap = new HashMap<Integer, String>();

    public UserMenu() {
        addServiceMap();
    }

    public void addServiceMap() {
        serviceMap.put(1, " = Kunde anlegen");
        serviceMap.put(2, " = Konto anlegen");
        serviceMap.put(3, " = Geld einzahlen");
        serviceMap.put(4, " = Geld überweisen");

    }



    public String giroOrBankbook() {
        int select = selectWithScannerReturnInt("Möchten Sie ein Girokonto oder Sparbuch. " +
                "\n Geben Sie 1 = Girokonto | 2 = Sparbuch ein.");
        if (select == 1){
            return "Girokonto";
        }
        if (select == 2){
            return "Sparbuch";
        }
        return "";
    }

    public Boolean againService() {
        int select = selectWithScannerReturnInt("\nMöchten Sie einen weiteren Service. " +
                "\nGeben Sie 1 = JA | 2 = NEIN ein.");
        if (select == 2){
            return false;
        }
        return true;
    }

    public String selectWithScannerReturnString(String selectText) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(selectText);
        String scan = scanner.nextLine();
        do {
            if (scan.isEmpty()) {
                System.out.println(selectText);
                scan = scanner.nextLine();
            }
        } while (scan.isEmpty());
        return scan;
    }

    public double selectWithScannerReturnDouble(String selectText) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + selectText);
        while (!scanner.hasNextDouble()) {
            System.out.println("\n" + selectText);
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public int selectWithScannerReturnInt(String selectText) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" + selectText);
        while (!scanner.hasNextInt()) {
            System.out.println("\n" + selectText);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }


    public void showInt_StringMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> string : map.entrySet()) {
            System.out.println(string.getKey() + string.getValue());
        }
    }


    public int questionWithScannerMap(String question, Map selectionMap) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        showInt_StringMap(selectionMap);
        System.out.println("\n" + "Bitte Nummer eingeben.");
        while (!scanner.hasNextInt()) {
            System.out.println("\n" + "Bitte Nummer eingeben.");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }


}
