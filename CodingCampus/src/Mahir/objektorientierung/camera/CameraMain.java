package Mahir.objektorientierung.camera;

import java.util.Scanner;

public class CameraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camera camera = new Camera("Canon", "EOS", 55, 1024, 18);
        int counter = 0;

        double size = 0;
        double newMemorySpace = 0;
        System.out.println("Camera On");
        while (true) {
            double memorySpace = camera.getSpeicherplatz();
            // MENU
            System.out.println("1 - Take Photo \n2 - Gallery \n");
            System.out.println("0 - Close Camera");
            int input = scanner.nextInt();
            // TAKE PHOTO {
            if (input == 1) {
                camera.takePhoto();
                counter++;
                size = camera.getMegapixel() * 0.3;
                System.out.println("1 - Save Photo \n2 - Delete Photo");
                input = scanner.nextInt();
                if (input == 1) {
                    camera.setSpeicherplatz((double) (memorySpace - size));
                }
                if (input == 2) {
                    continue;
                }
            }
            // GALLERY
            if (input == 2) {
                for (int i = 0; i < counter; i++) {
                    System.out.println("Photo" + (i + 1) + ".jpg");
                }
                System.out.printf("Photos taken: %d \nLeft Memory Space: %.2f MB \n", counter, memorySpace);
            }

            // CLOSE CAMERA
            if (input == 0) {
                System.out.println("Camera Off");
                break;
            }
            scanner.nextLine();
        }
    }

}
