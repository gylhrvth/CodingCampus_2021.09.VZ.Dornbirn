package Ingo.week6.day3;

import Ingo.week1.IngoChristbaumTag6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteTextEingabe {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String eigenerText = scanner.nextLine();

        try{
            WriteFile.writeFile("assets/tmp/output.txt", eigenerText);
            String path = "assets/file.txt";
         //   String input = WriteFile.readFile(path); brauch ich nur wenn text eingelesen wird von einer datei !!

        }catch (IOException exc){
            exc.printStackTrace();
        }
    }
}
