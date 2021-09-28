package Gerhard.week2day5;

import java.util.Scanner;

public class Exercise2Scannertree2 {


    public static void tree(int height) {

        //Baumkrone
        int stars = 1;
        int spaces = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("\u001B[32m"+"*"+"\u001B[0m");
            }
            System.out.println();
            stars += 2;
            spaces--;
        }

        //Christbaumkugeln
        int width = height * 2 - 1;
        //int width = stars - 2;

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("O");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //Baumstamm
        int trunkWidth = width / 3;
        int trunkHeight = height / 4;

        int center = width / 2;
        int trunkLeftSpaces = center - (trunkWidth / 2);

        for (int i = 0; i < trunkHeight; i++) {
            for (int u = 0; u < trunkLeftSpaces; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("\u001B[35m"+"+"+"\u001B[0m");
            }
            System.out.println();


        }
    }

    public static void shiningTree(int height) {
        //     int height = 50;

        //Baumkrone
        int stars = 1;
        int spaces = height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("\u001B[32m"+"*"+"\u001B[0m");
            }
            System.out.println();
            stars += 2;
            spaces--;
        }

        //Christbaumkugeln
        int width = height * 2 - 1;
        //int width = stars - 2;

        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                System.out.print("\u001B[33m" + "O" + "\u001B[0m");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        //Baumstamm
        int trunkWidth = width / 3;
        int trunkHeight = height / 4;

        int center = width / 2;
        int trunkLeftSpaces = center - (trunkWidth / 2);

        for (int i = 0; i < trunkHeight; i++) {
            for (int u = 0; u < trunkLeftSpaces; u++) {
                System.out.print(" ");
            }
            for (int f = 0; f < trunkWidth; f++) {
                System.out.print("\u001B[35m"+"+"+"\u001B[0m");
            }
            System.out.println();
        }
        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------. ");
        System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
        System.out.println("| | ____    ____ | || |  _________   | || |  _______     | || |  _______     | || |  ____  ____  | | | |  ____  ____  | || | ____    ____ | || |      __      | || |    _______   | |");
        System.out.println("| ||_   \\  /   _|| || | |_   ___  |  | || | |_   __ \\    | || | |_   __ \\    | || | |_  _||_  _| | | | | |_  _||_  _| | || ||_   \\  /   _|| || |     /  \\     | || |   /  ___  |  | |");
        System.out.println("| |  |   \\/   |  | || |   | |_  \\_|  | || |   | |__) |   | || |   | |__) |   | || |   \\ \\  / /   | | | |   \\ \\  / /   | || |  |   \\/   |  | || |    / /\\ \\    | || |  |  (__ \\_|  | |");
        System.out.println("| |  | |\\  /| |  | || |   |  _|  _   | || |   |  __ /    | || |   |  __ /    | || |    \\ \\/ /    | | | |    > `' <    | || |  | |\\  /| |  | || |   / ____ \\   | || |   '.___`-.   | |");
        System.out.println("| | _| |_\\/_| |_ | || |  _| |___/ |  | || |  _| |  \\ \\_  | || |  _| |  \\ \\_  | || |    _|  |_    | | | |  _/ /'`\\ \\_  | || | _| |_\\/_| |_ | || | _/ /    \\ \\_ | || |  |`\\____) |  | |");
        System.out.println("| ||_____||_____|| || | |_________|  | || | |____| |___| | || | |____| |___| | || |   |______|   | | | | |____||____| | || ||_____||_____|| || ||____|  |____|| || |  |_______.'  | |");
        System.out.println("| |              | || |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
        System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
        System.out.println(" '----------------'  '----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------' ");

    }


    public static int menu() {


        Scanner scanner = new Scanner(System.in);
        //Solange eine Eingabe einfordern, solange es keine Zahl ist
        System.out.println("Um die größe des Christbaums zu bestimmen");
        System.out.println("bitte eine Zahl zwischen 0-100 eingeben:");
        int height = scanner.nextInt();
        System.out.println("Sie haben die Zahl " + height + " eingegeben!");
        System.out.println(" ");
        System.out.println("Wünschen Sie leuchtende Christbaumkugeln? ja / nein:");
        String glowingBalls = (scanner.next());
        switch (glowingBalls) {
            case "nein":
                tree(height);
                break;
            case "ja":
                shiningTree(height);
                break;
        }
        return height;
    }


    public static void main(String[] args) {
        int height = menu();
        //tree(height);
        //shiningTree(height);


    }
}

