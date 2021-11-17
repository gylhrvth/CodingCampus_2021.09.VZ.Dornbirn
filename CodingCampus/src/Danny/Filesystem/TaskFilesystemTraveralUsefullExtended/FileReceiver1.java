package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReceiver1 {


    public void onFileReceived(File child) throws FileNotFoundException {
        File[] fileArry = child.listFiles();
        if (fileArry != null) {
            if (child.isFile()) {

            } else {

            }
        }
    }
}
