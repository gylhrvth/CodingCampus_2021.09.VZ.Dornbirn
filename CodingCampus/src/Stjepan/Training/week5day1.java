package Stjepan.Training;




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class week5day1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stjepan\\Training\\textfile.txt";
        System.out.println(readFile(path));

    }   public static String readFile(String path) {
        try {
            File file = new File(path);
            Scanner myReader = new Scanner(file);

            StringBuilder stringBuilder = new StringBuilder();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }

            myReader.close();
            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }
}

