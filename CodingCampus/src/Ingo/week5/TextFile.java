package Ingo.week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) {


        String path = "C:\\Users\\terra\\Desktop\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

        try{
            File file = new File(path);
            Scanner myScan = new Scanner(file);

            while (myScan.hasNextLine()){
                String line = myScan.nextLine();
                System.out.println(line);
            }


        } catch (FileNotFoundException fnfe){
            fnfe.toString();
        }


        String[] countLines = path.split("\\s");
        System.out.println(countLines.length);



    }

}
