package Stefan.SecondWeek.Scanner;


import Stefan.SecondWeek.Kalender1;

import java.util.Scanner;

public class ScannerInputTest {

    public static void main(String[] args) {

        for (boolean run = true; run; ) {

            System.out.println("Was möchtest du tun?");
            System.out.println("1) Print christmastree");
            System.out.println("2) Print arrow");
            System.out.println("3) Print calendar");
            System.out.println("4) Print quader");
            System.out.println("5) Exit");

            Scanner scanner = new Scanner(System.in);
            int input = -1;

            while (input < 0 || input > 5) {
                System.out.println("Gib eine Zahl zwischen 1 - 5 ein!!!");
                while (!scanner.hasNextInt()) {
                    System.out.println("Sie müssen eine Zahl eingeben");
                    scanner.nextLine();
                }
                input = scanner.nextInt();
                scanner.nextLine();
            }


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
                    run = false;
                    System.out.println("Auf Wiedersehen!");
                    break;
            }

            if (input < 5 && input > 0) {
                while (true) {
                    System.out.println("Zum neu starten drücken sie die 1");
                    Scanner restartScanner = new Scanner(System.in);
                    while (!restartScanner.hasNextInt()) {
                        System.out.println("Geben Sie die Zahl 1 ein!!!");
                        restartScanner.nextLine();
                    }
                    int restart = restartScanner.nextInt();


                    if (restart == 1) {
                        break;
                    }

                }
            } else {
                run = false;
            }

        }

    }
}
