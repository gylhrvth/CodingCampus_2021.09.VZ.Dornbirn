package Bartosz.week1;

public class LoopsEx3arrow {
    public static void main(String[] args) {

        int counter = 0;
        int rows = 9;

        while (counter < rows ) {

            if (counter < 5) {
                for (int m = 0; m <= counter; m++) {
                    System.out.print("*");
                }
            } else {
                for (int m = rows; m > counter; m--) {
                    System.out.print("*");
                }
            }


            System.out.println();
            counter++;
        }

    }   //End Main
}


