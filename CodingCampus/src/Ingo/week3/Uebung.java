package Ingo.week3;

public class Uebung {


    public static void main(String[] args) {

        int arrayLength = 5;

        //version1
        int[] numbers = new int[arrayLength];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //version2
        int[] numbers2 = {1, 2, 3, 4, 5};

        //version3
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (i == 2) {
                System.out.println("du hast 3 erreicht");
            }
        }
        System.out.println();
        System.out.println("foreach schleife");

        for (int number : numbers) {
            System.out.println(number);
        }
    }


    public static void sayHeyStjepan() {
        System.out.print("hey stjepan");

    }

    public static double mal(double a, double b) {
        return a * b;
    }

    public static double mal(double a, double b, double c) {
        return a * b * c;
    }


}
