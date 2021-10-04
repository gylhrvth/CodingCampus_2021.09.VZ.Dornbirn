package Bartosz.week1.loops.loopFunctions;

public class Ex3Arrow {
    public static void printArrow(int rows) {

        for (int counter = 0; counter <= rows; counter++) {
            if (counter < rows / 2) {
                for (int widthOutput = 0; widthOutput <= counter; widthOutput++) {
                    System.out.print("*");
                }
            } else {
                for (int widthOutput = rows ; widthOutput > counter; --widthOutput) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
