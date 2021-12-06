package Saadaq.Week6;

import java.io.*;

public class ReadFileWriter {



    public static void main(String[] args)



            throws IOException {


        try {

            String path = "assets/file.txt";
            String input = readFile(path);
            System.out.println(input);
             fileWriter("assets/tmp/output.txt", input);


        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }


    }// End of main

    public static String readFile(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line ;
            while ((line = reader.readLine()) != null) {


                sb.reverse(); // reverse


                sb.append(line)
                        .append(System.lineSeparator());

            }
            return sb.toString();

        } finally {
            // Tu das immer
            try {
                reader.close();
            } catch (IOException exc) {
                // File exception beim schleißen auftritt
            }
        }
    }

    public static void fileWriter(String path, String data) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(path));

        try {
            writer.write(data);
        } catch (IOException exp) {
            //noop
        } finally {
            try {
                writer.close();
            } catch(IOException exc) {
                //noop
            }
        }
    }








}// End of Class
