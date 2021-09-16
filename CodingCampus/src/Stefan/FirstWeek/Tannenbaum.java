package Stefan.FirstWeek;

public class Tannenbaum {
    public static void main(String[] args) {

        //Baumspitze
        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //Kreise
        for (int m = 0; m < 9; m++) {
            System.out.print("O");
        }
        System.out.println("");

        //Baumstamm
        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 3; i < 4; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Halterung
        for (int i = 1; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
