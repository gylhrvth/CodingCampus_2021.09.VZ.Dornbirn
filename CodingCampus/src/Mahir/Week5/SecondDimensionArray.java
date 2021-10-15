package Mahir.Week5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecondDimensionArray {
    public static void main(String[] args) {


    }

    private static String fileReader(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = buffer.readLine();
            if (line == null) {
                break;
            }
            buffer.close();
            sb.append(line).append(System.lineSeparator());
        }

        return sb.toString();

    }
}
