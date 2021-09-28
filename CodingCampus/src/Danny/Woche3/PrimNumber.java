package Danny.Woche3;

public class PrimNumber {
    public static void main(String[] args) {

        //        pi(11);
        //        primNumberCounter(20);
        //        System.out.println();
        //        primNumber(20);
        //        System.out.println();
        //        primNumberCounterFromTo(10,30);

        primAlternativ(12);
        //primMinToMax(0, 10);
        // noprimMinToMax(0, 10);

    }

    public static void primNumberCounter(int end) {
        for (int i = 2; i <= end; i++) {
            boolean primNumber = true;


            for (int j = 2; j < i && primNumber; j++) {

                if (i % j == 0) {
                    primNumber = false;
                    System.out.println(i + " ist keine PrimZahl");
                }
            }

            if (primNumber) {
                System.out.println(i + " ist eine PrimZahl");
            }
        }
    }

    public static void primNumber(int end) {
        for (int i = end; i <= end; i++) {
            boolean primNumber = true;

            for (int j = 2; j < i && primNumber; j++) {

                if (i % j == 0) {
                    primNumber = false;
                    System.out.println(i + " ist keine PrimZahl");

                }
            }

            if (primNumber) {
                System.out.println(i + " ist eine PrimZahl");
            }
        }
    }

    public static void primNumberCounterFromTo(int beginn, int end) {
        for (int i = beginn; i <= end; i++) {
            boolean primNumber = true;

            for (int j = 2; j < i && primNumber; j++) {

                if (i % j == 0) {
                    primNumber = false;
                    System.out.println(i + " ist keine PrimZahl");

                }
            }

            if (primNumber) {
                System.out.println(i + " ist eine PrimZahl");
            }
        }
    }


    public static void prim(int primNumber) {
        int factors = primNumber;

        while (factors != 1) {
            int resulut = primNumber % factors;
            if (resulut == 0) {
                System.out.println(primNumber + " ist keine Primzahl");
                break;
            } else {
                factors -= 1;
            }
        }

        if (factors == 1) {
            System.out.println(primNumber + " ist ein Primzahl");
        }
    }

    public static void primAlternativ(int prime) {

        boolean prim = true;

        for (int i = 2; i < prime && prim; i++) {
            if (prime % i == 0) {
                prim = false;
            }
        }
        if (prim) {
            System.out.println(prime + " ist eine Primzahl");
        } else {
            System.out.println(prime + " ist keine Primzahl");
        }


    }

    public static void primMinToMax(int min, int max) {

        int prime = max;

        for (int i = min; i < max; i++) {
            int counter = 0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(prime + " ist eine Primzahl");
            }
            prime--;
        }
    }

    public static void noprimMinToMax(int min, int max) {

        int prime = max;

        for (int i = min; i < max; i++) {
            int counter = 0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(prime + " ist keine Primzahl");
            }
            prime--;
        }
    }
}

