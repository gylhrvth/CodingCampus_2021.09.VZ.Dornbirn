package Plamena.week10.Filesystem;

import java.io.File;
import java.util.Arrays;

public class FilesystemMain {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\DCV\\Desktop\\Calculator");
        listFilesAndDirectories(dir, 0);
    }

    public static String listFilesAndDirectories(File dir, int depth) {

        try {
            if (dir.isFile()) {
                System.out.println();
                for (int i = 0; i < depth*2; i++) {
                    System.out.print(" ");
                }
                System.out.print(dir.getName());
            } else if (dir.isDirectory()) {
                System.out.println();
                for (int i = 0; i < depth*2; i++) {
                    System.out.print(" ");
                }
                System.out.print(dir.getName());
                File[] dirContent = dir.listFiles();
                for (File file : dirContent) {
                    listFilesAndDirectories(file, depth + 1);
                }

            }
        } catch (NullPointerException npe) {
            npe.fillInStackTrace();
        }
        return "";
    }
}
