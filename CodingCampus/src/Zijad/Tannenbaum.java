package Zijad;

public class Tannenbaum {

    public static void main(String[] args) {

        int width = 9;
        int widthTrunk = width / 2;
        int space = widthTrunk;
        int leave = 1;
        int neW = widthTrunk/2;
        int New = widthTrunk/4;



        while (leave <= width) {

            for (int i = 0; i < space; i++) {
                System.out.print(" ");

            }
            for (int i = 0; i < leave; i++) {
                System.out.print("T");
            }
            System.out.println();

            leave = leave + 2;
            space -= 1;
        }

        for (int i = 0; i < widthTrunk - neW; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < widthTrunk; i++) {
            System.out.print("H");
        }
        System.out.println();



    }

}