package Ingo.week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Filesystem {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus");
        File[] fileArray = file.listFiles();
        int deep = 0;

        try {
            while (true) {
                if (!file.exists()) {
                    throw new FileNotFoundException("File does not exists !");
                }

                if (fileArray != null) {
                    for (File child : fileArray) {
                        if(child.isFile()) {
                            System.out.println(child.getName());
                        }else{
                            if (deep == 0) {
                                System.out.println("----");
                            }deep++;
                        }
                    //    System.out.println("----");
                    }

                }break;
            }


        } catch (IOException exc) {
            exc.printStackTrace();
        }


//        for (int i = 0; i < fileArray.length; i++) {
//            File kinder = fileArray[i];
//        //    System.out.println(Arrays.toString(kinder.list()));
//            System.out.println("-------------------------------");
//            System.out.println(kinder.getAbsoluteFile());
//        }


//        System.out.println(fileArray);

//        for(File child : fileArray){
//            System.out.println(child);
//        }
//        System.out.println("------------------------------------------");
//        for (int i = 0; i < fileArray.length; i++) {
//            File child = fileArray[i];
//            System.out.println(child.getAbsoluteFile());

//            if(child.isFile()) {
//                System.out.println(child.length()+" isHidden: "+child.isHidden());
//            }
//            System.out.println("--------------------------------");
//            if(childs.isDirectory()) {
//                System.out.println(childs.length());
//            }
//            System.out.println("----------------------------------");
//            if(childs.isAbsolute()) {
//                System.out.println(Arrays.toString(childs.listFiles()));
//            }
    }
//        System.out.println("-----------------------------");
//        for (int i = 0; i < fileArray.length; i++) {
//            File childs = fileArray[i];
//            if(childs.isHidden()) {
//                System.out.println(childs);
//            }
//        }
}


