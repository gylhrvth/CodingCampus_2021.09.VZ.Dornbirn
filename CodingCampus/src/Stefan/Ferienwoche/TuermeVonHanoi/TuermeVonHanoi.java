package Stefan.Ferienwoche.TuermeVonHanoi;

import java.util.Scanner;

public class TuermeVonHanoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Scheiben ein: ");
        int n = scan.nextInt();
        scan.close();
        turmversetzen(n, "links", "rechts", "mitte");
        System.out.println("_______________________________________");
        System.out.println("Schritte: " + schritte);
    }

    static long schritte;

    static void ausgabe(int n, String von, String nach) {
        System.out.printf("Scheibe %d von %s nach %s%n", n, von, nach);
    }

    static void turmversetzen(int n, String links, String mitte, String rechts) {
        if (n > 1) {
            turmversetzen(n - 1, links, rechts, mitte);
            ausgabe(n, links, rechts);
            turmversetzen(n - 1, mitte, links, rechts);
        } else ausgabe(n, links, rechts);
        schritte++;
    }


}
