package Bartosz.oldStuff.week2.ShortMethods;

public class FibonacciCalc {
    public static void main(String[] args) {
        printFibonacci(0,1);
    }

    public static void printFibonacci(int firstNumber, int secondNumber) {
        if (secondNumber > 100) {  //Sobald die Zweite Zahl so oft addiert wurde um mehr als 1000 zu sein
            return;                 // Ende
        }
        int thirdNumber = firstNumber + secondNumber;       //Summe = DritteZahl
        System.out.print(thirdNumber + " ");
        printFibonacci(secondNumber, thirdNumber);      // Code wird der Rheie nach verarbeitet, obererblock -> fuktion -> sout number3
        System.out.print(thirdNumber + " ");
    }

    public static void printAddition(int add1, int add2) {
       if(add2 > 200) {
           return;
       }
       else {
           int summe = add1 + add2;
           System.out.print(summe + " " + add2 + "    ");
           printFibonacci(add2, summe);
       }
    }

    }
