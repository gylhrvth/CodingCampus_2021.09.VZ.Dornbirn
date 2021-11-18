package Danny.Filesystem.TaskFilesystemTraversalUsefull;

import java.io.File;

public class FileReceiver {

    public static void onFileReceived(File file, int depht) {
        for (File child : file.listFiles()) {
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
                onFileReceived(child, depht + 1);
            }
        }
        if (file.listFiles().length == (depht)) {
            depht--;
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
