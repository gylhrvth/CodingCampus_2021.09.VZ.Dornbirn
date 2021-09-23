package Ingo.week1;

public class Triangle {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //****
        //***
        //**
        //*

//        int height = 5;
//        int upperHeight = height / 2;
//
//        for (int i = 0; i < upperHeight; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        int lowerHeight = height - upperHeight;
//
//        for (int j = lowerHeight; j > 0; j--) {
//            for (int i = 0; i < j; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int hoehe = 8;
        int obereHoehe = hoehe / 2;

        for (int a = 0; a < obereHoehe; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int untereHoehe = hoehe - obereHoehe;

        for (int d = untereHoehe; d > 0; d--) {
            for (int e = 0; e < d; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int x = 10;
        int y = 8;

        for (int a = 0; a < x; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("X");
            }
            System.out.println();
        }
        for (int e= y; e > 0; e--) {
            for (int g = 0; g < y; g++) {
                System.out.print("X");

            }
            System.out.println();
        }


        int ganzeHigh = 8;
        int aboveHigh = ganzeHigh / 2;

        for (int a = 0; a < aboveHigh; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();

        }
        int untersteHigh = ganzeHigh - aboveHigh;

        for (int d = untersteHigh; d > 0; d--) {
            for (int e = 0; e < d; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
