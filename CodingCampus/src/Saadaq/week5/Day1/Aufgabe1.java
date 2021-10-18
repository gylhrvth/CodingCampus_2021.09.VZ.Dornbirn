package Saadaq.week5.Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aufgabe1 {


    public static void main(String[] args) throws FileNotFoundException {

       File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");

        System.out.println("Does it exits: " + file.exists());

        System.out.println("is it folder: "+ file.isDirectory());

        System.out.println("is it Data: "+ file.isFile());

        System.out.println("this is file reader and reads "+ readFile("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt"));




        File[] arrayTest = file.listFiles();

        // Creates Java Scanner Object









            }// End of Main

    public static double convertToMB(long sizeInByte){ return sizeInByte / 1024 * 1024.0; }





    public static String readFile(String path){
        try{
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            StringBuilder stringBuilder = new StringBuilder();

            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }

            myReader.close();
            return  stringBuilder.toString();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return  "";
    }




}//End of Class
