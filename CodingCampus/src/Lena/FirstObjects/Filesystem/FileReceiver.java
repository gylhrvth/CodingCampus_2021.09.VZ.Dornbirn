package Lena.FirstObjects.Filesystem;

import java.io.File;

public class FileReceiver {

    public void onFileReceived(File file, int depth) {
        File[] files = file.listFiles();
        String dictionaryPrefix = "|--";
        String filePrefix = "|--";
        String depthPrefix = "|  ";

        for (File f : files) {

            if (f.isDirectory()) {
                for (int i = 0; i < depth; i++) {
                    System.out.print(depthPrefix);
                }
                System.out.println(dictionaryPrefix + f.getName());
                onFileReceived(f, depth + 1);

            } else {
                for (int i = 0; i < depth; i++) {
                    System.out.print(depthPrefix);
                }
                System.out.println(filePrefix + f.getName());
            }

        }
    }
}
