package Sandro.oopAufgaben.camera;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class UserInteraction {

    private Scanner sc = new Scanner(System.in);
    private Fotoapparat currentCamera;
    private MemoryCard currentMemoryCard;
    private int takenPhotos = 0;

    public void menu(LinkedList<Fotoapparat> cameras) {

        System.out.println("[1] for taking a photo");
        System.out.println("[2] for amount of taken photos");
        System.out.println("[3] for memory details");

        int input = sc.nextInt();

        switch (input) {
            case 1 -> {                                                                //neue Version von switch -> && {
                takePhoto(currentCamera);
                menu(cameras);
            }
            case 2 -> {
                System.out.println(this.takenPhotos + " photos were taken\n");
                menu(cameras);
            }
            case 3 -> {
                memoryDetails(currentCamera, currentMemoryCard);
                menu(cameras);
            }
        }
    }

    public Fotoapparat chooseModel(LinkedList<Fotoapparat> cameras) {
        System.out.println("Which camera do you want to use ?");
        System.out.println("Model 0: " + cameras.get(0));
        System.out.println("Model 1: " + cameras.get(1));
        int input = sc.nextInt();

        switch (input) {
            case 0 -> {
                System.out.println("Camera " + cameras.get(0) + " was selected.\n");
                // Objekt 1 wird zurückgegeben
                this.currentCamera = cameras.get(input);
                return cameras.get(0);
            }
            case 1 -> {
                System.out.println("Camera " + cameras.get(1) + " was selected.\n");
                // Objekt 2 wird zurückgegeben
                this.currentCamera = cameras.get(input);
                return cameras.get(1);
            }
        }
        return null;
    }

    public void takePhoto(Fotoapparat currentCamera) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0 -> {
                System.out.println("▒▒▄▀▀▀▀▀▄▒▒▒▒▒▄▄▄▄▄▒▒▒\n" +
                        "▒▐░▄░░░▄░▌▒▒▄█▄█▄█▄█▄▒\n" +
                        "▒▐░▀▀░▀▀░▌▒▒▒▒▒░░░▒▒▒▒\n" +
                        "▒▒▀▄░═░▄▀▒▒▒▒▒▒░░░▒▒▒▒\n" +
                        "▒▒▐░▀▄▀░▌▒▒▒▒▒▒░░░▒▒▒▒");
                this.takenPhotos++;
            }
            case 1 -> {
                System.out.println("───▄▄▄\n" +
                        "─▄▀░▄░▀▄\n" +
                        "─█░█▄▀░█\n" +
                        "─█░▀▄▄▀█▄█▄▀\n" +
                        "▄▄█▄▄▄▄███▀\n");
                this.takenPhotos++;
            }
            case 2 -> {
                System.out.println("──────▄▀▄─────▄▀▄\n" +
                        "─────▄█░░▀▀▀▀▀░░█▄\n" +
                        "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
                        "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█\n");
                this.takenPhotos++;
            }
        }
    }

    public void memoryDetails(Fotoapparat currentCamera, MemoryCard currentMemoryCard) {
        // Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.[1]
        double memory = this.takenPhotos * (0.3 * currentCamera.getMp());
        double actualMemorySize = this.currentMemoryCard.getMemorySize() - memory;
        System.out.println("Actual memory size: " + actualMemorySize + " mb\n");
    }

    public MemoryCard chooseMemoryCard(LinkedList<MemoryCard> memoryCards) {
        System.out.println("Which memory card do you want to select ?:");
        System.out.println("Model 0: " + memoryCards.get(0));
        System.out.println("Model 1: " + memoryCards.get(1));
        int input = sc.nextInt();

        switch (input) {
            case 0 -> {
                System.out.println("Camera " + memoryCards.get(0) + "was selected\n");
                this.currentMemoryCard = memoryCards.get(input);
                return memoryCards.get(0);
            }
            case 1 -> {
                System.out.println("Camera " + memoryCards.get(1) + "was selected\n");
                this.currentMemoryCard = memoryCards.get(input);
                return memoryCards.get(1);
            }
        }
        return null;
    }
}



