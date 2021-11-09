package Stefan.WeekNine.CameraObjektivSpeicher;

import java.io.IOException;
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

    public static void bigPhotoWithPrint(List<Speicherkarte> speicher, List<Objektiv> objektivs, List<Kamera> cameraNew) {
        Kamera currentCamera = null;
        Objektiv currentObjektiv = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mit welcher Kamera wollen sie Fotografieren: Canon, Nikon, Sony");
        System.out.println();
        CameraObjSpeiMethoden.printCameraList(cameraNew);
        String inputCamera = scanner.next();

        if (inputCamera.equalsIgnoreCase("Canon")) {
            currentCamera = cameraNew.get(0);
        } else if (inputCamera.equalsIgnoreCase("Nikon")) {
            currentCamera = cameraNew.get(1);
        } else if (inputCamera.equalsIgnoreCase("Sony")) {
            currentCamera = cameraNew.get(2);
        } else {
            System.out.println("Gib einen richtige Kamera ein!!!!");
        }


        System.out.println("Welches Objektiv wollen sie verwenden: Objektiv1, Objektiv2, Objektiv3");
        System.out.println();
        CameraObjSpeiMethoden.printObjektivList(objektivs);
        String inputObjektiv = scanner.next();

        if(inputObjektiv.equalsIgnoreCase("Objektiv1")) {
            currentCamera.mountObjectiv(objektivs.get(0));
        } else if (inputObjektiv.equalsIgnoreCase("Objektiv2")) {
            currentCamera.mountObjectiv(objektivs.get(1));
        } else if (inputObjektiv.equalsIgnoreCase("Objektiv3")) {
            currentCamera.mountObjectiv(objektivs.get(2));
        }


        System.out.println(currentCamera);
    }

}
