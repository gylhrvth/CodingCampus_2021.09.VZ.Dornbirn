package Lena.FirstObjects.Filesystem;

import java.io.File;

public class FileReceiver {

    public void onFileReceived(int depth, File file) {
        System.out.println("File received");
    }
}
