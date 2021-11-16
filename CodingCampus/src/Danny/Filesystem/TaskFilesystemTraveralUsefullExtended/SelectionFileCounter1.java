package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class SelectionFileCounter1 extends FileReceiver1 {
    public static int counter = 0;

    //@Override
    public static void onFileReceived(File child, String extension) {
        if (child.isFile() && child.getName().endsWith(extension)) {
            counter++;
        }
    }
}

