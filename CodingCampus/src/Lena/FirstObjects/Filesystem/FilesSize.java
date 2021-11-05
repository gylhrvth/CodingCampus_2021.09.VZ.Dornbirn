package Lena.FirstObjects.Filesystem;

import java.io.File;

public class FilesSize extends FileReceiver {

    private long filesSize=0;

    public void onFileReceived(File file) {
        this.filesSize=file.length();
    }
}
