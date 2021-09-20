package Bartosz.week2.calculatorMethods;

public class Calculate {
        public static double calculate(double zahl1, String operator, double zahl2) {

            double result = 0;

            if (operator.equals("+")) {
                result = zahl1 + zahl2;

            } else if (operator.equals("-")) {
                result = zahl1 - zahl2;

            } else if (operator.equals("*")) {
                result = zahl1 * zahl2;

            } else if (operator.equals("/")) {
                result = zahl1 / zahl2;

            } else {
                System.out.println("Unknown operator");
            }
            return result;
        }
    }

