package Plamena.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws IOException{
        String path = "assets/tmp/output.txt";
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        try{
            String input = sc.nextLine();
            while(!input.equals("")){
                bw.write(input);
                bw.write(System.lineSeparator());
                input = sc.nextLine();
            }
        } finally {
            try {
                bw.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }
}
