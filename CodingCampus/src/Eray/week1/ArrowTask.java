package Eray.week1;

public class ArrowTask {
    public static void main(String[] args) {
        //Arrow solution
        int columns = 0;
        boolean switchSide = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; columns > j; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (columns == 5) {
                switchSide = true;
            }
            if (switchSide) {
                columns--;
            } else {
                columns++;
            }
        }
    }
}
