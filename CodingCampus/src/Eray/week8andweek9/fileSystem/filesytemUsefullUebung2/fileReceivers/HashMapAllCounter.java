package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class HashMapAllCounter extends HashMapCounter {
    @Override
    public void onFileReceived(int depth, File file) {
        String getOnlyFileEnding = getFileEnding(file);
        addOneToHashmap(getOnlyFileEnding);
    }
}
