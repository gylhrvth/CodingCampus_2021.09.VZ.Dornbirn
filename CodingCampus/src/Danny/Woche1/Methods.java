package Danny.Woche1;

public class Methods {
    public static void main(String[] args) {
        printStar(2, "x");
        simpleCal(10, "*", 3);
    }


    public static void printStar(int pices, String charater) {

        for (int x = 0; x < pices; x++) {
            System.out.print(charater);
        }

    }

    public static void simpleCal(int Zahl1, String operation, int Zahl2) {

        boolean plus = operation.equals("+");
        boolean minus = operation.equals("-");
        boolean mal = operation.equals("*");
        boolean durch = operation.equals("/");

        if (plus) {
            System.out.println(Zahl1 + " + " + Zahl2 + " = " + (Zahl1 + Zahl2));
        }
        if (minus) {
            System.out.println(Zahl1 + " - " + Zahl2 + " = " + (Zahl1 - Zahl2));
        }
        if (mal) {
            System.out.println(Zahl1 + " * " + Zahl2 + " = " + (Zahl1 * Zahl2));
        }
        if (durch) {
            System.out.println(Zahl1 + " : " + Zahl2 + " = " + (Zahl1 / Zahl2));
        }
    }

}






