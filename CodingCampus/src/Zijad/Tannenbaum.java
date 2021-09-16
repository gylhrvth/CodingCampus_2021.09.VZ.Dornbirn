package Zijad;

public class Tannenbaum {

    public static void main(String[] args) {

        int width = 15;
        int widthHalf = width/2;
        int space = widthHalf;
        int leave = 1;
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


        for (int i = 0; i < widthHalf - (7 / 2); i++) {
            System.out.print(" ");
        }
        System.out.println("HHHHHHH");
    }
}

