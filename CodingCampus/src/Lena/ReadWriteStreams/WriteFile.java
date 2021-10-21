package Lena.ReadWriteStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        writeUserInput();
    }

    private static void writeUserInput() throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("assets/tmp/output.txt"));

        System.out.println("Geben Sie etwas ein:");
        String userInput = sc.nextLine();
        try {
            while (!userInput.equals("")){
                bw.write(userInput);
                bw.write(System.lineSeparator());
                userInput=sc.nextLine();
            }
        }finally {
            try {
                bw.close();
            }catch (IOException exception){

            }
        }

    }
}
