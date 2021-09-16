package Danny.Woche1;

public class Tannenbaum {
    public static void main(String[] args) {
//Krone

        int kroneHoehe = 15;
        int spitzeWert = 1;
        int abstandRand = kroneHoehe;
        int y = 0;

        for (int k = 0; k <= kroneHoehe; k++) {
            for (int x = 0; x < abstandRand; x++) {
                System.out.print(" ");
            }
            y = 0;
            for (; y < spitzeWert; y++) {
                System.out.print("X");
            }

            System.out.println();
            spitzeWert += 2;
            abstandRand--;
        }

//Kugeln
        int s = y;
        int m = 2;

        for (int f = 0; f < y; f++)
            if (s % m != 0) {
                System.out.print("*");
                s--;
            } else {
                System.out.print(" ");
                s--;
            }
        {
            System.out.println();
        }
//Stamm

        int stammH = (kroneHoehe / 2 + 1);
        int stammB = (y / 3);
        int einrue = ((y-stammB) / 2);

        for (int h = 0; h < stammH; h++) {
            for (s = 0; s < einrue; s++) {
                System.out.print(" ");
            }
            for (int v = 0; v < stammB; v++) {
                System.out.print("X");
            }
            {
                System.out.println();
            }
        }
    }
}


//Christbaumständer














