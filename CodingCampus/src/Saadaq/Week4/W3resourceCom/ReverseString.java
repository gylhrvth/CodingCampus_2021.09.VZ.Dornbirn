package Saadaq.Week4.W3resourceCom;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

        System.out.print("Type a String: ");

        char[] letters = scanner.nextLine().toCharArray();


        System.out.print("Reserve String:");

        for (int i=letters.length-1; i>=0; i--){
            System.out.print(letters[i]);

        }

        System.out.println();











    }




    }






