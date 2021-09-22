package Lukas.week1.tag4;

public class Loops {
    public static void main(String[] args) {
        //Raufzählen von 0 bis inklusive 10 in 1er Schritten
//        for(int i = 0; i<11;i++) {
//            System.out.println(i);
//        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int j = 11; j <= 20; j++) {
            System.out.println(j);
        }

        //Raufzählen von 0 bis inklusive 20 in 2er Schritten
//        for(int i=0; i <= 20; i+=2) {
//            System.out.println(i);
//        }
        for (int k = 0; k <= 20; k += 2) {
            System.out.println(k);
        }

        //Raufzählen von 0 bis inklusive 100 in 5er Schritten
//        for (int i = 0; i <= 100; i += 5) {
//            System.out.println(i + " Hallo: " + i);
//        }
        for (int l = 0; l <= 100; l += 5) {
            System.out.println(l);
        }

        //Runterzählen von 10 bis inklusive -1
//        for (int i = 10; i >= -1; i--) {
//            System.out.println(i);
//        }
        for (int m = 10; m >= -1; m--) {
            System.out.println(m);
        }
        //Runterzählen von 20 bis -2 in 2er Schritten
//        for (int i = 20; i >= -2; i -= 2) {
//            System.out.println(i);
//        }
        for (int n = 20; n >= -2; n -= 2) {
            System.out.println(n);
        }
        for (int o = 100; o >= -20; o -= 10) {
            System.out.println(o);
        }
        for (int q = 2; q <= 256; q *= 2) {
            System.out.println(q);
        }

        //Raufzählen von 2 bis inklusive 256 und die Zählvariable immer verdoppeln

//        for(int i=2; i<=256; i*=2){
//            System.out.println(i);
//        }


        //Ausgabe "Hallo wie gehts?", dann 10 mal "Sehr gut!",
        // und das ganze 6 mal wiederholen

        //Ganz am Anfang erfolgt die Deklaration und Initialisierung der Zählariablen
        //Vor jedem Schleifendurchlauf erfolgt die Bedingungsprüfung
        //Nach jedem Schleifendurchlauf erfolgt die Modifikation der Zählvariablen
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Hallo wie gehts?");
//
//            for (int j = 0; j < 10; j++) {
//                System.out.println("Sehr gut!");
//            }
//        }

        for (int l = 0; l < 6; l++) {
            System.out.println("Hallo wie gehts?");

            for (int i = 0; i < 10; i++) {
                System.out.println("Sehr gut!");
            }
        }
        for (int c=0; c<8; c++) {
            System.out.println("Wer bist du?");

            for (int d=0; d<7; d++) {
                System.out.println("Ich bin Ich!");

            }
        }
        int height = 15;
        int width = 10;
        int counter = 0;

        for (int d = 0; d < height; d++){
            for (int j=0; j < width; j++){

                System.out.print("*");
                counter++;}
            
                System.out.println();

            }


        //Ich möchte einen Würfel, die Breite und die Höhe soll in einer separaten
        //Variable definiert sein
        //       int height = 15;
        //int width = 10;

        //int counter = 0;

        //for (int i = 0; i < height; i++) {
        //  for (int f = 0; f < width; f++) {
        //    System.out.print("*");
        //  //counter = counter +1;
        //counter++;
        //counter += 1;
        //counter++;
        //       }
        //   System.out.println();
        // }

        //  System.out.println("Soviele Zeichen wurden ausgegeben: "+counter);
    }
}
