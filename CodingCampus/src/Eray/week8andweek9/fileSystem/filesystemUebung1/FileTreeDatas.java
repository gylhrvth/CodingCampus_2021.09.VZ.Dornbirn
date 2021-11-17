package Eray.week8andweek9.fileSystem.filesystemUebung1;

import java.io.File;
import java.io.FileNotFoundException;

public class FileTreeDatas {


    public static void printFullFileTree(File file) throws FileNotFoundException {
        File[] files = file.listFiles();

        String filePrefix = "---";
        int depth = 0;


        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("|---" + f.getName());
                printFiles(f, depth + 1);

            } else {
                System.out.println("---" + f.getName());
            }
        }

    }

    public static void printFiles(File file, int depth) {
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("|  ");
                }
                System.out.println("|--" + f.getName());
                printFiles(f, depth + 1);
            } else {
                for (int i = 0; i < depth; i++) {
                    System.out.print("|  ");
                }
                System.out.println("|--" + f.getName());
            }
        }
    }
}
