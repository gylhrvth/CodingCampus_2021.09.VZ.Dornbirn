package Lukas.week2;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(addUpTo(10));
        System.out.println(addUpToRecursion(15000));
        addUpToRecursion(10000, 0);
    }

    public static int addUpTo(int upperLimit) {
        int result = 0;
        for (int i = 0; i <= upperLimit; i++) {
            result += i;
        }
        return result;
    }

    public static int addUpToRecursion(int upperLimit) {
        return upperLimit == 0 ? 0 : upperLimit + addUpToRecursion(upperLimit - 1);
    }

    public static void addUpToRecursion(int upperLimit, int result) {
        if(upperLimit == 0) {
            System.out.println(result);
            return;
        }
        addUpToRecursion(upperLimit-1, result + upperLimit);
    }
}
