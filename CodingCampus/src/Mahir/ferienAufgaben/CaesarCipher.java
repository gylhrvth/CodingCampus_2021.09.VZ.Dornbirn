package Mahir.ferienAufgaben;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CaesarCipher {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Mahir\\ferienAufgaben\\CaesarCipher.txt";

        String fileText = readFile(path);
        String text = "test Text for Ceasar Cipher";

        int s = 4;

        System.out.println("Text : " + text);
        System.out.println("Text : " + encrypt(text, s));
    }

    private static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {

                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    private static String readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb
                        .append(line)
                        .append(System.lineSeparator());
            }
            return sb.toString();
        } finally {
            try {
                br.close();
            }catch (IOException exc){

            }
        }
    }
}
