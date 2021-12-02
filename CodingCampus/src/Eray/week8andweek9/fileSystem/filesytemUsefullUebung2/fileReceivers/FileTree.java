package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;

public class FileTree {
    private FileReceiver fr;

    public FileTree(FileReceiver fr){
        this.fr = fr;
    }

    public void fileTree(File file) {
        fileTree(file, 0);
    }

    private void fileTree(File file, int depth) {
        File[] files = file.listFiles();

        if(files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    fileTree(f, depth + 1);
                } else {
                    fr.onFileReceived(depth, f);
                }
            }
        }
    }
}
