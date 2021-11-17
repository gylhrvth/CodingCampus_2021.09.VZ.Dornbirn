package Ingo.week9.Camera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CameraMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Camera camera = new Camera("Canon", "Space", 24, 100, 1024);
        Camera camera1 = new Camera("Fujitsu", "Mars", 18, 55, 2048);
        Camera[] cameras = new Camera[]{camera, camera1};
        //    stop();
        List<Camera> cameraList = new ArrayList<>();


        System.out.println("-------------------------------");
        camera.menue();
        int counter = 0;
        double size = 0;

        while (true) {

            int input = scanner.nextInt();
            double memorySpace = camera.getSpeicherplatz();

            if (input == 1) {
                camera.takeFoto();

//              camera.repeatInput();
                size = camera.getMegapixel() * 0.3;
            //    input = scanner.nextInt();
                camera.setSpeicherplatz(memorySpace - size);
                System.out.println("Kamera Modell:  " + camera.getModel());
                System.out.printf("Speicherplatz ist : %.2f\n", memorySpace);
                for (int i = 0; i < counter; i++) {
                    System.out.println("Photo" + (i + 1) + ".jpg");
                    continue;
                }
                counter++;

                if(input == 1) {
                    System.out.println("Noch ein Foto machen? \nj für ja, n für nein !");
                    scanner.nextLine();
                    String input1 = scanner.nextLine();
                    if(input1.equals("j")){
                        camera.takeFoto();
                        continue;
                    }
                }else{
                    break;
                }

            }
            String alpha = "abcdefghijklmnopqrstuvwxyz";

//            if(alpha.equals()) {
//                scanner.nextLine();
//                camera.closeCamera();
//            }

            if (input == 2) {
                System.out.println("_____________________________________________");
                System.out.println("Camera Off");
                camera.closeCamera();
                break;
            }
            if (input != 1 && input != 2) {
                scanner.nextLine();
                System.out.println("Falsche Eingabe:  !!!");
                System.out.println("Achtung System stürzt ab !!!!!! HIIIIIILFEEEE\n BOOOOOOOOOMMMMM!!!");
                camera.closeCamera();
                break;
            }

        }

    }


//    private static void stop() {
//        if(Math.random() > 0.5) {
//            throw new RuntimeException("Hallo Ingo wie gehts?");
//        }
//    }
}
