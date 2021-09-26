package Oemer.Week2;

import java.util.Scanner;

public class Tag8Menu {
    public static void main(String[] args) {
        System.out.println("weinachtsBaum");
        sleepFor(200);
        System.out.println("printTriangel");
        sleepFor(200);
        System.out.println("baumStamm");
        sleepFor(200);
        System.out.println("kugel");
        sleepFor(200);

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println();

scanner.nextInt();


    }

    public static void sleepFor(int ms){
        try{
            Thread.sleep(ms);
        } catch (InterruptedException ie){}
    }
}


