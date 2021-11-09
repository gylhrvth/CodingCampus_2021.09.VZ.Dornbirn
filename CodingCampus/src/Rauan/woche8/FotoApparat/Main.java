package Rauan.woche8.FotoApparat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { printAll();}

    private static Scanner scanner = new Scanner(System.in);

    public static void printAll() {
        boolean takingFotos = true;
        FotoApparat fotoApparat = new FotoApparat("EOS", "CAnon", 20.1);
        int photoCounter = 0;
        while (takingFotos) {
            printPhotoMenuHead();
            int input =scanner.nextInt();
        switch (input) {
            case 1:
                photoCounter++;

                System.out.println("Sie haben " + photoCounter + " Fotos gemacht!");
                takingFotos();
                System.out.println();
                break;
            case 2:
                System.out.println("Sie haben aktuell " + photoCounter + " Fotos gemacht");
                System.out.println();
                break;

            case 3:
                MemoryCardDetails fotoApparatStativ = new MemoryCardDetails("15-45", "Nikon");
                System.out.println(fotoApparatStativ);
                System.out.println();
                break;

            case 4:
                double speicherKartenGroese = 500.00;
                MemoryCardDetails speicherKarteDaten = new MemoryCardDetails(speicherKartenGroese);
                System.out.println("Pro Foto werden 3MB abgezogen");
                System.out.println(speicherKarteDaten);
                System.out.println("Aktuell gemachte Fotos " + photoCounter);
                double verbrauchterSpeicherPlatz = photoCounter * 3.00;
                System.out.println("Aktuell freier Speicherplatz " + (speicherKartenGroese - verbrauchterSpeicherPlatz) + " MB");
                double restSpeicherPlatzRechner = ((speicherKartenGroese - verbrauchterSpeicherPlatz) / 3);
                System.out.printf("Sie können noch %.2f Fotos machen", restSpeicherPlatzRechner);
                System.out.println();
                System.out.println();
                break;

            case 5:
                System.out.println(fotoApparat);
                System.out.println();
                break;
            case 6:
              takingFotos = false;
                System.out.println("Das Foto Menü wurde erfolgreich beendet!");
                System.out.println("Sie haben erfolgreich " + photoCounter + " Fotos gemacht!");
                break;

        }


        }
    }

    private static void takingFotos() {System.out.println("Das Foto wurde erfolgreich gemacht:");

    }

    public static void printPhotoMenuHead() {
        System.out.println("Zum Fotos schießen drücken sie bitte             [1]");
        System.out.println("Zum sehen welches Objektiv verwendet wurde       [2]");
        System.out.println("Zum sehen wie viele Fotos gemacht wurden         [3]");
        System.out.println("Zum sehen der Gesamten Kamera Daten              [4]");
        System.out.println("Zum sehen wie viel Speicherplatz noch übrig ist  [5]");
        System.out.println("Zum Beenden des Foto Menü drücken sie bitte      [6]");
    }
}

