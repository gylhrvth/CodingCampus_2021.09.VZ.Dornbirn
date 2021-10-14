package Ingo.week5;

import java.io.File;

public class TxtDateiErstellen {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\terra\\Desktop\\ingo.txt");
        System.out.println(file);

        for (int i = 0; i < file.length(); i++) {
            System.out.println(file);
        }

    }

}
