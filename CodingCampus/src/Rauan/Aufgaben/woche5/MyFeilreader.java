package Rauan.Aufgaben.Woche5;

import Niklas.filereadwrite.CharCounter;
import Niklas.filereadwrite.FileReader;
import org.w3c.dom.Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFeilreader {
    public static void main(String[] args) {
        readFeil();
    }


    public static void readFeil() {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirnh\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

         task1ReverseLineContent(path);
        //task2ReverseLineOrder(path);

   }

   private static void task1ReverseLineContent(String path){
       try {
           File file = new File(path);
           Scanner myReader = new Scanner(file);

           while (myReader.hasNextLine()) {
               String line = myReader.nextLine();

               char[] mycharArray = line.toCharArray();
               for (int i = mycharArray.length - 1; i >= 0; i--) {
                   System.out.print(mycharArray[i]);
               }
               System.out.println();
           }
           myReader.close();
       } catch (FileNotFoundException fnfe) {
           fnfe.printStackTrace();
       }
   }

   private static void task2ReverseLineOrder(String path){
        // Initialize
        String[] fileContent = new String[getLineCount(path)];

        // Fill the array
       try {
           File file = new File(path);
           Scanner myReader = new Scanner(file);

           int idx = 0;
           while (myReader.hasNextLine()) {
               fileContent[idx] = myReader.nextLine();
               ++idx;
           }
           myReader.close();
       } catch (FileNotFoundException fnfe) {
           fnfe.printStackTrace();
       }

       // Logic
        for (int i = fileContent.length - 1; i >= 0; i--) {
           System.out.println(fileContent[i]);
        }
   }


    private static int getLineCount(String path) {
        int lineCount = 0;

        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                myReader.nextLine();
                ++lineCount;
            }
            myReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        return lineCount;
    }



}


