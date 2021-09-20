package Danny.Woche1;

public class Methods {
    public static void main(String[] args) {
        printStar(2, "x");

    }


    public static void printStar(int pices, String charater) {

        for (int x = 0; x < pices; x++) {
            System.out.print(charater);
        }

    }

    public static void simpleCal(int Zahl1, String operation, int Zahl2) {


        if ( "+".equals(operation)) {
            System.out.println(Zahl1 + " + " + Zahl2 + " = " + (Zahl1 + Zahl2));
        }
        if ("-".equals(operation)) {
            System.out.println(Zahl1 + " - " + Zahl2 + " = " + (Zahl1 - Zahl2));
        }
        if ("*".equals(operation)) {
            System.out.println(Zahl1 + " * " + Zahl2 + " = " + (Zahl1 * Zahl2));
        }
        if ("/".equals(operation)) {
            System.out.println(Zahl1 + " : " + Zahl2 + " = " + (Zahl1 / Zahl2));
        }
    }

}






