package Stjepan.week6;

import java.io.*;
import java.util.Scanner;

public class stday3 {
    public static void main(String[] args) throws IOException {
        String input = "";
        System.out.println("Geben Sie einen Text ein: ");


        try {
            writeFile("assets/tmp/outputStjepan.txt", input);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }
        // System.out.println(writeFile(input));
    }



    private static void writeFile(String path, String input) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        try {
            writer.write(input);
        } finally {
            try {
                writer.close();
            } catch (IOException exc) {
            }
        }
    }
}
