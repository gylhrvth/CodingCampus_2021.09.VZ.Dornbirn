package Rauan.Aufgaben.woche5;

public class PrintRohmbus {
    public static void main(String[] args) {
        printRohmbusUpperhalf(10, "X");
        printRohmbusLowerhalf(10, "X");

    }

    private static void printRohmbusUpperhalf(int height, String charachter) {
        int HeightHalf = height / 2;
        int stars = 1;
        int space = HeightHalf;
        for (int i = 0; i < HeightHalf; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print(charachter);
            }
            space--;
            stars += 2;
            System.out.println();
        }
    }

    private static void printRohmbusLowerhalf(int height, String character) {
        int heightHalf = height / 2;
        int lowerHalf = height - heightHalf;
        int stars = heightHalf* 2 - 1;
        int space = 1;
        for (int i = 0; i < lowerHalf; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = stars; j > i; j--) {
                System.out.print(character);
            }
            space++;
            stars--;
            System.out.println();
        }
    }
}
