package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class SelectionFileCounter1 extends FileReceiver1 {

    static List<File> files = new LinkedList<>();

    public static void main(File file, int depht,String searchWord) {
        String searchFileExtension = (searchWord);
        onFileReceived(file, depht);
        selectFiles(searchFileExtension);
    }

    public static void selectFiles(String searchFileExtension) {
        int counter = 0;
        for (File selectfile : files) {
            if (selectfile.getName().endsWith(searchFileExtension)) {
                System.out.println("\nListe der Dateien mit der gesuchten Endung:");
                System.out.println(selectfile.getName());
                counter++;
            }
        }
        System.out.println("Es wurden " + counter + " Dateie(n) gefunden.");
    }

    public static void onFileReceived(File child, int depht) {
            if (child.isFile()) {
                printIndentation(depht);
                System.out.println("|--" + child.getName());
                files.add(child);
            } else {
                if (depht == 0) {
                    System.out.println("|");
                }
                printTurnover(depht);
                printIndentation(depht);
                System.out.println("|--" + child.getName());

            }
        }

    }

