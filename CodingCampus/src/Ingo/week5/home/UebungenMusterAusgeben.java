package Ingo.week5.home;

public class UebungenMusterAusgeben {
    public static void main(String[] args) {

        int number = 5;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }


}

