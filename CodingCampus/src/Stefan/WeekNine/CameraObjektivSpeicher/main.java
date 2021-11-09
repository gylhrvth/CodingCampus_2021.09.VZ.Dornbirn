package Stefan.WeekNine.CameraObjektivSpeicher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Kamera camera1 = new Kamera("Z7", "Nikon", 64);
        Kamera camera2 = new Kamera("AI", "Sony", 58);
        Kamera camera3 = new Kamera("R6", "Canon", 24);

        Objektiv objektiv1 = new Objektiv(24, 2.8, 4.0);
        Objektiv objektiv2 = new Objektiv(120, 4.8, 5.0);
        Objektiv objektiv3 = new Objektiv(18, 2.8, 2.0);


        // takePhoto


        Speicherkarte speicherkarte1 = new Speicherkarte(32);
        Speicherkarte speicherkarte2 = new Speicherkarte(64);
        Speicherkarte speicherkarte3 = new Speicherkarte(128);

//        camera1.mountObjectiv(objektiv1);
//        camera1.insertSDCard(speicherkarte3);

        //Gibt die Liste der Kameras aus
        Kamera[] cameraNew = new Kamera[]{camera1, camera2, camera3};
        List<Kamera> camerasNew = new ArrayList<>();
        camerasNew.addAll(Arrays.asList(cameraNew));

//        CameraObjSpeiMethoden.printCameraList(camerasNew);


        //Gibt die Liste der Objektive aus
        Objektiv[] objektive = new Objektiv[]{objektiv1, objektiv2, objektiv3};
        List<Objektiv> objektivs = new ArrayList<>();
        objektivs.addAll(Arrays.asList(objektive));

//        CameraObjSpeiMethoden.printObjektivList(objektivs);


        //Gibt die Speichergrösse aus
        Speicherkarte[] speicherkarte = new Speicherkarte[]{speicherkarte1, speicherkarte2, speicherkarte3};
        List<Speicherkarte> speicherkarten = new ArrayList<>();
        speicherkarten.addAll(Arrays.asList(speicherkarte));

//        CameraObjSpeiMethoden.printSpeicherkarteList(speicherkarten);

        CameraObjSpeiMethoden.bigPhotoWithPrint(List.of(speicherkarte), objektivs, camerasNew);


    }




}


