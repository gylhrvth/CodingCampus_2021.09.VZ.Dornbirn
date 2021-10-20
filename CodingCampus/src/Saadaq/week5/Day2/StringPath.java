package Saadaq.week5.Day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringPath {


    public static void main(String[] args) throws IOException {


        // Reading files to String in Java 11


        Path fileName = Path.of("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt");

        String content = "Hello World!";
        Files.writeString(fileName,content);

        String actual = Files.readString(fileName);

        System.out.printf(actual);










    }//End of main


}//End of class

