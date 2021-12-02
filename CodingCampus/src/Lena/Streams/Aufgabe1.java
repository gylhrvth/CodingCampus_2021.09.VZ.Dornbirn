package Lena.Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aufgabe1 {
    public static void main(String[] args) throws IOException {
        String path = "assets/file.txt";
        readFile(path);
    }

    public static String readFile(String path) throws IOException {
        BufferedReader br  = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        while (br.readLine()!=null){
            sb
                    .append(br.readLine())
                    .append(System.lineSeparator());
        }
        br.close();
        System.out.println(sb.capacity());
        String text = sb.toString();
        System.out.println("readFile finished " + text.length());
        return text;

    }
}
