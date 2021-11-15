package Lukas.week5.day3;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        File file = new File("c:\\");
        System.out.println(file);

        System.out.println("Existiert es: " + file.exists());
        System.out.println("Ist es ein Ordner: " + file.isDirectory());
        System.out.println("Ist es eine Datei: " + file.isFile());

        File[] arraysBrueder = file.listFiles();

        if(arraysBrueder == null) {
            System.out.println("Hier gibt es keine Unterdateien oder Ordner");
        } else {
            //for (File bruder : arraysBrueder) {
            for (int i = 0; i < arraysBrueder.length; i++) {
                File bruder = arraysBrueder[i];

                System.out.print(bruder);

                if (bruder.isFile()) {
                    System.out.printf("[%.2f MB]", convertToMB(bruder.length()));
                }
                System.out.println();
            }
        }
    }

    private static double convertToMB(long sizeInByte) {

        return  sizeInByte / (1024 * 1024.0);
    }

}
