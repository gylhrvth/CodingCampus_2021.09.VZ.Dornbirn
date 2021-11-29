package Mahir.objektorientierung.filesystem;

import java.io.File;

public class FileRecieverSize extends FileReceiver{
    public static void onFileReceived(File file, int depht) {
        for (File child : file.listFiles()) {
            if (child.isFile()) {
                Filesystem.printIndentation(depht);
                System.out.println("|--" + child.getName() + " Size: " + child.length());
            } else {
                if (depht == 0) {
                    System.out.println("|");
                }
                Filesystem.printTurnover(depht);
                Filesystem.printIndentation(depht);
                System.out.println("|--" + child.getName());
                onFileReceived(child, depht + 1);
            }
        }
        if (file.listFiles().length == (depht)) {
            depht--;
        }
    }
}
