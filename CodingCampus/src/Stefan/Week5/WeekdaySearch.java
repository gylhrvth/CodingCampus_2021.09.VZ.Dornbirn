package Stefan.Week5;

import java.util.Scanner;

public class WeekdaySearch {

    private static boolean istTeilbar(int x, int teiler) {
        return (x % teiler == 0);
    }

    private static boolean istSchaltjahr(int jahr) {
        return (istTeilbar(jahr, 400) ||
                istTeilbar(jahr, 4) && ! istTeilbar(jahr, 100));
    }

    public static void main(String[] args) {

        int ReferenzJahr = 1584; // Beginn gregorianischer Kalender. 1. 1. 1584 war ein Sonntag.
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie das gesuchte Jahr ein:");
        int GesuchtesJahr = sc.nextInt();
        System.out.println("Geben Sie den gesuchten Monat als Zahl ein:");
        int GesuchterMonat = sc.nextInt();
        System.out.println("Geben Sie den gesuchten Tag ein:");
        int GesuchterTag = sc.nextInt();
        int VergangeneTage = 0;
        boolean Schaltjahr = false;

        while (ReferenzJahr < GesuchtesJahr) {
            Schaltjahr = istSchaltjahr(ReferenzJahr);

            if (Schaltjahr) {
                VergangeneTage = VergangeneTage + 366;
            } else {
                VergangeneTage = VergangeneTage + 365;
            }

            ReferenzJahr++;
        }

        int Februar = istSchaltjahr(GesuchtesJahr) ? 29 : 28;

        switch (GesuchterMonat) {
            case 12:
                VergangeneTage += 30;
            case 11:
                VergangeneTage += 31;
            case 10:
                VergangeneTage += 30;
            case 9:
                VergangeneTage += 31;
            case 8:
                VergangeneTage += 31;
            case 7:
                VergangeneTage += 30;
            case 6:
                VergangeneTage += 31;
            case 5:
                VergangeneTage += 30;
            case 4:
                VergangeneTage += 31;
            case 3:
                VergangeneTage += Februar;
            case 2:
                VergangeneTage += 31;
            case 1:
                break;
            default:
                System.out.println("Offenbar gab es einen Fehler bei der Berechnung! \n Vielleicht bei der Monatseingabe vertippt?");
        }

        int Wochentag = (VergangeneTage + GesuchterTag - 1) % 7;

        String wochentag[] = {
                "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"
        };

        System.out.printf("Der gesuchte Tag ist ein %s!\n", wochentag[Wochentag]);
    }
}
