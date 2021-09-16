package Lena;

public class Kreis {

    public static void main(String[] args) {


        double r = 10.0;       //Radius
        double d = 2.0 * r;   //Durchmesser
        double alpha = 0.0;
        double l = 0.0;
        double sinus;


        System.out.println(d * (Math.sin((Math.toRadians(18 / 2.0)))));


        for (int i = 0; i < d; i++) {

            alpha += ((90 / r) * 2);
            l = d * (Math.sin((Math.toRadians(alpha / 2.0))));

            if (l < 0.0) {
                l = l * (-1);
            }
           //System.out.println(alpha);
          // System.out.println(l);
            double leerzeichenAbstand = ((d - l) / 2.0);
            for (int j = 0; j <=leerzeichenAbstand*2; j++) {
                System.out.print(" ");
            }
            System.out.print("**");

            for (int k = 0; k <=l*2; k++) {
                System.out.print(" ");
            }

            System.out.print("**");
            System.out.println();
        }


    }
}


 /*alpha += (180 - ((90 / r) * 2));
         //if (i > r / 2) alpha -= (180 - ((90 / r) * 2));
         //   System.out.println(Math.sin((alpha / 2.0)));
         sinus = Math.sin((alpha / 2));
         //  System.out.println(sinus);
         //  if (sinus <= 0.0) {
         //  sinus = sinus * (-1);
         //  }
         l = d * sinus;
         // System.out.println(l);
         double leerzeichenAbstand = ((d - l) / 2.0);
         for (int j = 0; j <= leerzeichenAbstand; j++) {
         System.out.print(" ");
         }
         System.out.print("*");

         for (int k = 0; k < l; k++) {
        System.out.print(" ");
        }

        System.out.print("*");
        System.out.println();*/