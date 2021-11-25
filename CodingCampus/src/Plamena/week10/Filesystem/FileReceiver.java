package Plamena.week10.Filesystem;

import java.io.File;

public abstract class FileReceiver {

    public abstract void onFileReceived(int depth, File file);
}
