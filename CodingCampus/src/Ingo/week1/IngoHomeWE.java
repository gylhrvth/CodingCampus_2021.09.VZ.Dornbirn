package Ingo.week1;

public class IngoHomeWE {

    public static class IngoHome3 {
        public static void main(String[] args) {

            for (int a = 1; a <= 10; a++) {
                for (int b = 1; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }for (int a = 10; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();


            }
            System.out.println("-------Zeilenumbruch---------");

            int Hoehe = 10;
            int obereHoehe = Hoehe / 2;

            for (int a = 0; a < obereHoehe; a++) {
                for (int b = 0; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            int untereHoehe = Hoehe - obereHoehe;

            for (int a = untereHoehe; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();

            }for (int a = 0; a < 10/2; a++) {
                for (int b = 0; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();

            }for (int a = 10/2; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();
                System.out.println("Neue Rechnung");

            }for (int a = 0; a < 20/2; a++) {
                for (int b = 0; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int a = 20/2; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Neues Programm");

            for (int a = 0; a <= 15; a++) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();

            }for (int a = 15; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Neues Beispiel, neue Zeile");

            for (int a = 0; a <= 15; a++) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }for (int a = 15; a >= 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();


            }for (int a = 8; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();

            }for (int a = 0; a <= 5; a++) {
                for (int b = 0; b < a; b++) {
                    for (int c = 0; c < 1; c++) {
                        System.out.print("X");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int a = 5; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    for (int c = 0; c < 1; c++) {
                        System.out.print("X");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            int laenge = 6;
            int breite = 5;
            int mitte = laenge / breite;

            for (int a = 0; a < laenge; a++) {
                for (int b = 0; b < a; b++) {
                    for (int c = 0; c < 1; c++) {
                        System.out.print("X");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }for (int a = laenge; a > 0; a--) {
                for (int b = 0; b < a; b++) {
                    for (int c = 0; c < 1; c++) {
                        System.out.print("X");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("neues programm");

            for (int a = 0; a <= mitte; a++) {
                System.out.print("*");
            }
            System.out.println(

            );
        }
    }
}
