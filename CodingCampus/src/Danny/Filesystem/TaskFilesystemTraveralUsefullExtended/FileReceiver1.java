package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class FileReceiver1 {


    public void onFileReceived(File child) {
        File[] fileArry = child.listFiles();
        if (fileArry != null) {
            if (child.isFile()) {

            } else {

            }
        }
    }
}
