package Rauan;

public class Loops {
    public static void main(String[] args) {

        // Raufzählen von 0 bis inkl 10 in 1er Schritten
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Rauftählen von 0 bis inkl 20 in 2er schritten
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Raufzählen von 0 bis 100 in 5er Schritten
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        // Runterzählen von 10 bis -1
        for (int i = 10; i >= -1; i--) {
            System.out.println(i);
        }

        //Runterzählen von 20 bis -2 in 2er Schritten
        for (int i = 20; i >= -2; i -= 2) {
            System.out.println(i);
        }

        // Raufzählen von 2 bis 256 und die Zählevariabln immer verdopprlt
        for (int i = 2; i <= 256; i *= 2) {
            System.out.println(i);
        }

        // Ausgabe "hallo wie gehts?" , dann 10 mal "sehr gut" ,
        // und das ganze 6 mal wiederholen
        for (int i = 0; i < 6; i++) {
            System.out.println("Hallo wie gehts?");

            for (int J = 0; J < 10; J++) {
                System.out.println("sehr gut");
            }
            System.out.println();

        }

        // Ich möchte einen Würfel , die Breite und die Höhe soll in einer separaten
        // variable definiert sein
        int height = 6;
        int width = 7;
        int counter = 0;
        for (int i = 0; i < height; i++) {
            for (int J = 0; J < width; J++) {
                System.out.print("*");
            }
            counter = +1;
            counter++;
            counter += 1;
            counter++;
            System.out.println();
        }
    }
}
