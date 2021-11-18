package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class HashMapCounter extends FileReceiver {
    private String[] fileEndings;

    public Map<String, Integer> hashMap = new HashMap<>();

    public HashMapCounter(String... fileEndings) {
        this.fileEndings = fileEndings;
    }

    @Override
    public void onFileReceived(int depth, File file) {
        if (checkFileEnding(file)) {
            for (int i = 0; i < fileEndings.length; i++) {
                if (fileEndings[i].equals(getFileEnding(file))) {
                    addOneToHashmap(fileEndings[i]);
                    break;
                }
            }
        }
    }

    protected void addOneToHashmap(String fileEnding) {
        if (hashMap.containsKey(fileEnding)) {
            //Autoboxing
            int counter = hashMap.get(fileEnding);
            counter++;
            hashMap.put(fileEnding, counter);
        } else {
            hashMap.put(fileEnding, 1);
        }
    }

    protected String getFileEnding(File file) {
        String fileName = file.getName();
        int lastIndexOf = fileName.lastIndexOf(".");
        return fileName.substring(lastIndexOf);
    }


    private boolean checkFileEnding(File file) {
        if (file.isFile()) {
            for (String fileExtension : fileEndings) {
                if (file.getName().endsWith(fileExtension)) {
                    return true;
                }
            }
        }
        return false;
    }
}
