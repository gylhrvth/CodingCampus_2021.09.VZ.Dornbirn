package Mahir.objektorientierung.filesystem;

import java.io.File;

public class FileReceiver {

    public static void onFileRecived(File file, int depth) {
        for (File child : file.listFiles()) {
            if (child.isFile()) {
                Filesystem.printIndentation(depth);
                System.out.println("|--" + child.getName());
            } else {
                if (depth == 0) {
                    System.out.println("|");
                }
                Filesystem.printTurnover(depth);
                Filesystem.printIndentation(depth);
                System.out.println("|--" + child.getName());
                onFileRecived(child, depth + 1);
            }
        }
        if (file.listFiles().length == (depth)) {
            depth--;
        }
    }
}
