package Eray.week4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class AufgabeSchulnoten {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        grades();
    }

    private static void grades() {
        System.out.println("Bitte geben sie eine Schulnote ein. Bitte schreiben sie die Noten zusammen (SehrGut, Gut, Befriedigend, Genügend, NichtGenügend)");
        String scannerInput = scanner.next().toLowerCase(Locale.ROOT);
        switch (scannerInput) {
            case "sehrgut" -> System.out.println("du hast die Note 1");
            case "gut" -> System.out.println("du hast die Note 2");
            case "befriedigend" -> System.out.println("du hast die Note 3");
            case "genügend" -> System.out.println("du hast die Note 4");
            case "nichtgenügend" -> System.out.println("du hast die Note 5");
        }
    }
}
