package Rauan;

public class Loops {
    public static void main(String[] args) {

        // Raufzählen von 0 bis 10 in 1er Schritten
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Raufzählen von 0 bis 20 in 2er Schritten
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Raufzählen von 0 bis 100 in 5er Schritten
        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }

        // Runterzählen von 10 bis inkl -1
        for (int i = 10; i >= -1; i--) {
            System.out.println(i);
        }

        // Runterzählen von 10 bis -2 in 2er schritten
        for (int i = 10; i >= -2; i -= 2) {
            System.out.println(i);
        }

        // Raufzählen von 2 bis 265 und die Zählvariabln immer verdoppelt
        for (int i = 2; i <= 256; i *= 2) {
            System.out.println(i);
        }

        // Ausgabe " Hallo wie gehts? , dann 10 mal " sehr gut",
        // und das ganze 6 mal wiederholen
        for (int i = 0; i <= 6; i++) {
            System.out.println("Hallo wie gehts?");

            for (int j = 0; j <= 10; j++) {
                System.out.println("sehr gut");
            }

            //Ich möchte einen Würfel, die Breite und die Höhe soll in einen separaten variabeln
            //definiert sein
            int height = 15;
            int width = 10;

            int counter = 0;

            for (int a = 0; a < height; a++) {
                for (int f = 0; f < width; f++) {
                    System.out.print("*");
                    counter = counter + 1;
                    counter++;
                    counter += 1;
                    counter++;
                }
                System.out.println();
            }

        }
    }
}
