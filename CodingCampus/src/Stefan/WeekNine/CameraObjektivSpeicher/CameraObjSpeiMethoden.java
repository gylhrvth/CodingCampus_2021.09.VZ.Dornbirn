package Stefan.WeekNine.CameraObjektivSpeicher;

;
import java.util.List;
import java.util.Scanner;

public class CameraObjSpeiMethoden {

    //Listet alle Cameras auf
    public static void printCameraList(List<Kamera> camerasNew) {
        for (Kamera cameraNew : camerasNew) {
            System.out.println(cameraNew);
        }
    }

    //Listet alle Objektive auf
    public static void printObjektivList(List<Objektiv> objektivs) {
        for (Objektiv objektiv : objektivs) {
            System.out.println(objektiv);
        }
    }

    //Listet alle Speicherkarten auf
    public static void printSpeicherkarteList(List<Speicherkarte> speicherkarten) {
        for (Speicherkarte speicherkarte : speicherkarten) {
            System.out.println(speicherkarte);
        }
    }


    public static void bigPhotoWithPrint(List<Speicherkarte> speicherkarte, List<Objektiv> objektivs, List<Kamera> cameraNew) {
        Kamera currentCamera = null;
        Scanner scanner = new Scanner(System.in);

        //Auswahl Camera

        System.out.println("Mit welcher Kamera wollen sie Fotografieren:\n[1]Nikon, [2]Sony, [3]Canon");
        System.out.println();
        CameraObjSpeiMethoden.printCameraList(cameraNew);
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
        System.out.println("Welche Speicherkarte wollen sie:\n[1]Speicher1, [2]Speicher2, [3]Speicher3");
        System.out.println();
        CameraObjSpeiMethoden.printSpeicherkarteList(speicherkarte);
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

        System.out.println("Gewählte Konfiguration: " + currentCamera);
    }

}
