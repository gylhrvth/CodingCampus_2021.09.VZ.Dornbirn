package Ingo.week5.home;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeFileTryCatch {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        int countLines = 0;


        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
            }


        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        System.out.println(path);

    }



}
