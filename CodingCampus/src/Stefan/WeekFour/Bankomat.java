package Stefan.WeekFour;


import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Bankomat {


    public static void main(String[] args) {
        for (boolean run = true; run; ) {


            int einzahlen;
            int abheben;
            int kontostand = 1000;
            int beenden;

            System.out.println("Was möchten Sie tun!");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            Scanner bankomat = new Scanner(System.in);

            int input = bankomat.nextInt();

            while (input < 0 || input > 4) {
                System.out.println("Gib eine Zahl zwischen 1 - 4 ein!!!");
                while (!bankomat.hasNextInt()) {
                    System.out.println("Sie müssen eine Zahl eingeben");
                    bankomat.nextLine();
                }
                input = bankomat.nextInt();
                bankomat.nextLine();
            }


            switch (input) {
                case 1:
                    System.out.println("Gib den Betrag an den du einzahlen willst!");
                    int einzahlung = bankomat.nextInt();
                    System.out.println("Ihr guthaben Beträgt nun: " + (einzahlung + kontostand) + " Euro");
                    break;
                case 2:
                    System.out.println("Wieviel willst du Abheben!");
                    int auszahlung = bankomat.nextInt();
                    System.out.println("Dein Restguthaben beträgt nun: " + (kontostand - auszahlung) + " Euro");
                    break;
                case 3:
                    System.out.println("Dein Kontostand ist: " + kontostand + " Euro");
                    break;
                case 4:
                    run = false;
                    System.out.println("Auf Wiedersehen!");
                    break;
            }

            if (input < 4 && input > 0) {
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
