package Lena;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Uebungen {
    public static void main(String[] args) throws IOException {

        // nextSunnday();
        //  System.out.println(getWorkdays(2021,3));
        //  howManySundays(2021, 10);

//        String regex = getEmailRegex();
//        System.out.println("alfons@drlue.at".matches(regex));
//        System.out.println("rambina.alfons@drlue.at".matches(regex));
//        System.out.println("rambina1.1alfons@drlue.at".matches(regex));
//        System.out.println("1rambina1.alfons@drlue.at".matches(regex));
//        System.out.println("@drlue.at".matches(regex));
//        System.out.println("drlue.at".matches(regex));
//        System.out.println("asdf@drlue".matches(regex));
//        System.out.println("asdf@microsoft.c".matches(regex));

        // printSlash(4, "X", false);
        // printX(5, "X");

        String[] names = new String[]{"Plamena", "Sadaaq", "Gyula", "Eray", "Gerri", "Stefan", "Lena", "Danny", "Ömer", "Stjepan", "Sandro", "Bartosz", "Ingo", "Rauan", "Mahir", "Lukas", "Niklas"};
        //  System.out.println(Arrays.toString(sortByCharIndex(names, 20)));
        String path = "assets/file.txt";
        //   countChars(readFile(path), new char[]{'x'});

        input();
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (!sc.hasNextInt()) {
                System.out.println("Geben sie eine zahl ein");
                sc.nextLine();
        }
        input = sc.nextInt();

        System.out.println(input);
    }

    private static String readFile(String path) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(path));
        StringBuilder sb = new StringBuilder();

        while (bf.readLine() != null) {
            sb.append(bf.readLine());
            sb.append(System.lineSeparator());

        }
        bf.close();
        return sb.toString();
    }

    private static void countChars(String text, char[] charsToCount) {
        char[] textInChar = text.toCharArray();
        int count = 0;

        for (int i = 0; i < textInChar.length; i++)
            for (int j = 0; j < charsToCount.length; j++) {
                if (textInChar[i] == charsToCount[j]) {
                    count++;
                    break;
                }
            }
        System.out.println("Die Buchstaben " + Arrays.toString(charsToCount) + " kamen " + count + "mal vor.");
    }

    private static String[] sortByCharIndex(String[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                try {
                    if (arr[j].charAt(index) > arr[j + 1].charAt(index)) {
                        String temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    System.out.println("Nach diesem Index kann leider nicht Sortiert werden, da nicht alle Inhalte diese Länge haben");
                    indexOutOfBoundsException.printStackTrace();
                    System.exit(0);
                }

            }
        }
        return arr;
    }


    private static void printX(int high, String sign) {
        int firstHalf = (high / 2);
        int spaces = 0;
        int signs = high;

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < spaces + signs; j++) {
                if (j < spaces) {
                    System.out.print(" ");
                } else {
                    if (j == spaces || j == spaces + signs - 1) {
                        System.out.print(sign);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

            if (i < firstHalf) {
                spaces++;
                signs -= 2;
            } else {
                spaces--;
                signs += 2;
            }


        }

    }


    private static void printRhombus(int high, String sign) {
        int firstHalf = (high / 2);
        int spaces = firstHalf;
        int signs = 1;

        for (int i = 0; i < high; i++) {

            for (int j = 0; j < spaces + signs; j++) {
                if (j < spaces) {
                    System.out.print(" ");
                } else {

                    if (j == spaces || j == spaces + signs - 1) {
                        System.out.print(sign);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

            if (i < firstHalf) {
                spaces--;
                signs += 2;
            } else {
                spaces++;
                signs -= 2;
            }

        }
    }

    private static void printTriangle(int high, String sign) {
        int spaces = high;
        int signs = 1;

        for (int i = 0; i < high; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < signs; j++) {
                if (i > 0 && i < high - 1) {
                    if (j == 0 || j == signs - 1) {
                        System.out.print(sign);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(sign);
                }
            }
            System.out.println();
            spaces--;
            signs += 2;
        }
    }

    private static void printSlash(int high, String sign, boolean backslash) {

        if (backslash) {
            for (int i = 0; i < high; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(sign);
            }
        } else {
            for (int i = high; i > 0; i--) {
                for (int j = i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                System.out.println(sign);
            }
        }
    }

    private static String getEmailRegex() {
        return "[a-zA-Z][a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}";
    }

    private static void howManySundays(int year, int month) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, (month - 1));
        calendar.set(Calendar.DATE, 1);

        System.out.println(calendar.getTime());

        int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int sundays = 0;
        for (int i = 1; i <= maxDays; i++) {
            calendar.set(Calendar.DATE, i);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sundays++;
            }
        }

        System.out.println(sundays);

    }

    private static void nextSunnday() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE));
        for (int i = 0; i < 7; i++) {
            calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + i));
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println(calendar.getTime());
                break;
            }
        }

    }

    private static int getWorkdays(int year, int month) {
        Calendar calender = new GregorianCalendar();
        calender.set(Calendar.YEAR, year);
        calender.set(Calendar.MONTH, month - 1);


        int workdays = 0;
        int daysOfMonth = calender.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= daysOfMonth; i++) {
            calender.set(Calendar.DATE, i);
            if ((calender.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) && (calender.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY)) {
                workdays++;
            }
        }

        return workdays;
    }

    public static int getAmountOfDaysOfMonth(Calendar calendar) {
        int actualMonth = calendar.get(Calendar.MONTH);
        int amountOfDays = 0;

        switch (actualMonth) {

            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                amountOfDays = 31;
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                amountOfDays = 30;
                break;
            case (2):
                if (calendar.get(Calendar.YEAR) % 4 == 0 && calendar.get(Calendar.YEAR) % 100 != 0) {
                    amountOfDays = 29;
                } else amountOfDays = 28;
                break;
        }

        return amountOfDays;
    }
}
