package Bartosz.week8.oop.exercise2;

import Bartosz.week8.oop.exercise2.MenuOptions;
import java.util.Scanner;

public class Run {
    public static int userInput() {
        Scanner uI = new Scanner(System.in);
        return uI.nextInt();
    }

    public static void printMenu(int uI){
        System.out.println("------------------");
        System.out.println("Welcome to Sorting");
        System.out.println("What do you want to sort after?");
        System.out.println("age [1], weight [2], height [3], name [4]");

       switch(uI) {
           case 1 -> {
               System.out.println("Sorting after:" + MenuOptions.AGE);
           }

           case 2 -> {
               System.out.println("Sorting after:" + MenuOptions.WEIGHT);
           }

           case 3 -> {
               System.out.println("Sorting after:" + MenuOptions.HEIGHT);
           }

           case 4 -> {
               System.out.println("Sorting after:" + MenuOptions.NAME);
           }
           default -> System.out.println(MenuOptions.NOT_AN_OPTION);
       }
    }
}


