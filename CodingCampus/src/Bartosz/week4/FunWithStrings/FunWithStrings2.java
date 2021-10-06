package Bartosz.week4.FunWithStrings;

import Bartosz.week4.FunWithStrings.FwS2Package.GetArrayInit;

public class FunWithStrings2 {
    public static void main(String[] args) {
        String[] myFunArray = GetArrayInit.getArrayForFun();

        System.out.println("Aufgabe 1:");
        GetArrayInit.alphabeticSortingRise(myFunArray);
        System.out.println();

        System.out.println("Aufgabe 2:");
        GetArrayInit.alphabeticSortingFall(myFunArray);
        System.out.println();

        System.out.println("Aufgabe 3:");
        GetArrayInit.longestWord(myFunArray);
        System.out.println();

        System.out.println("Aufgabe 4:");
        GetArrayInit.shortestWord(myFunArray);
        System.out.println();

        System.out.println("Aufgabe 5:");
        GetArrayInit.mostVowels(myFunArray);
        System.out.println();


    }

}
