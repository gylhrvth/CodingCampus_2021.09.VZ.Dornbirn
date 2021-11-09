package Mahir.objektorientierung.camera;


import java.util.Scanner;

public class CameraTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Camera camera = new Camera("Canon", "EOS", 55, 1024, 18);
        int counter = 0;
        while (true) {

            camera.menu();
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                camera.takePhoto();
                counter ++;
            }
            if (userInput == 2) {
                camera.gallery(counter);
            }
            if (userInput == 3) {
                break;
            }
        }


    }
}
