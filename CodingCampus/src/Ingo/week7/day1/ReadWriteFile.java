package Ingo.week7.day1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

    public static void main(String[] args) {

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DCV\\Desktop\\newfile.txt"));
            bw.write("Das ist eine neue txt Datei!\n" +
                    "und die Datei wurde soeben neu erstellt\n" +
                    "und jetzt wird sie von mir beschrieben ! \n" +
                    "Datei ENDE ! ");
            bw.close();

        }catch (IOException exc) {
            exc.printStackTrace();
        }

    }

}
