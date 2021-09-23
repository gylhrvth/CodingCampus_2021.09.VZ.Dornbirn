package Stefan.SecondWeek.Scanner;


import Eray.week2.MenuMethods.NewChristmasForMenu;
import Stefan.SecondWeek.Kalender1;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        for (int run = 1; run == 1; ) {

            System.out.println("Was möchtest du tun?");
            System.out.println("1) Print christmastree");
            System.out.println("2) Print arrow");
            System.out.println("3) Print calendar");
            System.out.println("4) Print quader");
            System.out.println("5) Exit");

            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();


            switch (input) {
                case 1:
                    System.out.println("Höhe eingeben: ");
                    int newheight = scanner.nextInt();
                    christmasTree.christmasTree(newheight);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Höhe eingeben: ");
                    int quaderHeight = scanner.nextInt();
                    Triangle.triangle(quaderHeight);
                    System.out.println();
                    break;

                case 3:
                    Kalender1.calendar();
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Höhe eingeben: ");
                    int starHeight = scanner.nextInt();
                    Quader.printStar(starHeight);
                    System.out.println();
                    break;

                case 5:
                    run++;
                    System.out.println();
                    break;
            }


            System.out.println("Zum neu starten drücken sie die 1");
            Scanner restartScanner = new Scanner(System.in);
            int restart = restartScanner.nextInt();

            if (restart != 1) {
                run++;
            }

        }
    }
}
