package Eray.week8.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;

public class FileSizeCalculator extends FileReceiver {
    private long fileSize = 0;

    @Override
    public void onFileReceived(int depth, File file) {
        fileSize += file.length();
    }


    public long getFileSize() {
        return fileSize;
    }
}
