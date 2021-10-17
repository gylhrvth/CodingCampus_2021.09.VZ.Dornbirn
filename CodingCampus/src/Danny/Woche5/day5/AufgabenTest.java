package Danny.Woche5.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.*;

public class AufgabenTest {
    public static void main(String[] args) {

        //Aufgabe:Zählen
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i <= 10){
//            System.out.println(i);
//            i++;
//        }
        //Aufgabe:Print Characters
//        printChar("X",10);

        //Aufgabe:String einlesen
//        scanString();

//        //Aufgabe:Random Number Array
//        randomNumberArray(50);

        //Aufgabe:Wann ist Sonntag
//        calendar();

        //Aufgabe:Email Regex
//        emailRegex();

        //Aufgabe:Split
//        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
//        stringBuilder(text);
        //Aufgabe:Datenströme
        String path = "C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
        fileRead(path);
    }


    private static void fileRead(String path) {
        try {
            BufferedReader bF = new BufferedReader(new FileReader(path));
            StringBuilder sB = new StringBuilder();
            while (true) {
                String line = bF.readLine();
                if (line == null) {
                    break;
                }
                sB.append(line).append(System.lineSeparator());
            }
            bF.close();
            System.out.println(sB);
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }


    }

    public static void stringBuilder(String text) {
        String[] textSplit = text.split(" ");
        System.out.println(Arrays.toString(textSplit));
        StringBuilder stringBuilder = new StringBuilder();
        for (int t = 0; t < textSplit.length; t++) {
            stringBuilder.append(textSplit[t]);
            stringBuilder.append(System.lineSeparator());
        }
        System.out.println(stringBuilder);
    }


    public static void emailRegex() {
        String regex = "[a-z]{1,256}" + "[0-9]{1,256}" + "\\@" + "[a-z]{1,5}" + "\\.at";
        System.out.println("alfons1@drlue.at".matches(regex));
    }

    public static void calendar() {
        GregorianCalendar today = new GregorianCalendar();
        int aktuelday = today.get(Calendar.DAY_OF_WEEK);
        int dayofMons = today.get(Calendar.DAY_OF_MONTH);
        int mons = today.get(Calendar.MONTH);
        int year = today.get(Calendar.YEAR);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        int nextSunday = (8 - aktuelday) + dayofMons;
        GregorianCalendar nextSundayDate = new GregorianCalendar(year, mons, nextSunday);
        System.out.println(df.format(nextSundayDate.getTime()));
    }

    public static void randomNumberArray(int upperBound) {
        int[] randomNumbers = new int[upperBound];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(upperBound);
            randomNumbers[i] = randomNumber;
        }
        for (int j : randomNumbers) {
            System.out.print(j + ",");

        }
        System.out.println();
        System.out.print(randomNumbers[1] + ",");
        System.out.print(randomNumbers[4] + ",");
        System.out.println(randomNumbers[9]);

        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(randomNumbers[i] + ",");
            }
        }
    }


    public static void scanString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib einen String ein");
        String user = scan.nextLine();
        System.out.println(user);


    }

    public static void printChar(String cha, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.print(cha);

        }

    }
}
