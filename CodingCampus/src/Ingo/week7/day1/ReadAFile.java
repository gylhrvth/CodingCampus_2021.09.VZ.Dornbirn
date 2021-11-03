package Ingo.week7.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader
                    (new FileReader("C:\\Users\\DCV\\Desktop\\newfile.txt"));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        }catch (IOException exc){
            exc.printStackTrace();
        }

    }
}
