package Stefan.Week6;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        //Lies solange eingaben vom Benutzer, bis eine Leerzeile eingegeben wird.
        //Dann schreibe die Eingaben in eine Datei.
        //Der Pfad soll lauten assets/tmp/output.txt.

        String input = "";
        System.out.println("Geben Sie Ihren Text ein: ");

        try {
            writeNewFile("assets/tmp/outputStefan.txt", input);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }


    }


    /**
     * Methode Eingabe vom Benutzer bis eine leere Zeile eingegeben wird
     */
    private static void writeNewFile(String path, String input) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(path)));
        Scanner scanner = new Scanner(System.in);

        try {
            while (true){
                String input1 = scanner.nextLine();
                if (input1.isEmpty()) {
                    break;
                }
                writer.write(input1 + System.lineSeparator());
            }

        } finally {
            try {
                writer.close();
            } catch (IOException exc) {

            }
        }
    }

    /**
     * Methode mit Angabe der Menge von Zeilen die geschrieben werden sollen
     */
//    private static void writeFile(String path, String input) throws IOException {
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(path)));
//        Scanner scanner = new Scanner(System.in);
//        String[] input1 = new String[scanner.nextInt()];
//        scanner.nextLine();
//        try {
//            for (int i = 0; i < input1.length; i++) {
//                input1[i] = scanner.nextLine();
//            }
//
//            for (String data : input1) {
//                writer.write(data + System.lineSeparator());
//            }
//        } finally {
//            try {
//                writer.close();
//            } catch (IOException exc) {
//
//            }
//        }
//    }
}
