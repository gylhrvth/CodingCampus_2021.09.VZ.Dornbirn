package Eray.week8andweek9.fotoapparat;

import java.util.Scanner;

public class MainMenuFotoApparatUebung2 {
    public static void main(String[] args) {
        printAll();
    }

    private static Scanner scanner = new Scanner(System.in);

    private static void printAll() {
        boolean takingPhotos = true;
        FotoApparatDaten fotoApparatDaten = new FotoApparatDaten("EOS M50", "Canon", 24.1);

        int photoCounter = 0;

        while (takingPhotos) {
            printPhotoMenuHead();
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    photoCounter++;

                    System.out.println("Sie haben " + photoCounter + " Fotos gemacht!");
                    takePhoto();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Sie haben aktuell " + photoCounter + " Fotos gemacht");
                    System.out.println();
                    break;

                case 3:
                    FotoApparatStativUebung2 fotoApparatStativ = new FotoApparatStativUebung2("15-45", "Nikon");
                    System.out.println(fotoApparatStativ);
                    System.out.println();
                    break;

                case 4:
                    double speicherKartenGroese = 500.00;
                    SpeicherKarteDatenUebung2 speicherKarteDaten = new SpeicherKarteDatenUebung2(speicherKartenGroese);
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
                    System.out.println(fotoApparatDaten);
                    System.out.println();
                    break;
                case 6:
                    takingPhotos = false;
                    System.out.println("Das Foto Menü wurde erfolgreich beendet!");
                    System.out.println("Sie haben erfolgreich " + photoCounter + " Fotos gemacht!");
                    break;

            }


        }

    }

    public static void printPhotoMenuHead() {
        System.out.println("Zum Fotos schießen drücken sie bitte             [1]");
        System.out.println("Zum sehen wie viele Fotos gemacht wurden         [2]");
        System.out.println("Zum sehen welches Objektiv verwendet wurde       [3]");
        System.out.println("Zum sehen wie viel Speicherplatz noch übrig ist  [4]");
        System.out.println("Zum sehen der Gesamten Kamera Daten              [5]");
        System.out.println("Zum Beenden des Foto Menü drücken sie bitte      [6]");
    }

    public static void takePhoto() {
        System.out.println("Das Foto wurde erfolgreich gemacht:");
    }
}
