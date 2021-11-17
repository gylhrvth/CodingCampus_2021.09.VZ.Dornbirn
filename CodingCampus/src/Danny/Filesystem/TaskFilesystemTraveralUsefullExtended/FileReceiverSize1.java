package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReceiverSize1 extends FileReceiver1 {
   public static int size = 0;



@Override
    public void onFileReceived(File child) throws FileNotFoundException {
        if (child.isFile()) {
            size += child.length();

        }
    }



    public int getSize() {
        return size;
    }
}

