package Mahir.objektorientierung.camera;

import java.util.*;

public class CameraMain {


    public static void main(String[] args) {
        Camera camera1 = new Camera("Canon", "EOS", 55, 1024, 18);
        Camera camera2 = new Camera("Canon", "4000", 100, 512, 22);
        Camera[] cameras = new Camera[]{camera1, camera2};
        List<Camera> cameraList = new ArrayList<>(Arrays.asList(cameras));

        MemorySpace memorySpace32 = new MemorySpace("Memory Card 32GB",32000);
        MemorySpace memorySpace64 = new MemorySpace("Memory Card 64GB",64000);
        MemorySpace[] memoryCards = new MemorySpace[]{memorySpace32,memorySpace64};
        List<MemorySpace> memoryList = new ArrayList<>(Arrays.asList(memoryCards));

        CameraLens cameraLens1 = new CameraLens("Canon CN 20X50",1000);
        CameraLens cameraLens2 = new CameraLens("Canon EF",100);
        CameraLens[] cameraLens = new CameraLens[]{cameraLens1,cameraLens2};
        List<CameraLens> cameraLensList = new ArrayList<>(Arrays.asList(cameraLens));

        UserInput userInput = new UserInput();

        userInput.menu(cameraList,memoryList,cameraLensList);






//        Scanner scanner = new Scanner(System.in);
//        Camera camera = new Camera("Canon", "EOS", 55, 1024, 18);
//
//        int counter = 0;
//        double size = 0;
//        //Start
//        System.out.println("Camera On");
//        while (true) {
//            double memorySpace = camera.getSpeicherplatz();
//            // MENU
//            System.out.println("1 - Take Photo \n2 - Gallery \n");
//            System.out.println("0 - Close Camera");
//            while (!scanner.hasNextInt()) {
//                System.out.println("invalid input pleas try again");
//                scanner.nextLine();
//            }
//            int input = scanner.nextInt();
//            // TAKE PHOTO {
//            if (input == 1) {
//                Random random = new Random();
//                int rndm = random.nextInt(6);
//                if (rndm == 0){
//                    camera.takePhoto();
//                }
//                if (rndm == 1) {
//                    camera.takePhoto2();
//                }
//                if (rndm == 2) {
//                    camera.takePhoto3();
//                }
//                if (rndm == 3) {
//                    camera.takePhoto4();
//                }
//                if (rndm == 4) {
//                    camera.takePhoto5();
//                }
//                if (rndm == 5) {
//                    camera.takePhoto6();
//                }
//                counter++;
//
//                size = camera.getMegapixel() * 0.3;
//                System.out.println("1 - Save Photo \n2 - Delete Photo");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("invalid input pleas try again");
//                    scanner.nextLine();
//                }
//                input = scanner.nextInt();
//                if (input == 1) {
//                    camera.setSpeicherplatz((memorySpace - size));
//                }
//                if (input == 2) {
//                    continue;
//                }
//            }
//            // GALLERY
//            if (input == 2) {
//                for (int i = 0; i < counter; i++) {
//                    System.out.println("Photo" + (i + 1) + ".jpg");
//                }
//                System.out.printf("Photos taken: %d \nLeft Memory Space: %.2f MB \n", counter, memorySpace);
//            }
//
//            // CLOSE CAMERA
//            if (input == 0) {
//                System.out.println("Camera Off");
//                break;
//            }
//            scanner.nextLine();
//        }
    }

}
