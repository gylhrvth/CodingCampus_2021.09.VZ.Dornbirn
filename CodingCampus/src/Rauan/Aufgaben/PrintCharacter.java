package Rauan.Aufgaben;

public class PrintCharacter {
    public static void main(String[] args) {
        printChars("X", 10);

    }

    private static void printChars(String charactar, int breit) {
        int line = 10;
        for (int i = 0; i <= line; i++) {
            System.out.print("X");

        }
        System.out.println();
    }
}
