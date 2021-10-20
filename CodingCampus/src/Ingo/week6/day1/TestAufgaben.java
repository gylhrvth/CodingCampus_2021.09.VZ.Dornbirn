package Ingo.week6.day1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestAufgaben {
    public static void main(String[] args) {
        //    countEvenNumbers(10);
        //    countNumbers();
        //    printCharacters("X",10);
        System.out.println("------------------------");
        //    printSquare(5,"X");
        System.out.println();
        //    printSlash("X", 3, true);
        //    printSlash1("Y",4,true);
     //   printSlash("X",5,false);
     //   printTriangle("X",5);
     //   printScanner();
     //   printZahl();
     //   randomNumbers(100);
        randomNumbCrazy(10);


    }
    // Aufgabe: Random Number Array Min/Max/Avg  !!
    private static void printMinMaxAvg(int arrayLenght) {
        Random random = new Random();
        int[] minmaxArr = new int[arrayLenght];
        for (int i = 0; i < minmaxArr.length; i++) {
            minmaxArr[i] += random.nextInt(1000);
        }
    }



    // Aufgabe: Random Number Array Crazy Range !
    public static void randomNumbCrazy(int arrayLength){
        Random random = new Random();
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100)-50;
        }for (int ingo : randomArray){
            System.out.println(ingo);
        }

    }

    // Aufgabe: Random Number Array !
    public static void randomNumbers(int arrayLength) {
        Random random = new Random();
        int[] randomArray = new int[arrayLength];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(randomArray));

        for (int element : randomArray){
            System.out.println(element);

        }
        System.out.println();
        // array Index Stelle 2,5,10 !
        System.out.println(randomArray[1]);
        System.out.println(randomArray[4]);
        System.out.println(randomArray[9]);
        System.out.println();
        // jeden zweiten Wert im array !
        for (int i = 0; i < randomArray.length; i+=2) {
            System.out.println(randomArray[i]);
        }
    }



    // Aufgabe: Taschenrechner !
    public static void printTaschenrechner(){

    }

    public static void printZahl(){
        Scanner scanner = new Scanner(System.in);
        int numb = 0;
        System.out.println("Gib eine Zahl ein: ");

        while(!scanner.hasNextInt()){
            System.out.println("Bitte eine Zahl eingeben: ");
            scanner.nextLine();
        }
        System.out.println(scanner.nextLine());
    }


    // Aufgabe: Input - String einlesen !
    private static void printScanner(){
        Scanner scanner = new Scanner(System.in);
        String text = "ich du er sie es wir ihr sie";
        System.out.println("Deine eingabe: ");
        System.out.println(scanner.nextLine());

    }


    // Aufgabe: Triangle !
    private static void printTriangle(String sign, int size) {
        int spaces = size;
        int printChar = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= printChar; k++) {
                    if (i == size){
                        System.out.print(printChar);

                }else if(k>0 && k < printChar){
                    System.out.print(" ");
                }else {
                        System.out.print(sign);
                    }
            }
            System.out.println();
            spaces--;
            printChar+= 2;
        }

    }

    // Aufgabe: Pritnt Slash true !
    private static void printSlash(String sign, int numb, boolean backslash) {
        if (backslash) {
            int spaces = 0;
            for (int i = numb; i > 0; i--) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                System.out.println(sign);
                spaces++;
            }
        } else {
            int spaces2 = 4;
            for (int i = 0; i < numb; i++) {
                for (int j = 0; j < spaces2; j++) {
                    System.out.print(" ");
                }
                System.out.println(sign);
                spaces2--;
            }
        }

    }

    // Aufgabe: Print Square !
    private static void printSquare(int size, String symbol) {
        for (int i = 0; i < size; i++) {
            System.out.print(symbol);
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j > 0 && j < size - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(symbol);
        }

    }


    // Aufgabe: Print Characters !
    private static void printCharacters(String chars, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(chars);
        }
    }

    // Aufgabe: Zählen mit Trick (Modulo) !
    private static void countEvenNumbers(int numb) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Aufgabe: Zählen 2:
    private static void countNumbers() {
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
    }


    // Aufgabe: Zählen !
    private static void counting(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.println(num);

        }
    }


}
