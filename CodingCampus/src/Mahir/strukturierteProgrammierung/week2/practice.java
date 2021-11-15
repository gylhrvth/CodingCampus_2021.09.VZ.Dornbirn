package Mahir.strukturierteProgrammierung.week2;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        scanner.nextLine();
        int numb2 = scanner.nextInt();
        scanner.nextLine();
        int input = scanner.nextInt();
        scanner.nextLine();


        while (!scanner.hasNextInt()) {
            System.out.println("\033[0;31m" + "Invalid Input Please retry" + "\033[0m");
            scanner.nextLine();
        }
        if (input == 1){
            System.out.println("num1");
            int ergebnis = numb1  + numb2;
            System.out.println(ergebnis);
        }


      /*  int note = 5;
        String notenString 5;
        switch (note) {
            case 1:
                notenString = "Sehr gut";
                break;
            case 2:
                notenString = gut;
                break;
            case 3 :
        }*/
    }


    public static void a(int number) {
        if (number <= Byte.MAX_VALUE) {
            System.out.println(number + "");
        }
    }


}
