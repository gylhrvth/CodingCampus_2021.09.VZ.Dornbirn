package Lena.FirstObjects.Filesystem;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("CodingCampus/src/Lukas");

        printFileSystem(file);
    }

    public static void printFileSystem(File file) {
        File[] files = file.listFiles();
        String dictionaryPrefix = "|--";
        String filePrefix = "---";
        int depth = 0;

        for (File f : files) {

            if (f.isDirectory()) {
                System.out.println(dictionaryPrefix + f.getName());
                printFileSystem(f, depth + 1);

            } else {
                System.out.println(filePrefix + f.getName());
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
