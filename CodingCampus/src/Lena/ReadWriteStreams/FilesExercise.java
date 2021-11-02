package Lena.ReadWriteStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FilesExercise {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "assets/file.txt";

        System.out.println(countWords(path));
        countChars(path);


    }

    private static String readFile(String path) throws FileNotFoundException {
        String fileContent="";
        try {
            File file = new File(path);
            Scanner scn = new Scanner(file);
            StringBuilder sb = new StringBuilder();

            while (scn.hasNextLine()) {
                sb.append(scn.nextLine());
            }

            fileContent = sb.toString();

            return fileContent;
        } catch (
                FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }


        return fileContent;
    }

    private static int countWords(String path) throws FileNotFoundException {
        String fileContent = readFile(path);
        clearString(fileContent);
        String[] countArray = fileContent.split(" ");
        return countArray.length;
    }

    private static int countChars (String path) throws FileNotFoundException {
        String fileContent = readFile(path);
        char [] charArray = fileContent.toCharArray();
        int [] charsCountArray = new int[124];

        for (char c:charArray){
            int i = c-32;
            if(i>=0&&i<charsCountArray.length){
                charsCountArray[i]++;
            }
        }
        for (int i=0; i< charsCountArray.length;i++){
            if(charsCountArray[i]>0){
            System.out.println("The Char "+ (char)(i+32)+" kam "+ charsCountArray[i]+"mal vor.");
            System.out.println("Das sind "+((float)charsCountArray[i]/(float)charArray.length)*100+"% der gesammten Chars");
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(charsCountArray));
        System.out.println(charArray.length);
        return charArray.length;

    }

    private static String clearString(String string) {
        String cleardString = string
                .replaceAll("\"[·'£–„“†():;,.\\[\\]| \\n\\-]\"", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\\s+", " ");

        return cleardString;
    }
}
