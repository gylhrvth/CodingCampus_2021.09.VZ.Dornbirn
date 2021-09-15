package Danny.Woche1;

public class Aufgabe1_Schleifen {
    public static void main(String[] args) {

        // Aufgabe1
        for (int w = 5; w < 25; w += 5) {

            System.out.println(w);
        }


//While schleife
        int i = 5;
        while (i < 25) {
            System.out.println(i);
            i += 5;
        }



        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 5; x++) {
                System.out.print("X");
            }
            System.out.println();


        }

        // AufgabeWhile
        int i = 5;
        while (i < 25) {
            System.out.println("*");
            i += 5;
        }


    }


