package Ingo.week9.filesystem;

import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\DCV\\Desktop\\TopSecret.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException exc) {
            exc.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DCV\\Desktop\\TxtNeu.txt"));
            bw.write("Das ist eine neue Text Datei!\n" +
                    "mit einem Zeilenumbruch!");
            bw.close();

        } catch (IOException exc) {
            exc.printStackTrace();
        }

        try {
            File file = new File("C:\\Users\\DCV\\Desktop\\TopSecret.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

            }
            scanner.close();

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
        System.out.println("-----------------------------------------------------");

        try {
            File file = new File("C:\\Users\\DCV\\Desktop\\TopSecret.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();


        } catch (IOException exc) {
            exc.printStackTrace();
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\DCV\\Desktop\\BufferedWriterDateiNeu.txt"));
            bw.write("Das ist eine neue BufferedWriter Datei die ich\n" +
                    "jetzt mit tollem Inhalt fülle!\n" +
                    "Mit ein paar Textzeilen und so weiter !!\n" +
                    "Gruß Ingo888 !");
            bw.close();

        } catch (IOException exc) {
            exc.printStackTrace();
        }
        System.out.println("------------------------------------------------");
        System.out.println("------------------MIT STRING BUILDER GEMACHT-----------------------");

        try {
            File file = new File("C:\\Users\\DCV\\Desktop\\BufferedWriterDateiNeu.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder sb = new StringBuilder();
            while(scanner.hasNextLine()) {
            //    String line = scanner.nextLine();
            //    System.out.println(line);
                sb.append(scanner.nextLine());
                sb.append(System.lineSeparator());
            }
            String text = sb.toString().replaceAll("BufferedWriter","Supermen!!!");

            System.out.println(text);
            scanner.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}