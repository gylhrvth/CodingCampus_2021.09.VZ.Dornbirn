package Stefan.Week9.CameraObjektivSpeicher;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ConfiguratorNewOptimiert {
    public static void bigPhotoWithPrint(List<Speicherkarte> speicherkarte, List<Objektiv> objektivs, List<Kamera> cameraNew) throws IOException {
        Kamera currentCamera = null;
        Scanner scanner = new Scanner(System.in);

        //Auswahl Camera
        System.out.println("Mit welcher Kamera wollen sie Fotografieren:");
        for (int i = 0; i < cameraNew.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + cameraNew.get(i).getProducer() + " " + cameraNew.get(i).getModel() + " " + cameraNew.get(i).getMp() + "MP");
        }
        System.out.println();
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputCamera = scanner.nextInt();


        while (inputCamera > cameraNew.size() || inputCamera < 1) {
            System.out.println("Geben Sie eine Zahl ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputCamera = scanner.nextInt();
            scanner.nextLine();
        }
        currentCamera = cameraNew.get(inputCamera - 1);


        //Auswahl Objektiv
        System.out.println("Welches Objektiv wollen sie verwenden:");
        for (int i = 0; i < objektivs.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + objektivs.get(i).getFocalLengthMin() + "-->>" + objektivs.get(i).getFocalLengthMax() + " f" + objektivs.get(i).getLightIntensity() + " " + objektivs.get(i).getBlende());
        }
        System.out.println();
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputObjektiv = scanner.nextInt();

        while (inputObjektiv > objektivs.size() || inputObjektiv < 1) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputObjektiv = scanner.nextInt();
            scanner.nextLine();
        }
        currentCamera.mountObjectiv(objektivs.get(inputObjektiv - 1));


        //Auswahl Speicherkate
        System.out.println("Welche Speicherkarte wollen sie:");
        for (int i = 0; i < speicherkarte.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + speicherkarte.get(i).getSizeInGB() + "GB");
        }
        System.out.println();
        while (!scanner.hasNextInt()) {
            System.out.println("Zahl eingeben");
            scanner.nextLine();
        }
        int inputSpeicher = scanner.nextInt();

        while (inputSpeicher > speicherkarte.size() || inputSpeicher < 1) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 3 ein!!!");
            while (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben");
                scanner.nextLine();
            }
            inputSpeicher = scanner.nextInt();
            scanner.nextLine();
        }
        currentCamera.mountSpeicherkarte(speicherkarte.get(inputSpeicher - 1));
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
