package Lena.BigFilesExcercise;

import java.io.*;

public class SortBigFile {

    private static final String SOURCE_PATH = "assets/tmp/";
    private static final String FILENAME_OUTPUT_MERGE = "outputMerge";
    private static final String FILENAME_SPLIT_FILE = "splitFile";

    private static final int BUFFER_SIZE = 8 * 1024;

    public static void main(String[] args) throws IOException {

        //   String[] sort = {"sfkdjf", "lskdn", "ladksf", "lkdjf"};

        splitFileIntoSmallerFiles("assets/tmp/newFileFromIntelliJ.txt");
    }


    public static void splitFileIntoSmallerFiles(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path), BUFFER_SIZE);
        int filePathIndex = 0;
        String line = "";

        while (line != null) {
            filePathIndex++;
            StringBuilder sb = new StringBuilder();
            while (sb.length() < 1024L * 1024 * 100 && ((line = br.readLine()) != null)) {
                sb.append(line);
            }
            String[] temp = clearString(sb.toString()).split(" ");
            fillFile(mergeSort(temp, 0, temp.length), filePathIndex);
        }
        br.close();

    }

    public static void mergeToOutputFile(String path1, int filePathIndex) throws IOException {

        String lastOutput = SOURCE_PATH + FILENAME_OUTPUT_MERGE + filePathIndex + ".txt";
        String newOutput = SOURCE_PATH + FILENAME_OUTPUT_MERGE + (filePathIndex + 1) + ".txt";

        File f = new File(newOutput);
        BufferedWriter bwOutput = new BufferedWriter(new FileWriter(f), BUFFER_SIZE);

        BufferedReader readFile1 = new BufferedReader(new FileReader(path1), BUFFER_SIZE);
        BufferedReader readLastOutputFile;
        try {
            readLastOutputFile = new BufferedReader(new FileReader(lastOutput), BUFFER_SIZE);
        } catch (FileNotFoundException exception) {
            exception.fillInStackTrace();
            File f2 = new File(SOURCE_PATH + FILENAME_OUTPUT_MERGE + filePathIndex + ".txt");
            f2.createNewFile();
            readLastOutputFile = new BufferedReader(new FileReader(SOURCE_PATH + FILENAME_OUTPUT_MERGE + filePathIndex + ".txt"), BUFFER_SIZE);
        }

        String lineFile1 = readFile1.readLine();
        String lineFile2 = readLastOutputFile.readLine();

        long start = System.currentTimeMillis();

        while (lineFile1 != null || lineFile2 != null) {

            if (lineFile2 == null || (lineFile1 != null && lineFile1.compareTo(lineFile2) < 0)) {
                bwOutput.write(lineFile1);
                bwOutput.write(System.lineSeparator());
                lineFile1 = readFile1.readLine();
            } else {
                bwOutput.write(lineFile2);
                bwOutput.write(System.lineSeparator());
                lineFile2 = readLastOutputFile.readLine();
            }
        }
        bwOutput.close();

        long stop = System.currentTimeMillis();
        System.out.println("Merging took: " + (stop - start) + "ms");
    }

    public static void fillFile(String[] arr, int filePathIndex) throws IOException {
        long start = System.currentTimeMillis();
        System.out.println("Starting file output..." + arr.length);
        File f = new File(SOURCE_PATH + FILENAME_SPLIT_FILE + filePathIndex + ".txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(f), BUFFER_SIZE);
        for (int i = 0; i < arr.length; i++) {
            writer.write(arr[i]);
            writer.newLine();
        }

        long stop = System.currentTimeMillis();
        System.out.println("Writing took: " + (stop - start) + "ms");

        mergeToOutputFile(SOURCE_PATH + FILENAME_SPLIT_FILE + filePathIndex + ".txt", filePathIndex);

        writer.close();
    }

    private static String clearString(String string) {
        String cleardString = string
                .replaceAll("[\\(\\):',“„″.;′†–£|·°]|\\.[ \n]", " ")
                .replaceAll("\n+", " ")
                .replaceAll("\r+", " ")
                .replaceAll("\t+", " ")
                .replaceAll("\\s+", " ");

        return cleardString;
    }


    public static String[] mergeSort(String[] data, int start, int end) {

        if (end - start > 1) {
            int middle = start + (end - start) / 2;

            mergeSort(data, start, middle);
            mergeSort(data, middle, end);

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
            if ((idxRight == end) || ((idxLeft < middle) && (source[idxLeft].compareTo(source[idxRight]) < 0))) {
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
