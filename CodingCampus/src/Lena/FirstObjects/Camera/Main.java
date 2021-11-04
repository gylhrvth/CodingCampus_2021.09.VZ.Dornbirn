package Lena.FirstObjects.Camera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CamObject camObject = new CamObject(1,10);
        Memory memory = new Memory(500);

        Camera camera = new Camera("XXX", "Sony", 5, camObject,memory);

        useCamera(camera);

       /* camera.viewGallery();

        camera.takePicture();
        camera.takePicture();
        camera.takePicture();

        System.out.println(camera.getFreeSpace());
        System.out.println(camera.numberOfTakenPhotos());

        System.out.println(camera);

        camera.viewGallery();

        camera.changeMemory(new Memory(100));
        System.out.println(camera);
        camera.viewGallery();

        for (int i = 0; i < 100; i++) {
            try{
                camera.takePicture();
            }catch (IllegalArgumentException illegalArgumentException){

            }

        }
        camera.viewGallery();
        System.out.println(camera.getFreeSpace());
        System.out.println(camera.numberOfTakenPhotos());
        System.out.println(camera);*/

    }

    public static void useCamera(Camera camera) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printMenu();

            while (!sc.hasNextInt()) {
                System.out.println("Das ist keine Zahl!!!");
                System.out.println();
                sc.nextLine();
                printMenu();
            }



            int input = sc.nextInt();

            switch (input){
                case 1:
                    camera.takePicture();
                    break;
                case 2:
                    camera.viewGallery();
                    break;
                case 3:
                    boolean inputCheck =false;
                    while (!inputCheck) {
                        System.out.println("Size of the Memory in MB:");
                        try{
                        camera.changeMemory(new Memory(sc.nextInt()));
                        inputCheck=true;
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    inputCheck =false;
                    while (!inputCheck) {
                        System.out.println("Min focal Distance:");
                        int minFocalDist = sc.nextInt();
                        System.out.println("Max focal Distance:");
                        int maxFocalDist = sc.nextInt();
                        try {
                            camera.changeCamObject(new CamObject(minFocalDist, maxFocalDist));
                            inputCheck=true;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                    }
                    break;
                case 5:
                    System.out.println(camera.getFreeSpace()+"MB");
                    break;
                case 6:
                    System.out.println(camera.numberOfTakenPhotos()+ " Photos");
                    break;
                case 7:
                    System.out.println(camera);
            }

        }
    }

    public static void printMenu(){
        System.out.println();
        System.out.println("(1) Take a Picture");
        System.out.println("(2) View Gallery");
        System.out.println("(3) Change MemoryCard");
        System.out.println("(4) Change Objective");
        System.out.println("(5) Whats my free Space?");
        System.out.println("(6) Number of taken Photos");
        System.out.println("(7) Print Camera Information");
    }
}
