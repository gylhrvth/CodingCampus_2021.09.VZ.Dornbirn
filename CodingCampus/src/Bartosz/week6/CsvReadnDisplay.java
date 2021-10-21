package Bartosz.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CsvReadnDisplay {
    public static void main(String[] args) {
        String path = "assets/sales_100.csv";
        try {
            printSortedCSV(path);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    private static void printSortedCSV(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = "";

        try {
            while(true) {
                if((line = br.readLine()) != null){

                } else {

                }
            }

        } finally {
            try {
                br.close();
            } catch (IOException notFound) {

            }
        }
    }
}
