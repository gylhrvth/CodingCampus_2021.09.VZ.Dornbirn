package danny.string;

public class Tannenbaum {
    public static void main(String[] args) {


        christmastree(6);


    }

    public static void christmastree(int kroneHoehe) {
//Krone_
        int spitzeWert = 1;
        int abstandRand = kroneHoehe;

        for (int k = 0; k <= kroneHoehe; k++) {
            printStar(abstandRand, " ");
            printStar(spitzeWert, "X");
            System.out.println();
            spitzeWert += 2;
            abstandRand--;
        }

//Kugeln
        int s = spitzeWert;

        for (int f = 2; f < spitzeWert; f++) {
            if (s % 2 != 0) {
                System.out.print("*");
                s--;
            } else {
                System.out.print(" ");
                s--;
            }
        }
        System.out.println();
//Stamm

        int stammH = (kroneHoehe / 2 + 1);
        int stammB = ((spitzeWert - 2) / 3);
        int einrue = (((spitzeWert - 2) - stammB) / 2);

        for (int h = 0; h < stammH; h++) {
            for (s = 0; s < einrue; s++) {
                System.out.print(" ");
            }
            for (int v = 0; v <= stammB; v++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }


    public static void printStar(int pices, String charater) {

        for (int x = 0; x < pices; x++) {
            System.out.print(charater);
        }
    }
}


















