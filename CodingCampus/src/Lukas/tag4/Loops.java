package Lukas.tag4;

public class Loops {
    public static void main(String[] args) {
        //Raufzählen von 0 bis inklusive 10 in 1er Schritten
//        for(int i = 0; i<11;i++) {
//            System.out.println(i);
//        }

        //Raufzählen von 0 bis inklusive 20 in 2er Schritten
//        for(int i=0; i <= 20; i+=2) {
//            System.out.println(i);
//        }

        //Raufzählen von 0 bis inklusive 100 in 5er Schritten
//        for (int i = 0; i <= 100; i += 5) {
//            System.out.println(i + " Hallo: " + i);
//        }

        //Runterzählen von 10 bis inklusive -1
//        for (int i = 10; i >= -1; i--) {
//            System.out.println(i);
//        }
        //Runterzählen von 20 bis -2 in 2er Schritten
//        for (int i = 20; i >= -2; i -= 2) {
//            System.out.println(i);
//        }
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

        //Ich möchte einen Würfel, die Breite und die Höhe soll in einer separaten
        //Variable definiert sein
        int height = 15;
        int width = 10;

        int counter = 0;

        for (int i = 0; i < height; i++) {
            for (int f = 0; f < width; f++) {
                System.out.print("*");
                //counter = counter +1;
                //counter++;
                //counter += 1;
                counter++;
            }
            System.out.println();
        }
        System.out.println("Soviele Zeichen wurden ausgegeben: " + counter);
    }
}
