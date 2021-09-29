package Stefan.thirdWeek.Strings;

import java.util.*;

public class myWorkStringArray {
    public static void main(String[] args) {


        //Text auf Console eingeben und wieder ausgeben
        Scanner stringArrayWork = new Scanner(System.in);
        String textEingabe;

        System.out.println("Gib ein Wort ein!");
        textEingabe = stringArrayWork.nextLine();

        System.out.println("Du hast: " + textEingabe + " eingegeben");
        System.out.println();


        //Eingabe in einen Char umgewandelt
        String textEingabe1 = textEingabe;
        char[] myCharArray = textEingabe1.toCharArray();
        System.out.print("Vom Char ausgegeben: ");
        System.out.println(myCharArray);
        System.out.println();


        //Eingabe umgekehrt ausgeben Variante 1
        StringBuffer umgedreht = new StringBuffer(textEingabe1);
        umgedreht.reverse();
        String text = umgedreht.toString();
        System.out.println("Ausgabe umgekehrt mit reverse: " + text);
        System.out.println();


        //Eingabe umgekehrt ausgeben Variante 2
        System.out.print("Ausgabe umgekehrt mit for schleife: ");
        for (int i = myCharArray.length - 1; i >= 0; i--) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
        System.out.println();


        //Ausgabe der Menge aller Buchstaben
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        System.out.println("Gezählte Buchstaben: ");
        for (int i = 0; i < textEingabe1.length(); i++) {
            Character key = textEingabe1.toLowerCase().charAt(i);
            if (charMap.containsKey(key)) {
                charMap.put(key, charMap.get(key) + 1);
            } else {
                charMap.put(key, 1);
            }
        }

        Set<Character> keySet = charMap.keySet();
        for (Character character : keySet) {
            System.out.print("[" + character + "] = " + charMap.get(character) + ", ");
        }
        System.out.println();





    }


}
