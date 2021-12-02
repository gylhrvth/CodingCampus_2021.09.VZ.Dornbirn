package Lena.FirstObjects.Filesystem;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("CodingCampus/src/Lena");

        useFileReceiver(file,0);
    }

    public static void useFileReceiver(File file, int depth){
        File[] files = file.listFiles();
        String dictionaryPrefix = "|--";
        String filePrefix = "|--";
        String depthPrefix = "|  ";
        CountedFileTypes cft = new CountedFileTypes();

        for (File f : files) {

            if (f.isDirectory()) {
                for (int i = 0; i < depth; i++) {
                    System.out.print(depthPrefix);
                }
               // System.out.println(dictionaryPrefix + f.getName());
               useFileReceiver(f, depth+1);
                System.out.println(cft);

            } else {
                cft.onFileReceived(f, depth + 1);

            }

        }


    }


    public static void printFileSystem(File file, int depth) {
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
                printFileSystem(f, depth + 1);

            } else {
                for (int i = 0; i < depth; i++) {
                    System.out.print(depthPrefix);
                }
                System.out.println(filePrefix + f.getName());
            }

        }

    }
}
