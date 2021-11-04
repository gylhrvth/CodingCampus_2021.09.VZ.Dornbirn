package Stefan.WeekEight.OOPInt;


import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] zahlen = new int[10];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(100);
        }

        Daten daten = werteGesamt(zahlen);
        System.out.println(daten);
    }


    public static Daten werteGesamt(int[] zahlen) {
        int max = zahlen[0];
        int min = zahlen[0];
        double summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i]< min) min = zahlen[i];
            if (zahlen[i]> max) max = zahlen[i];
            summe += zahlen[i];
        }
        double durchschnitt = summe / zahlen.length;
        return new Daten(min, max, durchschnitt);

    }
}
