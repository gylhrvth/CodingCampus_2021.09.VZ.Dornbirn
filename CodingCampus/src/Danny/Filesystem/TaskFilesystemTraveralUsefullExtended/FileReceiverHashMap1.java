package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.util.HashMap;

public class FileReceiverHashMap1 extends SelectionFileCounter1 {
    public static void main(File file, int depht) {

        onFileReceived(file, depht);
        System.out.println();

        HashMap<Integer, String> fileExtension = new HashMap<Integer, String>();
        fileExtension.put(1, ".java");
        fileExtension.put(2, ".xml");
        fileExtension.put(3, ".txt");

        hashMap(fileExtension);

    }

    public static void hashMap(HashMap<Integer, String> fileExtension) {

        for (int key : fileExtension.keySet()) {
            selectFiles(fileExtension.get(key));
        }
    }

    public static void selectFiles(String Extension) {
        int counter = 0;
        for (File selectfile : files) {
            if (selectfile.getName().endsWith(Extension)) {
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " Dateie(n) mit der Endung " + Extension + " gefunden.");
    }

}
