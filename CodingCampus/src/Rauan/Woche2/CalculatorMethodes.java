package Rauan.Woche2;


public class CalculatorMethodes {


    public static int calculator(int num1, int num2, String operator) {

        int result = 0;


        if (operator.equals(("+"))) {
            result = num1 + num2;
        } else if (operator.equals(("-"))) {
            result = num1 - num2;

        } else if (operator.equals(("*"))) {
            result = num1 * num2;

        } else if (operator.equals(("/"))) {
            result = num1 / num2;
        } else {
            System.out.println("is gibt keines");
        }

        return result;

    }

}