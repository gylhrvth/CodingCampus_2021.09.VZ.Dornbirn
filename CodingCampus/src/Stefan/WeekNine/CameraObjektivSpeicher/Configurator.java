package Stefan.WeekNine.CameraObjektivSpeicher;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Configurator {
    public static void bigPhotoWithPrint(List<Speicherkarte> speicherkarte, List<Objektiv> objektivs, List<Kamera> cameraNew) throws IOException {
        Kamera currentCamera = null;
        Scanner scanner = new Scanner(System.in);

        //Auswahl Camera
        System.out.println("Mit welcher Kamera wollen sie Fotografieren:\n[1]Nikon, [2]Sony, [3]Canon");
        System.out.println();
        CameraObjSpeiMethoden.printCameraList(cameraNew);
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputCamera = scanner.nextInt();

        while (inputCamera > 3 || inputCamera < 0) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputCamera = scanner.nextInt();
            scanner.nextLine();
        }
        if (inputCamera == 1) {
            currentCamera = cameraNew.get(0);
        } else if (inputCamera == 2) {
            currentCamera = cameraNew.get(1);
        } else if (inputCamera == 3) {
            currentCamera = cameraNew.get(2);
        }


        //Auswahl Objektiv
        System.out.println("Welches Objektiv wollen sie verwenden:\n[1]Objektiv1, [2]Objektiv2, [3]Objektiv3");
        System.out.println();
        CameraObjSpeiMethoden.printObjektivList(objektivs);
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputObjektiv = scanner.nextInt();

        while (inputObjektiv > 3 || inputObjektiv < 0) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputObjektiv = scanner.nextInt();
            scanner.nextLine();
        }
        if (inputObjektiv == 1) {
            currentCamera.mountObjectiv(objektivs.get(0));
        } else if (inputObjektiv == 2) {
            currentCamera.mountObjectiv(objektivs.get(1));
        } else if (inputObjektiv == 3) {
            currentCamera.mountObjectiv(objektivs.get(2));
        }


        //Auswahl Speicherkate
        System.out.println("Welche Speicherkarte wollen sie:\n[1]32GB, [2]64GB, [3]128GB");
        System.out.println();
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputSpeicher = scanner.nextInt();

        while (inputSpeicher > 3 || inputSpeicher < 0) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputSpeicher = scanner.nextInt();
            scanner.nextLine();
        }
        if (inputSpeicher == 1) {
            currentCamera.mountSpeicherkarte(speicherkarte.get(0));
        } else if (inputSpeicher == 2) {
            currentCamera.mountSpeicherkarte(speicherkarte.get(1));
        } else if (inputSpeicher == 3) {
            currentCamera.mountSpeicherkarte(speicherkarte.get(2));
        }
        System.out.println("Gewählte Konfiguration:\n" + currentCamera);


        //Rechnet aus wievil Photos gemacht werden können mit der gewählten Speicherkarte
        Speicherkarte photo = currentCamera.makePhotos();

        System.out.println();
        System.out.printf("Sie können bei der Gewählten %s Fotos machen.", photo);


        //Fotos machen

//        photo.setSizeInGB(photo.getSizeInGB() - 1);
        System.out.println();
        System.out.println("Wollen Sie gleich mal ein paar bilder machen? [1]Ja / [2]Nein");
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputPhoto = scanner.nextInt();

        while (inputPhoto > 2 || inputPhoto < 0) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 2 ein!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextInt();
            }
            inputPhoto = scanner.nextInt();
            scanner.nextLine();
        }

        int sum = 0;
        while (true) {
            if (inputPhoto == 1) {
                sum++;
                System.out.println("Wollen Sie noch eines machen");
                inputPhoto = scanner.nextInt();
                continue;
            }
            if (inputPhoto == 2) {
                System.out.println("Danke das wars");
                break;
            }
        }
        int endsum = photo.getSizeInGB() - sum;
        System.out.println("Verbleibende " + endsum + " Bilder!");
    }
}
