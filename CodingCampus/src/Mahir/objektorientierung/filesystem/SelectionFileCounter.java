package Mahir.objektorientierung.filesystem;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class SelectionFileCounter extends FileReceiver{

    static List<File> files = new LinkedList<>();

    public static void main(File file,int depth,String searchWord){
        onFileRecived(file,depth);
        selectFiles(searchWord);
    }

    public static void selectFiles(String searchFileExtension){
        int counter = 0;
        for (File select : files){
            if (select.getName().endsWith(searchFileExtension)){
                System.out.println("List of searched files:");
                System.out.println(select.getName());
                counter++;
            }
        }
        System.out.println(counter + "files found");
    }



}
