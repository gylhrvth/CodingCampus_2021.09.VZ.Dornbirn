package Ingo.week9.Camera;

import java.util.Scanner;

public class CameraMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Camera camera = new Camera("Canon","Space",24,100,1024);
        System.out.println("Drücken Sie 1 für neues Foto !");
        System.out.println("Drücken Sie 2 für Camera beenden !");
        int number = scanner.nextInt();



    }


}
