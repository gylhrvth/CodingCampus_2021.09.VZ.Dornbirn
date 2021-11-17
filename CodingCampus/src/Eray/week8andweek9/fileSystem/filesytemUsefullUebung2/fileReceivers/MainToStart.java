package Eray.week8andweek9.fileSystem.filesytemUsefullUebung2.fileReceivers;

import java.io.File;

public class MainToStart {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Eray\\week1");

        //1  Size of All files
//        FileSizeCalculator fileSizeCalculator = new FileSizeCalculator();
//        FileTree.fileTree(file, fileSizeCalculator);
//        System.out.println("Du hast " + fileSizeCalculator.getFileSize() + " Byte");


        //2  Count how often a File ending Repeats
//
//        FileEndingCalculator fec = new FileEndingCalculator(".java");
//        FileTree ft = new FileTree(fec);
//        ft.fileTree(file);
//        System.out.println("Das File mit der Endung " + fec + " kommt " + fec.getCountFileEnding() + " mal vor");


        //3  Count Different Endings with HashMap

        HashMapCounter hashMapCounter = new HashMapCounter();

        FileTree fileTree = new FileTree(hashMapCounter);
        fileTree.fileTree(file);


    }
}
