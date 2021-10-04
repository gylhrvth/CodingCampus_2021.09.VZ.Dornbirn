package Stefan.thirdWeek;

public class sanduhr {
    public static void main(String[] args) {

        int width = 7;
        int abstand = width / 2;
        int stars = width;


        //Obere Spitze
        for (int i = width; i > 0; i--) {
            for (int l = 0; l < width - i; l++) {
                System.out.print(" ");
            }

            for (int j = stars - i; j < i; j++) {
                System.out.print("*");

            }

            System.out.println();

            if (i - (stars - i) == 1) {
               i = 0;
           }
        }


        //Untere Spitze
        for (int i = 0; i < width; i++) {
            if(width < i * 2 + 2) {
                for (int b = 1; b < width - i; b++) {
                    System.out.print(" ");
                }

                for (int j = width; j < i * 2 + 2; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }

}

