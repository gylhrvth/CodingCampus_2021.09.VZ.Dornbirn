package Eray.week6.uebungsBeispiele;

public class BackSlash {
    public static void main(String[] args) {
        printSlashMain();
    }

    private static void printSlashMain() {
        //gebe true für ein Backslash ein und false für ein Frontslash und deine Höhe nicht vergessen!

        printBackOrForSlash(true, 7);
    }

    private static void printBackOrForSlash(boolean backslash, int backslashHeight) {

        int star = 1;

        if (backslash) {
            System.out.println("Backslash");
            int spaces = 0;
            for (int i = 0; i < backslashHeight; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                spaces++;
                System.out.println();
            }
        } else {
            System.out.println("Frontslash");
            int spaces = backslashHeight - 1;

            for (int i = 0; i < backslashHeight; i++) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                spaces--;
                System.out.println();
            }
        }
    }
}
