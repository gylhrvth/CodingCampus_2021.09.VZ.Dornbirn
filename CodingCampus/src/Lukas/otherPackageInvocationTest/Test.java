package Lukas.otherPackageInvocationTest;

import Lukas.week4.day3.Strings;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 8, 10};
        System.out.println(Arrays.toString(arr));

        Lukas.week4.day3.Arrays.swap(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Strings.ALL_MEMBERS);
    }
}
