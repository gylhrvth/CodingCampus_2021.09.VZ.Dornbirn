package Plamena.week2;

import Plamena.week1.Methods;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {


        Methods.drawArrow(5);
        Scanner sc = new Scanner(System.in);

        int input = 1;


        while (input != 0) {
            input = MenuWithUserInput();
            switch (input){
                case 1:
                System.out.println("Please enter height: ");
                Methods.drawChristmasTree(sc.nextInt());
                break;
                case 2:
                System.out.println("Please enter radius: ");
                Methods.drawCircle(sc.nextDouble());
                break;
                case 3:
                System.out.println("Please enter radius: ");
                Methods.drawHollowCircle(sc.nextDouble());
                break;
                case 4:
                System.out.println("Please enter height: ");
                Methods.drawArrow(sc.nextInt());
                break;
                case 5:
                System.out.println("Please enter width: ");
                Methods.drawSquare(sc.nextInt());
                break;
                case 6:
                System.out.println("Please enter width");
                Methods.drawHollowSquare(sc.nextInt());
                break;
                case 0:
                System.out.println("Goodbye!");
                break;
                default:
                System.out.println("Invalid enter!");
            }
        }


    }


    public static int MenuWithUserInput() {

        System.out.println("Choose an option:");
        System.out.println("To print a   CHRISTMASTREE  press 1");
        System.out.println("To print a   CIRCLE         press 2");
        System.out.println("To print an  HOLLOW CIRCLE  press 3");
        System.out.println("To print an  ARROW          press 4");
        System.out.println("To print a   SQUARE         press 5");
        System.out.println("To print a   HOLLOW SQUARE  press 6");
        System.out.println("To           EXIT           press 0");

        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Press a number between 0 and 6!");
            scanner.nextLine();
        }
        int input = scanner.nextInt();
        return input;
    }

}