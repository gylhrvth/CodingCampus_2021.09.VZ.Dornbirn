package Ingo.week9.fileSystemRecursion;

import java.io.File;

public class FileSystemResursive {

    public static void main(String[] args) {

        File file = new File("C:\\");
        File[] fileArray = file.listFiles();

        if(file.isDirectory()) {
            System.out.println(file);
        }
        if(file.isFile()) {
            for (int i = 0; i < fileArray.length; i++) {
                System.out.println(fileArray);
            }
        }

    }


}


