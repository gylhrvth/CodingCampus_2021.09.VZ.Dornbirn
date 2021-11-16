package Danny.Filesystem.TaskFilesystemTraveralUsefullExtended;

import java.io.File;

public class FileReceiverSize1 extends FileReceiver1 {
   public static int size = 0;



 //   @Override
    public void onFileReceived(File child) {
        if (child.isFile()) {
            size += child.length();

        }
    }

    public int getSize() {
        return size;
    }
}

