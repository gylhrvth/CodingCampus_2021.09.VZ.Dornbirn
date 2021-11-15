package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class FileReceiverSize1 extends FileReceiver1 {

    public void onFileReceived(File child, int depht) {
        if (child.isFile()) {
            printIndentation(depht);
            System.out.println("|--" + child.getName() + " Size: " + child.length());
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

