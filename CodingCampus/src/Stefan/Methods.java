package Stefan;

public class Methods {
    public static void main(String[] args) {
//        for (int a = 0; a < 10; a++) {
//            printStar();
//        }
        printTriangle(10);

        repeat(10, "-");

    }

    public static void printStar() {
        for (int a = 0; a <= 10; a++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printTriangle(int height) {
        int upperHeight = height / 2;
        int lowerHeight = height - upperHeight;
        for (int a = 0; a < upperHeight; a++) {
            repeat(a);
        }
        for(int a = lowerHeight; a > 0; a--) {
            repeat(a);
        }
    }
//
    public static void repeat(int times) {
        for (int i = 0; i < times; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void repeat(int times, String character) {
        for (int i = 0; i < times; i++) {
            System.out.print(character);
        }
        System.out.println();
    }
}
