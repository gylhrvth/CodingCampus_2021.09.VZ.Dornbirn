package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class FileReceiver1 {

    public static void onFileReceived(File child, int depht) {
        if (child.isFile()) {
            printIndentation(depht);
            System.out.println("|--" + child.getName());
        } else {
            if (depht == 0) {
                System.out.println("|");
            }
            printTurnover(depht);
            printIndentation(depht);
            System.out.println("|--" + child.getName());
        }
    }

    public static void printIndentation(int depht) {
        for (int i = 0; i < depht; i++) {
            System.out.print("|  ");
        }
    }

    public static void printTurnover(int depht) {
        for (int i = 0; i < depht; i++) {
            System.out.print("|  ");
        }
        System.out.print("|");
        System.out.println();
    }
}
