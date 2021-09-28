package Saadaq.weekTwo;

import java.util.StringTokenizer;

public class CalculatorMethod {

    public static double calculate(int num1, String operator, int num2) {

    double result = 0;

    if(operator.equals(("+"))){
        result = num1+num2;

    }else if (operator.equals(("-"))){
        result = num1-num2;

    }else if (operator.equals("*")){
        result = num1*num2;

    }else if (operator.equals(("/"))){
        result = num1+num2;

    }else {
        System.out.println("Unknow operator!");
    }
    return result;

    }


    public static int swichTest (int num1, int num2, String operator){
        int result = 0;

        switch (operator) {

            case "+": result = num1 + num2;break;
            case "-": result = num1-num2; break;
            case "*": result = num1*num2; break;
            case "/": result = num1/num2; break;

        }
        return result;

    }

}
