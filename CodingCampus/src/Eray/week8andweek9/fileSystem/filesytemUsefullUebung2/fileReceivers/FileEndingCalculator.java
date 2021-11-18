package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;

public class FileEndingCalculator extends FileReceiver {
    private int countFileEnding = 0;
    private final String fileEndingName;

    public FileEndingCalculator(String fileEndingName) {
        this.fileEndingName = fileEndingName;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        String fileName = file.getName();
        if(fileName.endsWith(fileEndingName)) {
            countFileEnding++;
        }

    }


    public int getCountFileEnding() {
        return countFileEnding;
    }

    @Override
    public String toString() {
        return fileEndingName;

    }
}
