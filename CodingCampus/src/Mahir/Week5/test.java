package Mahir.Week5;

public class test {
    public static void main(String[] args) {
        int size = 5;
        String chars = "I";

        for (int i = 0; i < size; i++) {
            System.out.print(chars);
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(chars);
                for (int k = 0; k < size - 2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(chars);

        }


    }
}
