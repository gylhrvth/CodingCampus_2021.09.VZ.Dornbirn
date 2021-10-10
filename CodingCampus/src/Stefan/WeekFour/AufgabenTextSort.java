package Stefan.WeekFour;

import java.util.*;

import Lukas.week4.day3.Strings;
import Lukas.week4.day4.Aufgabe1;

public class AufgabenTextSort {
    public static void main(String[] args) {

        String text = Aufgabe1.TEXT_TO_ANALYZE;
        String text1 = Aufgabe1.TEXT_TO_ANALYSE_2;
        String text2 = Aufgabe1.TEXT_TO_ANALYSE_3;
        String text3 = Aufgabe1.TEXT_TO_ANALYSE_4;
//
        String[] words = text.split("[ \\n]");
        String tmp3 = Arrays.toString(words);

        KeyMap(tmp3);


//        //Ersetze jedes Freisebad durch ___ und gib den Text aus
//        System.out.println();
//        String fixedInput = text.replaceAll("Freisebad", "_________");
//        System.out.println(fixedInput);
//        System.out.println();
//
//        //Ersetze jedes ist, und oder durch ___ und gib den Text aus
//        System.out.println();
//        String fixedInput1 = text.replaceAll("ist|und|oder", "_____");
//        System.out.println(fixedInput1);
//        System.out.println();
//
//

        //Benutzereingabe und Ausgabe mit Zeichenaustausch
//        Scanner stringArrayWork = new Scanner(System.in);
//        String textEingabe;
//
//        System.out.println("Gib einen einzeiligen Text ein");
//        textEingabe = stringArrayWork.nextLine();
//
//        System.out.println();
//        String fixedInput1 = textEingabe.replaceAll("[a-zA-Z0-9]", "_");
//        System.out.println();
//
//        System.out.println("Du hast: " + fixedInput1 + " eingegeben");
//        System.out.println();


        //Zählt alle Zeichen im Text und gibt deren Menge aus TEXT_TO_ANALYZE

//        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
//        System.out.println("Gezählte Zeichen: ");
//        for (int i = 0; i < tmp3.length(); i++) {
//            Character key = tmp3.toLowerCase().charAt(i);
//            if (charMap.containsKey(key)) {
//                charMap.put(key, charMap.get(key) + 1);
//            } else {
//                charMap.put(key, 1);
//            }
//        }
//
//        Set<Character> keySet = charMap.keySet();
//        for (Character character : keySet) {
//            System.out.print("[" + character + "] = " + charMap.get(character) + ", ");
//        }
//        System.out.println();
//        System.out.println();

//        //Zählt alle Buchstaben und gibt deren Menge aus
//        String neuer = text.toLowerCase();
//        char[] character = neuer.toCharArray();
//        int[] counter = new int[26];
//        System.out.println("Gezählte Buchstaben mit Array: ");
//        for (int i = 0; i < character.length; i++) {
//            char myChar = character[i];
//            int indexOfCounter = myChar - 97;
//            if (indexOfCounter >= 0 && indexOfCounter < counter.length) {
//                counter[indexOfCounter]++;
//            }
//        }
//        for (int i = 0; i < counter.length; i++) {
//            if (counter[i] != 0) {
//                System.out.print(("[" + (char) (i + 97)) + "]" + " = " + counter[i] + ", ");
//            }
//        }


    }

    private static void KeyMap(String param) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        System.out.println("Gezählte Zeichen: ");
        for (int i = 0; i < param.length(); i++) {
            Character key = param.toLowerCase().charAt(i);
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
        System.out.println();
    }

}

