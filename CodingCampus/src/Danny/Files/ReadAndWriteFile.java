package Danny.Files;

import java.io.*;

public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {

        readFile("assets/file.txt");

    }

    public static void readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        try {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb
                        .append(line)
                        .append(System.lineSeparator());
            }

        } finally {

        }
    }

    public static void writeFile(String path, String data) throws IOException {
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

}
