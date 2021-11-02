package Sandro.chooseDoor;


import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie alt bist du ?");
        int inputAlter = 0;

        while (inputAlter == 0) {

            try {
                inputAlter = scanner.nextInt();

                if (inputAlter < 18) {
                    System.out.println("Leider kein Zutritt.");
                } else {
                    System.out.println("\nWillkommen zum Spiel\n");
                }

            } catch (Exception e) {
                System.out.println("Das ist keine Zahl. Bitte gib erneut ein:");
                scanner.nextLine();
            }

            if (inputAlter >= 18) {
                System.out.println("In welche Tür möchtest Du eintreten? Gib die Tür-Nummer (1, 2, 3 oder 4) ein:\n");
                System.out.println("Tür 1: Mehrere Kanonen werden auf dich schießen.");
                System.out.println("Tür 2: Ein großes Feuer wird dir entgegenschlagen.");
                System.out.println("Tür 3: Mehrere Kanonen werden auf dich schießen.");
                System.out.println("Tür 4: Hinter dieser Tür ist keine Luft zum Atmen. Du hast keine Sauerstoffmaske o.ä.");

                int decision = 0;

                while (decision == 0 || decision > 4) {

                    try {
                        if (decision > 4) {
                            System.out.println("Sie haben eine Zahl über 4 eingegeben. Bitte geben Sie ihre Eingabe nochmals ein:");
                        }
                        decision = scanner.nextInt();
                        switch (decision) {
                            case 1:
                                System.out.println("Tür 1: Mehrere Kanonen werden auf dich schießen.");
                                break;
                            case 2:
                                System.out.println("Tür 2: Ein großes Feuer wird dir entgegenschlagen.");
                                break;
                            case 3:
                                System.out.println("Tür 3: Mehrere Kanonen werden auf dich schießen.");
                                break;
                            case 4:
                                System.out.println("Tür 4: Hinter dieser Tür ist keine Luft zum Atmen. Du hast keine Sauerstoffmaske o.ä.");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println("Sie haben einen Buchstaben eingegeben. Bitte geben Sie keinen Buchstaben, sondern eine Zahl ein:");
                        scanner.nextLine();
                        decision = 0;
                    }
                }
            }
        }
    }
}