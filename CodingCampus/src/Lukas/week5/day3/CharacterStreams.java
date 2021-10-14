package Lukas.week5.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterStreams {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        /*
         * Wir lesen die Datei Zeile für Zeile ein und geben jede Zeile direkt aus.
         */
        try {
            //File mit angegebenem Pfad erstellen
            File file = new File("assets/file.txt");
            //Neuen Scanner erstellen welcher das File für den Input verwendet
            Scanner scanner = new Scanner(file);
            //Solange der Scanner nächste Zeile hat...
            while (scanner.hasNextLine()) {
                //...lesen wir diese ein...
                String line = scanner.nextLine();
                //...und geben sie aus
                System.out.println(line);
            }
            //Scanner schließen nicht vergessen
            scanner.close();
        } catch (FileNotFoundException exc) {
            //Wird die Datei nicht gefunden, so wirft der Konstruktor von Scanner (new Scanner(file)) eine Ausnahme.
            //Diese müssen wir abfangen (catch)! Und hier geben wir den Stacktrace aus.
            exc.printStackTrace();
        }

        long durationDirectOutput = System.currentTimeMillis() - start;

        /*
         * Wir lesen den gesamten Text in eine String Variable, Achtung, ineffizient!!! und geben diese dann aus.
         * Zusätzlich machen wir noch einen Regbert kniff!!!
         */
        start = System.currentTimeMillis();
        try {
            File file = new File("assets/file.txt");
            Scanner scanner = new Scanner(file);
            String text = "";
            while (scanner.hasNextLine()) {
                text += scanner.nextLine();
                //text += "\n";
                text += System.lineSeparator();
            }
            scanner.close();
            text = text.replaceAll("Wikipedia", "CodingCampus");
            System.out.println(text);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        long durationStringConcatenation = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();

        /*
         * Wir lesen den gesamten Text in verwenden aber nicht mehr String Konkatenation sondern einen StringBuilder.
         * Mit der Instanzmethode .toString() der StringBuilder Instanz erhalten wir einen String.
         * Zusätzlich machen wir noch einen Regbert kniff!!!
         */
        try {
            File file = new File("assets/file.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb
                        .append(scanner.nextLine())
                        .append(System.lineSeparator());
            }
            scanner.close();
            String text = sb.toString().replaceAll("Wikipedia", "CodingCampus");
            System.out.println(text);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }

        long durationStringBuilder = System.currentTimeMillis() - start;

        System.out.printf("Duration direct Output [%dms]\n", durationDirectOutput);
        System.out.printf("Duration String concatenation [%dms]\n", durationStringConcatenation);
        System.out.printf("Duration String builder [%dms]\n", durationStringBuilder);
    }
}
