package Ingo.week9.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class RecursionFileSystem {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "";
        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus");
        File[] fileArray = file.listFiles();
        listFile(file,0);



    }

    public static void listFile(File file, int deep) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("File does not exist");
        }
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File child : fileArray) {
                if (child.isFile()) {
                    printIndentation(deep);
                    System.out.println("|->" + child.getName());
                } else {
                    if (deep == 0) {
                        System.out.println("|");
                    }
                    printTurnover(deep);
                    printIndentation(deep);
                    System.out.println("|->" + child.getName());
                    listFile(child, deep + 1);
                }
            }
        }

    }
    public static void printIndentation(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("|  ");
        }
    }


    public static void printTurnover(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("|  ");
        }
        System.out.print("|");
        System.out.println();
    }
}