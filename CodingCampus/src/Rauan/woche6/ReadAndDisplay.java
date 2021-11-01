package Rauan.woche6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndDisplay {
    public static void main(String[] args) {

        String input = "assets/file.txt";
        Scanner scan = new Scanner(System.in);

        System.out.print("assets/file.txt");
        input = scan.nextLine();

        String line = null;
        try
        {
            FileReader fileReader = new FileReader(input);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + input + "'");
        }
    }
}
