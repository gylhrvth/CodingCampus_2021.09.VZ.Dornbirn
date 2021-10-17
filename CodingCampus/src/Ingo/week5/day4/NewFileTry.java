package Ingo.week5.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewFileTry {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        String text = "";

        try {
            File file = new File(path);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                char[] charArr = line.toCharArray();
                int charCount = 0;
                for (int i = 0; i < 255; i++) {
                    for (int j = 0; j < charArr.length; j++) {
                        if(charArr[j] == i){
                            charCount++;

                        }
                    }System.out.println("char ist " + (char)i + "Text einfach " + charCount);

                }

            }

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }

}
