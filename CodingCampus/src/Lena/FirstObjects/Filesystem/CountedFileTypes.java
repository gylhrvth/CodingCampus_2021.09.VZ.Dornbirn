package Lena.FirstObjects.Filesystem;

import java.io.File;
import java.security.Key;
import java.util.HashMap;

public class CountedFileTypes extends FileReceiver {

    private HashMap<String, Integer> countedEndings;


    public CountedFileTypes(){
        setCountedEndings(new HashMap<>());
    }
    public void onFileReceived(File file, int depth) {

        if (!file.isDirectory()) {
            String endig = file.getName().split("\\.")[1];

            if (!countedEndings.containsKey(endig)) {
                countedEndings.put(endig, 1);
            } else {
                countedEndings.put(endig, countedEndings.get(endig) + 1);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String key : countedEndings.keySet()){
            sb
                    .append("Endung: ")
                    .append(key)
                    .append(" kam ")
                    .append(countedEndings.get(key))
                    .append("mal vor");
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    public HashMap<String, Integer> getCountedEndings() {
        return countedEndings;
    }

    public void setCountedEndings(HashMap<String, Integer> countedEndings) {
        this.countedEndings = countedEndings;
    }
}
