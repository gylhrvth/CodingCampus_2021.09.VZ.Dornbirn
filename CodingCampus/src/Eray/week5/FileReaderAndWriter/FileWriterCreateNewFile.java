package Eray.week5.FileReaderAndWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterCreateNewFile {

    public static void writeFile(String path, String text) {
        try{
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter myWriter = new FileWriter(file);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        }catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
