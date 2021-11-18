package Eray.week8andweek9.fotoapparat;

import java.util.Scanner;

public class MainToStartFotoApparat {
    public static void main(String[] args) {
        printAll();
    }

    private static Scanner scanner = new Scanner(System.in);

    private static void printAll() {
        boolean takingPhotos = true;
        FotoApparatDaten fotoApparatDaten = new FotoApparatDaten("EOS M50", "Canon", 24.1);

        int photoCounter = 0;

        while (takingPhotos) {
            System.out.println("Zum Fotos schießen drücken sie bitte        [+]");
            System.out.println("Zum Beenden des Foto Menü drücken sie bitte [-]");
            String userInput = scanner.nextLine();


            if (userInput.equals("+")) {
                photoCounter++;

                System.out.println("Sie haben " + photoCounter + " Fotos gemacht!");
                takePhoto();
                System.out.println(fotoApparatDaten);
                System.out.println();
            } else if (userInput.equals("-")) {
                takingPhotos = false;
                System.out.println("Das Foto Menü wurde erfolgreich beendet!");
                System.out.println("Sie haben erfolgreich " + photoCounter + " Fotos gemacht!");
            }
        }

    }

    public static void takePhoto() {
        System.out.println("Das Foto wurde erfolgreich gemacht:");
    }
}
