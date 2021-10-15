package Ingo.week5.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesTryCatch {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        String text = readFileToString(path);

        countAllChars(text);

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);


        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


    }

    public static String readFileToString(String path) {
        try {
            StringBuilder builder = new StringBuilder();
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine()).append(System.lineSeparator());
            }
            return builder.toString();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return null;

    }
    private static void countAllChars(String text){
        char[] countChar = text.toCharArray();
        for (int i = 0; i < 255; i++) {
            int counter = 0;
            for (int j = 0; j < countChar.length; j++) {
                if(countChar[j] == i){
                    counter++;
                }
            }
            System.out.println("The Char " + (char)i + " is " + counter + "times in the text, macht " + percentageCalc(counter,countChar.length));
        }
    }
    private static double percentageCalc(double toCalc,double value){
        return toCalc * 100 / value;
    }
    private static void countAllCharacter(String text){
        char[] charArr = text.toCharArray();
        for (int i = 0; i < 255; i++) {
            int counter = 0;
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == i){
                    counter++;
                }
            }
            System.out.println("char " + (char)i + "...... " + counter);
        }
    }


}
