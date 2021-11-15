package Stefan.WeekNine.CameraObjektivSpeicher;

import Stefan.WeekNine.Fotoapparat.CameraMethoden;

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
            //System.out.println("[" + (i + 1) + "] " + cameraNew.get(i).getProducer() + " " + cameraNew.get(i).getModel() + " " + cameraNew.get(i).getMp() + "MP");
            System.out.println("[" + (i + 1) + "] " + cameraNew.get(i));
        }
        System.out.println();

        int inputCamera = queryInput(cameraNew.size());
        currentCamera = cameraNew.get(inputCamera - 1);

        //Auswahl Objektiv
        System.out.println("Welches Objektiv wollen sie verwenden:");
        for (int i = 0; i < objektivs.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + objektivs.get(i).getFocalLengthMin() + "-->>" + objektivs.get(i).getFocalLengthMax() + " f" + objektivs.get(i).getLightIntensity() + " " + objektivs.get(i).getBlende());
        }
        System.out.println();

        int inputObjektiv = queryInput(objektivs.size());
        currentCamera.mountObjectiv(objektivs.get(inputObjektiv - 1));

        //Auswahl Speicherkate
        System.out.println("Welche Speicherkarte wollen sie:");
        for (int i = 0; i < speicherkarte.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + speicherkarte.get(i).getSizeInGB() + "GB");
        }
        System.out.println();

        int inputSpeicher = queryInput(speicherkarte.size());
        currentCamera.mountSpeicherkarte(speicherkarte.get(inputSpeicher - 1));

        System.out.println();
        System.out.println("Gewählte Konfiguration:\n" + currentCamera);

        //Rechnet aus wieviel Photos gemacht werden können mit der gewählten Speicherkarte
        Speicherkarte photo = currentCamera.makePhotos();

        System.out.println();
        System.out.printf("Sie können mit der Gewählten Speicherkarte %d Fotos machen.", photo.getSizeInGB());

        //Fotos machen
        photo.setSizeInGB(photo.getSizeInGB() - 1);
        System.out.println();
        System.out.println("Wollen Sie gleich mal ein paar bilder machen? [1]Ja / [2]Nein");

        int inputPhoto = queryInput(2);

        int sum = 0;
        while (true) {
            if (inputPhoto == 1) {
                sum++;
                System.out.println(CameraMethoden.loadPhoto());
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

    //Scanner eingabe Prüfung
    public static int queryInput(int maxInput) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Zahl eingeben!");
                scanner.nextLine();
            } else {
                input = scanner.nextInt();
                if (input >= 1 && input <= maxInput) {

                    break;
                }
                System.out.println("Geben Sie eine korrekte Zahl ein");
            }
        }
        return input;
    }
}
