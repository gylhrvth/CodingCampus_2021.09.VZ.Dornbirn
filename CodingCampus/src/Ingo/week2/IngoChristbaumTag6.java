package Ingo.week2;

public class IngoChristbaumTag6 {
    public static void main(String[] args) {


        int maxTreeHight = 10;


 //       for (int a = 1; a < maxTreeHight; a += 4) {

            int stars = 1;
            int spaces = maxTreeHight - 1;

            for (int i = 0; i < maxTreeHight; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print("*");
                }
                System.out.println();
                stars += 2;
                spaces--;

            }
            System.out.println();

        System.out.println("Neue Aufgabe");

            int hight = 20;
            int sterne = 1;
            int leerraum = hight - 1;

            for (int a = 0; a < hight; a++) {
                for (int b = 0; b < leerraum; b++) {
                    System.out.print(" ");
                }
                for (int b = 0; b < sterne; b++) {
                    System.out.print("*");
                }
                System.out.println();
             //   sterne += 2;
             //   leerraum--;
            }
            int breite = sterne - 2;






    }
}
