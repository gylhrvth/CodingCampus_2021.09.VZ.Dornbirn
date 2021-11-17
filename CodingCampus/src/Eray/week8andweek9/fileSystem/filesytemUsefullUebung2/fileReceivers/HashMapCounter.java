package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;
import java.util.HashMap;

public class HashMapCounter extends FileReceiver {

    public HashMap<Integer, String> hashMap = new HashMap<Integer, String>();


    @Override
    public void onFileReceived(int depth, File file) {
        hashMap.put(1, ".java");
        hashMap.put(2, ".csv");
        hashMap.put(3, ".txt");
        hashMap.put(4, ".png");


        for (int i = 0; i < hashMap.size(); i++) {
            getFileEndings(hashMap.get(i), file);
        }
    }

    public void getFileEndings(String fileEnding, File file) {
        int counter = 0;
        while (fileEnding.endsWith(file.getName())) {
            counter++;
        }

        System.out.println("Die Datei mit der Endung " + fileEnding + " kommt " + counter + " mal vor!");
    }
}
