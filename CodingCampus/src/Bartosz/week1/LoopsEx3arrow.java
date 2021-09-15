package Bartosz.week1;

public class LoopsEx3arrow {
    public static void main(String[] args) {

        int counter = 0;
        int rows = 9;

        while (counter < rows ) {

            if (counter < 5) {
                for (int kontroller = 0; kontroller <= counter; kontroller++) {
                    System.out.print("*");
                }
            } else {
                for (int kontroller = rows; kontroller > counter; kontroller--) {
                    System.out.print("*");
                }
            }

            System.out.println();
            counter++;
        }

    }   //End Main
}


