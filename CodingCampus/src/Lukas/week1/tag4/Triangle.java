package Lukas.week1.tag4;

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

        int height = 5;
        int upperHeight = height / 2;

        for (int i = 0; i < upperHeight; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int lowerHeight = height - upperHeight;

        for (int j = lowerHeight; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
