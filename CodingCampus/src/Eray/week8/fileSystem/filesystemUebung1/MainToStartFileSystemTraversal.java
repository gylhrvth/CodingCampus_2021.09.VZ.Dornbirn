package Eray.week8.fileSystem.filesystemUebung1;

import Eray.week8.fileSystem.filesystemUebung1.FileTreeDatas;

import java.io.File;
import java.io.FileNotFoundException;

public class MainToStartFileSystemTraversal {

    public static void main(String[] args) {
        printAll();
    }

    public static void printAll() {

        File file = new File("CodingCampus/src/Eray");


        try {
            //Der Pfad wird im FileTreeDatas geändert
            FileTreeDatas.printFullFileTree(file);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Der Datei Pfad ist nicht richtig bitte gebe einen richtigen Pfad ein!!");
        }

    }

}
