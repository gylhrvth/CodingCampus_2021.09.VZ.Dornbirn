package Lena.FilesExcercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SortBigFile {

    public static void main(String[] args) throws IOException {

        String[] sort ={"sfkdjf", "lskdn", "ladksf", "lkdjf"};

        System.out.println(Arrays.toString(splitFileIntoArraysAndSort("assets/tmp/newFileFromIntelliJ.txt")));



    }


    public static String[] splitFileIntoArraysAndSort(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        while (sb.length()<1024L*1024*100){
            sb.append(br.readLine());
        }

        String[]input = sb.toString().split("[ \n]");
        return mergeSort(input, 0, input.length);


    }





    public static String[] mergeSort( String[]data, int start, int end){

        if (end - start > 1){
            int middle = start + (end - start) / 2;

            mergeSort( data, start, middle);
            mergeSort(  data, middle, end);

            String[] tempArray = micromerge(data, start, middle, end);

            for (int i = 0; i < tempArray.length; i++) {
                data[start + i] = tempArray[i];
            }
        }

        return data;
    }

    public static String[] micromerge(String[] source, int start, int middle, int end) {

        String[] result = new String[end - start];
        int idxResult = 0;
        int idxLeft = start;
        int idxRight = middle;

        while ((idxLeft < middle) || (idxRight < end)) {
            if ((idxRight == end) || ((idxLeft < middle) && (source[idxLeft].compareTo(source[idxRight])<0))) {
                result[idxResult] = source[idxLeft];
                ++idxLeft;
            } else {
                result[idxResult] = source[idxRight];
                ++idxRight;
            }
            ++idxResult;
        }

        return result;
    }
}
