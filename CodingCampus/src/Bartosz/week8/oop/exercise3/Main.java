package Bartosz.week8.oop.exercise3;

import Bartosz.week8.oop.exercise2.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fotoapparat LeicaQ2 = new Fotoapparat("Q2", "Leica", 50);
        Fotoapparat Canon_EOS = new Fotoapparat("R6", "Canon", 21);

        Objektiv Leica212 = new Objektiv(true, 22, "Leica", 35);
        Objektiv Leica213 = new Objektiv(true, 22, "Leica", 28);

        Objektiv CanonEOS_L56 = new Objektiv(true, 25, "Bajonett", 30);
        Objektiv CanonEOS_L36 = new Objektiv(false, 25, "Bajonett", 35);

        MemoryCard card1 = new MemoryCard("ssd", 65536, "BOTH");
        MemoryCard card2 = new MemoryCard("hdd", 131072, "PICTURES");

    }

    // Hardware
    private static ArrayList<Fotoapparat> cameras(Fotoapparat f1, Fotoapparat f2, Fotoapparat f3, Fotoapparat f4) {
        ArrayList<Fotoapparat> cameras = new ArrayList<Fotoapparat>();
        cameras.add(f1);
        cameras.add(f2);
        cameras.add(f3);
        cameras.add(f4);
        return cameras;
    }
    private static ArrayList<Objektiv> objective(Objektiv o1,Objektiv o2,Objektiv o3,Objektiv o4,Objektiv o5,Objektiv o6,Objektiv o7){
        ArrayList<Objektiv> objektive = new ArrayList<>();
        objektive.add(o1);
        objektive.add(o2);
        objektive.add(o3);
        objektive.add(o4);
        objektive.add(o5);
        objektive.add(o6);
        objektive.add(o7);
        return objektive;
    }

   // private static //

    // Photos
    protected static HashMap Photo(double photoSize){
        String patpat= "∧__∧\n" +
                "（｀•ω• )づ__∧\n" +
                "（つ　 /( •ω•。)\n" +
                "しーＪ (nnノ) pat pat";
        HashMap<String, Double> returningValue = new HashMap<String, Double>();
        returningValue.put(patpat, photoSize);
        return returningValue;
    }       // photo img
    // calculate each photo size
    protected static double calcPhotoSize(ArrayList<Fotoapparat> camera, ArrayList<Objektiv> objektiv, int userCamera, int userObjektiv) {
        double brennweite = (double)(objektiv.get(userObjektiv).getBrennweite() / 100) + 1;
        return camera.get(userCamera).getMp() * 0.3 *  brennweite;
    }

    protected static ArrayList<String> memory(String Photo){
        ArrayList<String> cardMemory = new ArrayList<>();
        cardMemory.add(Photo);
        return cardMemory;
    }   // Photo saved in Array List


    protected static double checkMemory(List<String> cardMemory, double photoSize) {
            for(String photo : cardMemory){

            }
        return 0;
    }

    protected static void runMenu() {
        boolean runtime = true;
        do {
            printMenu();
            userInput();

            switch (userInput()) {
                case 1 -> {         //  take photo

                }
                case 2 -> {         //  Check memory

                }
                case 3 -> {         //  Camera configs

                }
                case 4 -> {
                    runtime = false;
                }
                default -> System.out.println("Please choose from the options above.");
            }

        } while(runtime);
    }

    private static void printMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("Welcome to the Camera - chose your actions:");
        System.out.println("[1] Take Photo");
        System.out.println("[2] Check memory space");
        System.out.println("[3] Camera configuration");
        System.out.println("[4] Close program");
        System.out.println("-------------------------------------------");
    }
    private static int userInput() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextInt();
    }
}
