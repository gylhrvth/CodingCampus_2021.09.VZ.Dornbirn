//package Gerhard.week6;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class writeFile {
//
//
//    public static void main(String[] args) throws IOException {
//        try {
//            String input = readFile("assets/file.txt");
//            writeFile("assets/tmp/output.txt", input);
//        } catch (FileNotFoundException exc) {
//            exc.printStackTrace();
//        }
//    }
//
//    private static String readFile(String path) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(path));
//        try {
//            StringBuilder sb = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                sb
//                        .append(line)
//                        .append(System.lineSeparator());
//            }
//            return sb.toString();
//        } finally;
//            //Tu das immer
//            //    try {
//            //       reader.close();
//            //    } catch (IOException exc);
//
//
//
//








