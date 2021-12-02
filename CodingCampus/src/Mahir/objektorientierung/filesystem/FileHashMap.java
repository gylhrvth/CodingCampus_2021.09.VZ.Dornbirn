package Mahir.objektorientierung.filesystem;

import java.io.File;
import java.util.HashMap;

public class FileHashMap extends SelectionFileCounter {
    public static void main(File file, int depth) {

        onFileRecived(file, depth);
        System.out.println();

        HashMap<Integer, String> fileExtension = new HashMap<>();
        fileExtension.put(1, ".java");
        fileExtension.put(2, ".xml");
        fileExtension.put(3, ".txt");

        hashmap(fileExtension);
    }

    public static void hashmap(HashMap<Integer, String> fileExtension) {
        for (int key : fileExtension.keySet()) {
            SelectionFileCounter.selectFiles( fileExtension.get(key));
        }
    }

}
