package Bartosz.week6;

import Lukas.week2.day4.UserInput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextWriter {
    public static void main(String[] args) {
        try {
            writeText("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Bartosz\\assets\\output.txt");
        } catch (IOException ecx) {
            ecx.printStackTrace();
        }
    }

    private static void writeText(String path) throws IOException {
        BufferedWriter ghost = new BufferedWriter(new FileWriter(path));        //Create new Writer form FileWriter of path File
        Scanner sc = new Scanner(System.in);

        String regbert = "\n";
        String userInput = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        try {
            // der alte (hässliche) code
//            if (userInput.compareToIgnoreCase(regbert) >= 0) {
//                sb.append(userInput).append(System.lineSeparator());
//                while(userInput.compareToIgnoreCase(regbert) > 0) {
//                    userInput = sc.nextLine();
//                    sb.append(userInput).append(System.lineSeparator());
//                }
//                ghost.write(sb.toString());
//
//            }
            // der neue (schönere) Code

            sb.append(userInput).append(System.lineSeparator());
            while(true) {
                userInput = sc.nextLine();
                if (userInput.compareToIgnoreCase(regbert) > 0) {
                    sb.append(userInput).append(System.lineSeparator());
                }else {
                    break;
                }
            }
            ghost.write(sb.toString());

        } finally {
            try {
                ghost.close();
            } catch (IOException exc) {
                // InputOutputException
            }
        }

    }
}
