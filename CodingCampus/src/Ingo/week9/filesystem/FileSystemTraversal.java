package Ingo.week9.filesystem;

import java.io.File;

public class FileSystemTraversal {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\Desktop");
//        File file1 = new File("C:\\");
//        File[] files = file.listFiles();
        //    listDir(file);
     //   System.out.println(getDirSize(file));
        getFileSize(file);
//
//        System.out.println("----------------------------------------------");
//
//        if (files != null) {
//            for (int i = 0; i < files.length; i++) {
//                System.out.println(files[i].getAbsolutePath());
//                if (files[i].isFile()) {
//                    System.out.println(" Ordner\n");
//
//                } else {
//                    System.out.println(" Datei\n");
//                }
//            }
//        }

    }

    public static void listDir(File dir) {

        File[] files = dir.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getAbsolutePath());
                if (files[i].isDirectory()) {
                    System.out.print("  --> (ORDNER)\n");
                    listDir(files[i]); // ruft sich selbst mit dem
                    // Unterverzeichnis als Parameter auf
                } else {
                    System.out.print(" --> (DATEI)\n");
                }
            }
        }
    }

    public static long getDirSize(File file) {

        long size = 0;
        File[] files = file.listFiles();
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    System.out.println(files[i]);
                    size += getDirSize(files[i]); // Gesamtgröße des Verzeichnisses aufaddieren
                    System.out.println(size);
                } else {
                    size += files[i].length(); // Größe der Datei aufaddieren
                    System.out.println(size);
                }
            }
        }
        return size;
    }


    public static int sumRecursiv(int max) {
        if (max >= 0) {
            int previousSum = sumRecursiv(max - 1);
            return previousSum + max;
        } else {
            return 0;
        }
    }

    public static int sum(int max) {
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getFileSize(File file) {
        int size = 0;
        File[] file2 = file.listFiles();
        if (file2 != null) {
            for (int i = 0; i < file2.length; i++) {
                if (file2[i].isDirectory()) {
                    size += getFileSize(file2[i]);
                    System.out.println(size);
                } else {
                    size += file2[i].length();
                    System.out.println(size);

                }
            }

        }return size;

    }
}