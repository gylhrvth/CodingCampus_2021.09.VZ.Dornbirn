package Mahir.objektorientierung.camera;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);
    private Camera currentCamera;
    private MemorySpace memoryCard;
    private CameraLens cameraLens;


    public void menu(List<Camera> camera, List<MemorySpace> memoryCards, List<CameraLens> cameraLenss) {
        int counter = 0;
        System.out.println("Chose Camera Please");
        this.currentCamera = choseModel(camera);
        this.memoryCard = changeMemoryCard(memoryCards);
        this.cameraLens = changeCameraLens(cameraLenss);

        currentCamera.setCameraLens(cameraLens.getFocalLenght());
        currentCamera.setMemorySpace(memoryCard.getMemory());


        while (true) {

            System.out.println("1 - Take Photo \n2 - Gallery \n3 - Specifications");
            System.out.println("0 - Close Camera");
            while (!scanner.hasNextInt()) {
                System.out.println("invalid input pleas try again");
                scanner.nextLine();
            }
            int input = scanner.nextInt();
            //Take Photo
            if (input == 1) {
                takePhoto();
                System.out.printf("size = %.2f\n", currentCamera.getMegapixel() * 0.3);
                System.out.println("1 - save Photo");
                System.out.println("2 - Delete");
                input = scanner.nextInt();
                //Save Photo
                if (input == 1) {
                    currentCamera.setMemorySpace(currentCamera.getMemorySpace() - currentCamera.getMegapixel() * 0.3);
                    System.out.printf("%.2f\n", currentCamera.getMemorySpace());

                }
                //Delete Photo
                if (input == 2) {
                    System.out.println("Deleted");
                }
                counter++;
                continue;
            }
            //Gallery
            if (input == 2) {
                gallery(counter);
                System.out.printf("Left Memory Space: %.2f", currentCamera.getMemorySpace());
                continue;
            }
            if (input == 3) {
                System.out.println("Specifications\n" + currentCamera);
                continue;
            }
            //Close
            if (input == 0) ;
            System.out.println("Camera Off");
            break;
        }

    }

    public CameraLens changeCameraLens(List<CameraLens> cameraLens) {
        System.out.println("select a Camera Lens");
        System.out.println("1 - " + cameraLens.get(0));
        System.out.println("2 - " + cameraLens.get(1));
        int input = scanner.nextInt();
        if (input == 1) {
            return cameraLens.get(0);
        }
        if (input == 2) {
            return cameraLens.get(1);
        }
        return null;
    }

    public MemorySpace changeMemoryCard(List<MemorySpace> memoryCard) {
        System.out.println("select a Memory Card");
        System.out.println("1 - " + memoryCard.get(0));
        System.out.println("2 - " + memoryCard.get(1));
        int input = scanner.nextInt();
        if (input == 1) {
            return memoryCard.get(0);
        }
        if (input == 2) {
            return memoryCard.get(1);
        }
        return null;
    }

    public Camera choseModel(List<Camera> camera) {
        System.out.println("which Camera do u want to use ");
        System.out.println("1 - " + camera.get(0));
        System.out.println("2 - " + camera.get(1));
        int input = scanner.nextInt();
        if (input == 1) {
            return camera.get(0);
        }
        if (input == 2) {
            return camera.get(1);
        }
        return null;
    }

    public void gallery(int counter) {

        for (int i = 0; i < counter; i++) {
            System.out.println("Photo" + (i + 1) + ".jpg");
        }
        System.out.printf("Photos taken: %d \n", counter);
    }

    public void takePhoto() {
        Random random = new Random();
        int rndm = random.nextInt(6);
        if (rndm == 0) {
            takePhoto1();
        }
        if (rndm == 1) {
            takePhoto2();
        }
        if (rndm == 2) {
            takePhoto3();
        }
        if (rndm == 3) {
            takePhoto4();
        }
        if (rndm == 4) {
            takePhoto5();
        }
        if (rndm == 5) {
            takePhoto6();
        }
    }

    void takePhoto6() {

        System.out.println("─▄▀▀▀▄────▄▀█▀▀█▄\n" +
                "▄▀─▀─▀▄▄▀█▄▀─▄▀─▄▀▄\n" +
                "█▄▀█───█─█▄▄▀─▄▀─▄▀▄\n" +
                "──█▄▄▀▀█▄─▀▀▀▀▀▀▀─▄█\n" +
                "─────▄████▀▀▀▀████─▀▄");
    }

    void takePhoto5() {
        System.out.println("──▒▒▒▒▒▒▒▒───▒▒▒▒▒▒▒▒\n" +
                "─▒▐▒▐▒▒▒▒▌▒─▒▒▌▒▒▐▒▒▌▒\n" +
                "──▒▀▄█▒▄▀▒───▒▀▄▒▌▄▀▒\n" +
                "─────██─────────██\n" +
                "░░░▄▄██▄░░░░░░░▄██▄░░░");
    }

    void takePhoto4() {
        System.out.println("──────▄▀▄─────▄▀▄\n" +
                "─────▄█░░▀▀▀▀▀░░█▄\n" +
                "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
                "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█\n");
    }

    void takePhoto3() {
        System.out.println("─▄───────▄█▄───────▄─\n" +
                "▐█▌──▄──█████──▄──▐█▌\n" +
                "─█──███▄▄███▄▄███──█─\n" +
                "░█░░█▄█▄█▀▒▀█▄█▄█░░█░\n" +
                "██▄▄█▄█▄█▒▒▒█▄█▄█▄▄██");
    }

    void takePhoto2() {
        System.out.println("───────────────▄▄───▐█\n" +
                "───▄▄▄───▄██▄──█▀───█─▄\n" +
                "─▄██▀█▌─██▄▄──▐█▀▄─▐█▀\n" +
                "▐█▀▀▌───▄▀▌─▌─█─▌──▌─▌\n" +
                "▌▀▄─▐──▀▄─▐▄─▐▄▐▄─▐▄─▐▄");
    }

    void takePhoto1() {
        System.out.println("───▄▀▀▀▀▀───▄█▀▀▀█▄\n" +
                "──▐▄▄▄▄▄▄▄▄██▌▀▄▀▐██\n" +
                "──▐▒▒▒▒▒▒▒▒███▌▀▐███\n" +
                "───▌▒▓▒▒▒▒▓▒██▌▀▐██\n" +
                "───▌▓▐▀▀▀▀▌▓─▀▀▀▀▀\n");
    }

}
