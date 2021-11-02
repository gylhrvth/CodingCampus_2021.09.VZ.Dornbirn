package Danny.woche7.day7;

import java.io.*;
import java.util.Arrays;

public class CäsarDecrypt {


    private static String readFile(String path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb
                        .append(line)
                        .append(System.lineSeparator());
            }
            return sb.toString();
        } finally {
            try {
                reader.close();
            } catch (IOException exc) {

            }
        }
    }

    public static String encyptString2(String data, int cryptValur, char startChar, char endChar) {
        char[] stringChar = data.toCharArray();
        for (int i = 0; i < stringChar.length; i++) {
            if (stringChar[i] >= startChar && stringChar[i] <= endChar) {
                stringChar[i] = (char) (startChar + ((stringChar[i] - startChar + cryptValur) % (endChar - startChar + 1)));
            }
        }
        return new String(stringChar);
    }

    public static char[] encyptString(String data, int cryptValur) {

        char[] stringChar = data.toCharArray();

        for (int i = 0; i < stringChar.length; i++) {
            if (stringChar[i] >= 65 && stringChar[i] <= 90) {
                if (stringChar[i] <= 67) {

                    stringChar[i] = (char) (stringChar[i] + 26 - cryptValur);
                } else {
                    stringChar[i] = (char) (stringChar[i] - cryptValur);
                }
            }
            if (stringChar[i] >= 97 && stringChar[i] <= 122) {
                if (stringChar[i] <= 99) {

                    stringChar[i] = (char) (stringChar[i] + 26 - cryptValur);
                } else {
                    stringChar[i] = (char) (stringChar[i] - cryptValur);
                }
            }
        }
        return stringChar;
    }

    private static void writeString(String path, char[] data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        try {
            writer.write(data);
        } finally {
            try {
                writer.close();
            } catch (IOException exc) {
                //noop
            }
        }
    }


    public static void main(String[] args) throws Exception {
        String encText = readFile("CodingCampus/src/Danny/woche7/day7/encryptText");
        encText = encyptString2(encText, 3, 'a', 'z');
        encText = encyptString2(encText, 3, 'A', 'Z');

        System.out.println(encText);

        try {
            writeString("CodingCampus/src/Danny/woche7/day7/decryptText",
                    encyptString(readFile("CodingCampus/src/Danny/woche7/day7/encryptText"),3));
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
            System.out.println("File nicht gefunden");
        }
    }
}
