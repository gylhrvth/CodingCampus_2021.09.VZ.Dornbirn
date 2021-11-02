package Stefan.Ferienwoche;

import java.util.ArrayList;
import java.util.Scanner;

public class SpeisekarteArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> speisekarte = new ArrayList<>();
        boolean weitererDurchlauf = true;

        while (weitererDurchlauf) {
            System.out.println("Optionen für Speisekarte wählen: [Anzeigen], [Länge], [Hinzufügen], [Löschen], [KarteLöschen], [Abfrage], [Ende]");
            String eingabe = scanner.next();

            if (eingabe.equalsIgnoreCase("Anzeigen")) {
                System.out.println(speisekarte);

            } else if (eingabe.equalsIgnoreCase("Länge")) {
                System.out.println(speisekarte.size());

            } else if (eingabe.equalsIgnoreCase("Hinzufügen")) {
                System.out.println("Speise eingeben: ");
                speisekarte.add(scanner.next());

            } else if (eingabe.equalsIgnoreCase("Löschen")) {
                System.out.println("Speise eingeben: ");
                speisekarte.remove(scanner.next());

            } else if (eingabe.equalsIgnoreCase("KarteLöschen")) {
                speisekarte.clear();

            } else if (eingabe.equalsIgnoreCase("Abfrage")) {
                System.out.println("Speise eingeben: ");
                System.out.println(speisekarte.contains(scanner.next()));

            } else if (eingabe.equalsIgnoreCase("Ende")) {
                System.out.println("Programm beenden? (true/false)");
                weitererDurchlauf = scanner.nextBoolean();

            } else {
                System.out.println("Ungültiger Befehl");

            }
            System.out.println("---------------------------------------------------------------------------------");


        }


    }
}
