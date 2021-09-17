package Bartosz.week1.loops;

public class LoopsEx2 {

    public static void main(String[] args) {

        // Using For Loops - this nice
        int widthX = 8;
        int heightY = 5;

        System.out.println();
        for (int counterY = 0; counterY < heightY; counterY++) {

            // Char width loop
            for (int counterX = 0; counterX < widthX; counterX++) {
                System.out.print("X");
            }

            System.out.println();   // Linebreak  after every Line reached width
        }

        // Using While Loops - this not so nice
        int widthWhileX = 3;
        int heightWhileY = 6;
        int counterY = 0;
        System.out.println();

        while (counterY < heightWhileY ){
            int counterX = 0;

            while (counterX < widthWhileX) {
                System.out.print("X");
                counterX++;
            }

            System.out.println();   // Linebreak  after every Line reached width
            counterY++;
        }
    }
    // End Main
}
