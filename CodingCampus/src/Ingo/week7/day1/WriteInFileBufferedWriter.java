package Ingo.week7.day1;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFileBufferedWriter {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DCV\\Desktop\\output2.txt"));
            bw.write("In eine leere txt Datei mit BufferedWriter rein schreiben. Und einen Zeilenumbruck\n ausgeben" +
                    "das ist eine neue zeile\n" +
                    "und noch eine neue zeile\n" +
                    "ohne zeilenumbruck !\n" +
                    "ENDE");
            bw.close();

        } catch (IOException exc) {
            return;
        }


    }


}
