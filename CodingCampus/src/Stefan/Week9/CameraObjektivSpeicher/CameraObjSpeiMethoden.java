package Stefan.Week9.CameraObjektivSpeicher;

;
import java.util.List;

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

}
