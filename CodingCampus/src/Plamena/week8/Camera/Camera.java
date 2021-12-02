package Plamena.week8.Camera;

import java.util.List;
import java.util.Scanner;

public class Camera {
    private static Scanner sc = new Scanner(System.in);
    private static final double MAGIC_MB_PER_MP = 0.3;
    String model;
    String manufacturer;
    private double megapixel;
    private MemoryCard memoryCard;
    private CamLens camLens;

    public Camera(String model, String manufacturer, double megapixel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.megapixel = megapixel;
    }

    public void setCamLens(CamLens camLens) {
        this.camLens = camLens;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public void setMegapixel(double megapixel) {
        if (megapixel <= 0)
            this.megapixel = megapixel;
    }

    public void takePicture(String motive, double megapixel) {
        Picture pic = new Picture(motive);
        setMegapixel(megapixel);
        double picSize = megapixel * MAGIC_MB_PER_MP;
        pic.setSize(picSize);
        if (!memoryCard.savePicInMemory(pic)) {
            freeMemory();
        }
        System.out.println("_________");
        System.out.printf("| %6s |", pic);
        System.out.println();
        System.out.println("_________");
    }

    public void freeMemory() {
        boolean enoughMemory = false;
        while (!enoughMemory) {
            System.out.println(
                    "Select an option from the menu: " + System.lineSeparator() +
                            "[1] Switch memory cards" + System.lineSeparator() +
                            "[2] Delete photos");
            checkInputForInteger();
            int tmp = sc.nextInt();
            if (tmp == 1) {
                switchMemoryCard();
                enoughMemory = true;
            } else if (tmp == 2) {
                deletePics(memoryCard.picsOnMemoryCard);
                enoughMemory = true;
            } else {
                System.out.println("Invalid input. Try again!");
            }
        }
    }

    public void deletePics(List<Picture> picsOnMemoryCard) {
        int tmp;
        System.out.println("If you want to free memory select photos to delete");
        for (int i = 0; i < picsOnMemoryCard.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + picsOnMemoryCard.get(i).getMotive());
        }
        while (sc.hasNext()) {
            checkInputForInteger();
            tmp = sc.nextInt();
            if (tmp < 1 || tmp > picsOnMemoryCard.size() + 1) {
                System.out.println("Picture not found");
            } else {
                memoryCard.setMemory(memoryCard.getMemory() - picsOnMemoryCard.get(tmp - 1).getSize());
                picsOnMemoryCard.remove(tmp - 1);
                System.out.println("Picture " + (tmp) + " deleted. " +
                        memoryCard.getMemory() + " memory left.");
                for (int i = 0; i < picsOnMemoryCard.size(); i++) {
                    System.out.println("[" + (i + 1) + "] " + picsOnMemoryCard.get(i).getMotive());
                }

            }
        }
    }

    public static void checkInputForInteger() {
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.next();
        }
    }

    public void switchMemoryCard() {
        setMemoryCard(new MemoryCard());
        System.out.println("New memory cad inserted");
    }

    public void switchCamLens() {
        setCamLens(new CamLens(30,120,2.4));
        System.out.println("New camera object placed");
    }

    @Override
    public String toString() {
        return "Camera manufacturer: " + manufacturer + ", model: " + model
                + ", megapixel: " + megapixel;
    }
}
