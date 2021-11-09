package Stefan.WeekNine.Fotoapparat;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CameraMain {
    public static void main(String[] args) throws IOException {

        Camera canon1 = new Canon("Canon", "EOS M6 Mark II", 32.5, 24, 40);
        Camera canon2 = new Canon("Canon", "EOS R", 30.3, 24, 50);

        Camera nikon1 = new Nikon("Nikon", "Z5", 24.3, 24,70);
        Camera nikon2 = new Nikon("Nikon", "Z6", 24.5, 24,70);

        Camera sony1 = new Sony("Sony", "Alpha 7 III", 24.3,24,70);
        Camera sony2 = new Sony("Sony", "Alpha 7R II", 42.4,18,35);


        Camera[] camera = new Camera[]{canon1, canon2, nikon1, nikon2, sony1, sony2};

        List<Camera> cameras = new ArrayList<>();
        cameras.addAll(Arrays.asList(camera));


        //Listet alle Cameras auf
//        CameraMethoden.printCameraList(cameras);


        CameraMethoden.takePhoto();

    }


}
