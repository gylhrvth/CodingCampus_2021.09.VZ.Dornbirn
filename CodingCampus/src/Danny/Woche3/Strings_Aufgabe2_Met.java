package Danny.Woche3;

public class Strings_Aufgabe2_Met {
    public static void main(String[] args) {

        stringAusgabeB("Ich heiße Lukas", 5, 2);

        //stringAusgabe("Ich heiße Lukas", 4, 5);

    }

    public static void stringAusgabe(String meinSubstring, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(meinSubstring.charAt(i));
        }
    }

    public static void stringAusgabeB(String meinSubstring, int start, int end) {
        for (int x = 0; x < end; x++) {
            for (int i = 0; i <= start; i++) {
                if (i == start) {
                    System.out.print(meinSubstring.charAt(i - 1));
                }
            }
            start++;
        }
    }
}