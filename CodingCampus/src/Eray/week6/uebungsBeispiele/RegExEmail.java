package Eray.week6.uebungsBeispiele;

public class RegExEmail {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        String mailRegex = "[a-zA-Z]+[0-9]*(\\.[a-zA-Z-0-9]+)*@[a-zA-Z-0-9]+\\.[a-zA-Z]{2,3}";

        System.out.println("alfons@drlue.at".matches(mailRegex));
        System.out.println("rambina.alfons@drlue.at".matches(mailRegex));
        System.out.println("rambina1.1alfons@drlue.at".matches(mailRegex));
        System.out.println("1rambina1.alfons@drlue.at".matches(mailRegex));
        System.out.println("@drlue.at".matches(mailRegex));
        System.out.println("drlue.at".matches(mailRegex));
        System.out.println("asdf@drlue".matches(mailRegex));
        System.out.println("asdf@microsoft.c".matches(mailRegex));
    }
}
