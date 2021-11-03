package Ingo.week7.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileToString {
    public static void main(String[] args) {

        try{
            StringBuilder sb = new StringBuilder();
            File file = new File("C:\\Users\\DCV\\Desktop\\newfile.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()){
                sb.append(sc.nextLine()).append(System.lineSeparator());
            }
            sb.toString();
            sc.close();

        }catch (IOException exc){
            exc.printStackTrace();
        }

    }

}
