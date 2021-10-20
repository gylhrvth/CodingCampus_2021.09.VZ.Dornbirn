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
//        String path = "C:\\Users\\DanGO\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\file.txt";
//        fileRead(path);

//       // Aufgabe Zählen2
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

        // Aufgabe Zählen mit Trick
//        for (int i = 2; i <= 10; i+=2) {
//                System.out.println(i);
//        }

        // Aufgabe Rewind
//        for (int i = 10; i >= -10 ; i--) {
//            System.out.println(i);
//        }
        // Aufgabe Print Square
//        printSquare(3, "A");

        // Aufgabe Print Slash
//        printSlash("x", 3, false);

        // Aufgabe Print Triangle
        //printTriangle(10, "x");

        // Aufgabe
        printRhombus("x", 25);

    }

    public static void printRhombus(String chra, int hight ) {
        if (hight % 2 == 0) {
            hight--;
        }
        int middleInt = hight / 2 + 1;
        boolean uppermiddle = true;
        int countSpaceMittle = 1;

        printLine(" ", hight / 2);
        System.out.println(chra);
        printRows(hight, chra, countSpaceMittle, uppermiddle);
        System.out.print(chra);
        printLine(" ", hight - 2);
        System.out.println(chra);
        uppermiddle = false;
        countSpaceMittle = hight -4;
        printRows(hight, chra, countSpaceMittle, uppermiddle);
        printLine(" ", hight / 2);
        System.out.println(chra);


    }

    public static void printRows(int hight, String chra, int countSpaceMittle, boolean uppermiddle) {
        int c = 0;
        for (int i = c; i < (hight - 3) / 2; i++) {
            int a = 0;
            if (uppermiddle == true) {
                a = hight / 2 - 1 - i;
            } else {
                a = i+1;
            }
            printLine(" ", a);
            System.out.print(chra);
            printLine(" ", countSpaceMittle);
            System.out.print(chra);
            if (uppermiddle == true) {
                countSpaceMittle += 2;
            } else {
                countSpaceMittle -= 2;
            }
            System.out.println();
        }

    }

    public static void printLine(String chra, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(chra);
        }

    }

    public static void printTriangle(int hight, String chara) {

        for (int j = 0; j < hight - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(chara);
        int sp = 1;
        for (int i = 2; i < hight; i++) {
            for (int j = 0; j < hight - i; j++) {
                System.out.print(" ");
            }
            System.out.print(chara);
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            sp += 2;
            System.out.println(chara);
        }
        for (int j = 0; j < hight * 2 - 1; j++) {
            System.out.print(chara);
        }

    }


    public static void printSlash(String chara, int hight, boolean uppDown) {
        if (uppDown == true) {
            for (int i = 0; i < hight; i++) {
                if (i == 0) {
                    System.out.println(chara);
                } else {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(chara);
                }

            }
        } else {
            for (int i = hight; i > 0; i--) {
                if (i == 0) {
                    System.out.println(chara);
                } else {
                    for (int j = i; j < hight; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(chara);
                }
            }
        }
    }

    public static void printSquare(int hight, String chara) {

        for (int i = 0; i < hight; i++) {
            if (i == 0 || i == hight - 1) {
                for (int j = 0; j < hight; j++) {
                    System.out.print(chara);
                }
                System.out.println();
            } else {
                System.out.print(chara);
                for (int j = 0; j < hight - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(chara);
            }
        }
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
