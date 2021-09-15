package Bartosz.week1;

public class LoopsEx1 {
    public static void main(String[] args) {


        // for loop
        for (int counterFor = 1; counterFor <= 10; counterFor++) {
            int number1 = 8;
            System.out.println(number1 * counterFor);
        }

        System.out.println("----Next Loop----");

        // while loop
        int counterWhile = 1;
        while (counterWhile <= 10) {
            int number2 = 6;
            System.out.println(number2 * counterWhile);
            counterWhile++;
        }
    }
}
