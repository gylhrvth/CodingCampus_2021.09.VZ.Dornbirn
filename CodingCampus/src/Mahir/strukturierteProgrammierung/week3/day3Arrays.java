package Mahir.strukturierteProgrammierung.week3;

import java.util.Arrays;
import java.util.Scanner;

public class day3Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hallo = scanner.next();
        char[] arr = hallo.toCharArray();
        //1a)
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        //1b)
        String hallo2 = "";


        for (int i = arr.length - 1; i >= 0; i--) {
            hallo2 += arr[i];

        }
        System.out.println(hallo2);

        //1c)

        char[] newArr = hallo2.toCharArray();

        for (int i = newArr.length - 1; i >= 0; i--) {

        }
        System.out.println(newArr);
    }
}
