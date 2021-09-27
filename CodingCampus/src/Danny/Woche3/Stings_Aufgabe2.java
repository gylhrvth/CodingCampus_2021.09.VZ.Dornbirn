package Danny.Woche3;

public class Stings_Aufgabe2 {
    public static void main(String[] args) {


        String meinSubstring = "Ich heiße Lukas";


        String kurz = meinSubstring.substring(4, 6);
        System.out.println(kurz);

        System.out.println();

        int i = 4;
        while (i <= 5) {
            System.out.print(meinSubstring.charAt(i));
            i++;
        }
        System.out.println();

        for (i = 4; i <= 5; i++) {
            System.out.print(meinSubstring.charAt(i));
        }
        System.out.println();
        char[] meinSubstringC = {'I', 'c', 'h', ' ', 'h', 'e', 'i', 'ß', 'e', ' ', 'L', 'u', 'k', 'a', 's' };
        System.out.print(String.valueOf(meinSubstringC, 4, 2));
    }

}

