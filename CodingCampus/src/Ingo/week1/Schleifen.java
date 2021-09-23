package Ingo.week1;

public class Schleifen {
    public static void main(String[] args) {
        int rest = 10; // init
        while (rest > 0) { // prüfung
            System.out.println("Hello World!");
            --rest; // hochzählen
        }
        System.out.println("-------Neue Aufgabe---------------");

        int rest1 = 20;

        if (rest1 < 15) {
            System.out.println("Guten Tag");
        } else {
            System.out.println("Guten Abend");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        System.out.println("---------Neue Aufgabe---------------");

        int zeit = 20;
        String result = (zeit == 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        for (int i = 0; i < 8; i++) {
            System.out.println(i);
        }
        for (int i = 0
             ; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------Neue Aufgabe------------------");

        int height = 6;
        int spaces = 10;
        for (int i = 0; i < height; i++) {
            if (i == 0) {
                for (int j = 0; j <= spaces; j++) {
                    System.out.print("A");
                }
                System.out.println();
            } else if (i == height - 1) {
                for (int j = 0; j <= spaces; j++) {
                    System.out.print("A");
                }
                System.out.println();
            } else {
                for (int j = 0; j < spaces; j++) {
                    if (j == 0) {
                        System.out.print("A");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("A");
            }
        }
        System.out.println("-------------neue aufgabe---------------");

        int high = 5;
        int breit = 10;

        for (int i = 0; i < high; i++) {
            System.out.println("A");
            for (int j = 0; j < breit; j++) {
                System.out.print("B");
            }
            //   System.out.print("A");
        }

        System.out.println();


// Outputs "Good evening."


//        for (int i = 0; i < 10; ++i){
//            System.out.println(i + ". round");
//        }
//
//        int size = 5;
//        for (int i = 0; i < size; ++i){
//            for (int j = 0; j < size; j++) {
//                System.out.print("A");
//            }
//            System.out.println();
//        }
//        System.out.println("neue aufgabe");
//
//        int restZahl = 10;
//        while (restZahl > 0) {
//            System.out.println("Hello World");
//            restZahl--;
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("A");
//                for (int k = 0; k < 10; k++) {
//                    System.out.print("-");
//                }
//              //  System.out.print("A");
//            }
//            System.out.println(" X  "+i);
//        }
        System.out.println("------------------------");
        int hoch = 8;
        int breite = 6;
        for (int a = 0; a < hoch; a++) {
            for (int b = 0; b < breite; b++) {
                System.out.print("B");
            }
          //  System.out.println();
            if (a == 0) {
                System.out.print("*");
            } else {
                System.out.print("X");
            }
            System.out.println();

        }
    }

}
