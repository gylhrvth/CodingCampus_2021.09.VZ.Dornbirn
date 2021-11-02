package Ingo.week7.day1;

import java.io.*;

public class ReadAFileBufferedReader {

    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\DCV\\Desktop\\output2-copy.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Desktop\\output2.txt"));
            String line;
            while((line = br.readLine()) != null){
                writer.write(line + "\n");
            }
            br.close();
            writer.close();

        }catch(IOException exc){
            exc.printStackTrace();
        }
    }

}
