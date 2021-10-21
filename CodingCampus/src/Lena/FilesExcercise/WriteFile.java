package Lena.FilesExcercise;

import java.io.*;
import java.util.Random;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        fillFileWhileUnder500MB(500);
    }

    private static void fillFileWhileUnder500MB(int sizeInMB) throws IOException {

        Random rnd = new Random();
        String words[] = ReadFile.readFile("assets/file.txt").split(" ");

        File f = new File("C:\\Users\\Lena Natter\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Lena\\FilesExcercise\\newFileFromIntelliJ.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintStream ps = new PrintStream(fos);

        while (f.length() < 1024L*1024*sizeInMB){
            int countWords = rnd.nextInt(20);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < countWords; i++) {
                sb.append(words[rnd.nextInt(words.length)] + " ");
            }
            ps.println(sb);
        }
        ps.close();
    }

}



