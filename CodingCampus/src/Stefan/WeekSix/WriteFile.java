package Stefan.WeekSix;



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
        System.out.println("Geben Sie einen Text ein: ");

        try {
            writeFile("assets/tmp/outputStefan.txt", input);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
        }


//        System.out.println(writeFile(input));
    }

    private static void writeFile(String path, String input) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(String.valueOf(path)));
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        try {
            writer.write(input);
        } finally {
            try {
                writer.close();
            }catch (IOException exc) {

            }
        }
    }
}
