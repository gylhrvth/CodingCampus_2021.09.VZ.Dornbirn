package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class SelectionFileCounter1 extends FileReceiver1 {

    public String extension = ".xml";

    public static int counter = 0;

    @Override
    public void onFileReceived(File child) {
        if (child.isFile() && child.getName().endsWith(extension)) {
            counter++;
        }
    }
}

