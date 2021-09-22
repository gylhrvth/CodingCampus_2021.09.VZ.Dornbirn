package Lukas.week2.day3;

public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(sum(20000));
        System.out.println(sumRecursive(20));
    }

    public static int sum(int end) {
        int result = 0;
        for (int i = 0; i <= end; i++) {
            result += i;
        }
        return result;
    }

    //recursive 4
    //4 + sum(3 + sum(2 + sum(1 + sum(0))))
    //4 + sum(3 + sum(2 + sum(1 +     0 )))
    //4 + sum(3 + sum(2 +     1         ))
    //4 + sum(3 +     3          )
    //4 + 6
    //10

    public static int sumRecursive(int end) {


//        int a = 10;

//        int b;
//        if(a < 10) {
//            b = 0;
//        } else {
//            b = 100;
//        }

//        int b = a < 10 ? 0 : 100;

        return end == 0 ? 0 : end + sumRecursive(end - 1);
    }
}
