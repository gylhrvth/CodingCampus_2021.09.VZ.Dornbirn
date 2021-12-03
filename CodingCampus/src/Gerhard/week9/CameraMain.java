package Gerhard.week9;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;


public class CameraMain {
    public static void main(String[] args) throws IOException {

        Camera camera1 = new Camera("Canon", "EOS R", 30.3, 24, 50);
        Camera camera2 = new Camera("Nikon", "Z6", 24.5, 24, 70);
        Camera camera3 = new Camera("Sony", "Alpha 7R II", 42.4, 18, 35);

        Camera[] camera = new Camera[]{camera1, camera2, camera3};
        List<Camera> cameras = new ArrayList<>();
        cameras.addAll(Arrays.asList(camera));

        System.out.println();
        System.out.println("Willkommen bei Ihrem Fotokamerasimulator!");
        System.out.println();
        System.out.println("Mit den folgenden Kameras können Sie einen Testschnappschuss machen");
        System.out.println(Arrays.toString(camera));
        System.out.println();
        String fotoAbfrage;
        System.out.println("Bitte wählen Sie die Kamera aus mit welcher Sie ein Bild aufnehmen Wollen (Bitte Hersteller eingeben)");
        Scanner scanner = new Scanner(System.in);
        fotoAbfrage = scanner.next();
        System.out.println("Sie haben die folgende Kamera ausgewählt:");
        System.out.println();

        if (fotoAbfrage.equalsIgnoreCase("Canon")) {
            System.out.println(camera1);
        }
        if (fotoAbfrage.equalsIgnoreCase("Sony")) {
            System.out.println(camera3);
        }

        if (fotoAbfrage.equalsIgnoreCase("Nikon")) {
            System.out.println(camera2);
        }


        Webcam webcam = Webcam.getDefault();
        for (Dimension supportedSize : webcam.getViewSizes()) {
            System.out.println(supportedSize.toString());
        }
        if (fotoAbfrage.equalsIgnoreCase("Canon")) {
            webcam.setViewSize((new Dimension(176, 144)));
        }
        if (fotoAbfrage.equalsIgnoreCase("Sony")) {
            webcam.setViewSize((new Dimension(320, 240)));
        }
        if (fotoAbfrage.equalsIgnoreCase("Nikon")) {
            webcam.setViewSize((new Dimension(640, 480)));
        }

        webcam.open();
        ImageIO.write(webcam.getImage(), "JPG", new File("assets/tmp/firstCapture.jpg"));
        webcam.close();
    }
//
//
}
//
//
