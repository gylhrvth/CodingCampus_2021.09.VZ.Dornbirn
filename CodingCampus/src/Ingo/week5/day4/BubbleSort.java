package Ingo.week5.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        String text = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";

        try{
            File file = new File(text);
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }

        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();

        }



    }

    private static void bubbleSortAlphabetically(String textToSort){
        String[] splitText = textToSort.split("\\s+");
        for (int i = 0; i < splitText.length; i++) {
            for (int j = 0; j < splitText.length - 1; j++) {
                int result = splitText[j].compareTo(splitText[j+1]);
                if (result > 0) {
                    String tmp = splitText[j+1];
                    splitText[j+1] = splitText[j];
                    splitText[j] = tmp;
                }

            }
        }
        System.out.println(Arrays.toString(splitText));
    }
}
