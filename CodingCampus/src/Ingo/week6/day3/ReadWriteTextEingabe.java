package Ingo.week6.day3;

import Ingo.week1.IngoChristbaumTag6;

import java.io.*;
import java.util.Scanner;

public class ReadWriteTextEingabe {
    public static void main(String[] args) throws IOException {

        try{
            // String path = "assets/file.txt";
            WriteFile.writeFile("assets/tmp/output.txt", readUserInput());
        }catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }


    }
    private static String readUserInput(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            String input = scanner.nextLine();
            sb
                    .append(input)
                    .append(System.lineSeparator());
            if(input.isEmpty()){
                break;
            }
        }return sb.toString();

    }
}
