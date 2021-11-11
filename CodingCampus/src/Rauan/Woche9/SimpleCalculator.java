package Rauan.Woche9;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        int n1=0;
        int n2=0;
        double Answer = 0.0;
        char operator;

        System.out.println("Enter The first Number");
        n1 = calc.nextInt();
        System.out.println("Enter The second Number");
        n2 = calc.nextInt();
        System.out.println("Select The Order of Operation");
         operator = calc.next().charAt(0);
/*
        if (operator == '+') {
            Answer = (n1 + n2);
            System.out.println("Answer:" + Answer);
        }
        if (operator == '-') {
            Answer = (n1 - n2);
            System.out.println("Answer:" + Answer);
        }
        if (operator == '*') {
            Answer = (n1 * n2);
            System.out.println("Answer:" + Answer);
        }
        if (operator == '/') {
            Answer = (n1 / n2);
            System.out.println("Answer:" + Answer);
        } else {
            System.out.println("not implemented yet. Sorry!");
        }

 */
        switch (operator) {
            case '+':
                Answer = n1 + n2;
                break;
            case '-':
                Answer = n1 - n2;
                break;
            case '*':
                Answer = n1 * n2;
                break;
            case '/':
                Answer = n1 / n2;
                break;
            default:
               
        }
        System.out.println(n1 + " " + operator + " " + n2+" = "+ Answer);


    }
}
