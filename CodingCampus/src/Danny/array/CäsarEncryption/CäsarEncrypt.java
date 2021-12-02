package Danny.array.CäsarEncryption;

import java.io.*;

public class CäsarEncrypt {


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

    public static char[] encyptString(String data, int cryptValur) {

        char[] stringChar = data.toCharArray();

        for (int i = 0; i < stringChar.length; i++) {
            if (stringChar[i] >= 65 && stringChar[i] <= 90) {
                if (stringChar[i] >= 88) {

                    stringChar[i] = (char) (stringChar[i] - 26 + cryptValur);
                } else {
                    stringChar[i] = (char) (stringChar[i] + cryptValur);
                }
            }
            if (stringChar[i] >= 97 && stringChar[i] <= 122) {
                if (stringChar[i] >= 120) {

                    stringChar[i] = (char) (stringChar[i] - 26 + cryptValur);
                } else {
                    stringChar[i] = (char) (stringChar[i] + cryptValur);
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
        try {


            writeString("CodingCampus/src/Danny/woche7/day7/decryptText",
                    encyptString(readFile("CodingCampus/src/Danny/woche7/day7/encryptText"),3));
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();
            System.out.println("File nicht gefunden");
        }
    }
}
