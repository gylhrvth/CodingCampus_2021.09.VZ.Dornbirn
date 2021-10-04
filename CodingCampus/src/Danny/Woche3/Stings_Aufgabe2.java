package Danny.Woche3;

public class Stings_Aufgabe2 {
    public static void main(String[] args) {

        aufgabeAlsChar("Ich heiße Lukas", 5, 2);

        String meinSubstring = "Ich heiße Lukas";

        System.out.println("------------");

        String kurz = meinSubstring.substring(4, 6);
        System.out.println(kurz);

        System.out.println("------------");

        int i = 4;
        while (i <= 5) {
            System.out.print(meinSubstring.charAt(i));
            i++;
        }
        System.out.println();

        for (i = 4; i <= 5; i++) {
            System.out.print(meinSubstring.charAt(i));
        }
    }

    public static void aufgabeAlsChar(String meinSubstring, int start, int count) {
        System.out.println(meinSubstring.substring(start - 1, start - 1 + count));
        int offset = start - 1;
        char[] meinSubstringC = meinSubstring.toCharArray();
        System.out.println(String.valueOf(meinSubstringC, offset, count));
    }

}

