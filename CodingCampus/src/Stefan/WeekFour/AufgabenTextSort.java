package Stefan.WeekFour;

import Bartosz.week4.FunWithStrings.FwS2Package.GetArrayInit;
import Lukas.week4.day4.Aufgabe1;

public class AufgabenTextSort {
    public static void main(String[] args) {


        String text = Aufgabe1.TEXT_TO_ANALYZE;
        String text1 = Aufgabe1.TEXT_TO_ANALYSE_2;
        String text2 = Aufgabe1.TEXT_TO_ANALYSE_3;
        String text3 = Aufgabe1.TEXT_TO_ANALYSE_4;


        //Zählt alle Wörter und gibt diese aus
        System.out.println("Der Text enthält " + wordCounter(text) + " Wörter!");

        //Zählt alle zeilen und gibt diese aus
        System.out.println("Der Text besteht aus " + rowCounter(text) + " zeilen!");

        //Ersetze jedes Freisebad durch ___ und gib den Text aus
//        ZeichenTausch(text);

        //Ersetze jedes ist, und oder durch ___ und gib den Text aus
//        ZeichenTausch2(text);

        //Benutzereingabe und Ausgabe mit Zeichenaustausch
//        textErsetzen(text);

        //Zähle jedes Zeichen im Text und gib dessen Häufigkeit aus. Alle Texte
//        System.out.println("TEXT_TO_ANALYZE Ergebnis");
//        String[] words = text.split("[ \\n]");
//        String tmp1 = Arrays.toString(words);
//        KeyMap(tmp1);
//        System.out.println();
//
//        System.out.println("TEXT_TO_ANALYZE_2 Ergebnis");
//        String[] words1 = text1.split("[ \\n]");
//        String tmp2 = Arrays.toString(words1);
//        KeyMap(tmp2);
//        System.out.println();
//
//        System.out.println("TEXT_TO_ANALYZE_3 Ergebnis");
//        String[] words2 = text2.split("[ \\n]");
//        String tmp3 = Arrays.toString(words2);
//        KeyMap(tmp3);
//        System.out.println();
//
//        System.out.println("TEXT_TO_ANALYZE_4 Ergebnis");
//        String[] words3 = text3.split("[ \\n]");
//        String tmp4 = Arrays.toString(words3);
//        KeyMap(tmp4);
//        System.out.println();


        //Zählt alle Buchstaben des Alphabet und gibt deren Menge aus
        alphabet(text);

    }

    //Zählt all Wörter im String und gibt die Wortmenge aus
    private static int wordCounter (String param) {
        int counter = 0;

        String[] words = param.split(" ");
        for (int counter1 = 0; counter1 < words.length - 1; counter1++) {
            counter++;
        }

        return counter;
    }


    //Zählt all Zeilen im String und gibt die Wortmenge aus
    private static int rowCounter (String param) {
        int rowsCounter = 0;

        String[] rows = param.split("\\n");
        for (int counter = 0; counter < rows.length; counter++) {
            rowsCounter++;
        }

        return rowsCounter;
    }


    //Ersetzt alle Wörter mit einem Unterstrich
//    private static void textErsetzen (String param) {
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
//    }


    //Ersetze jedes Freisebad durch ___ und gib den Text aus
//    private static void ZeichenTausch(String param) {
//        System.out.println();
//        String fixedInput = param.replaceAll("Freisebad", "_________");
//        System.out.println(fixedInput);
//        System.out.println();
//    }


    //Ersetze jedes ist, und oder durch ___ und gib den Text aus
//    private static void ZeichenTausch2(String param) {
//        System.out.println();
//        String fixedInput1 = param.replaceAll("ist|und|oder", "___");
//        System.out.println(fixedInput1);
//        System.out.println();
//    }


    //Gibt alle Zeichen aus und ihre Häufigkeit
//    private static void KeyMap(String param) {
//        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
//        System.out.println("Gezählte Zeichen: ");
//        for (int i = 0; i < param.length(); i++) {
//            Character key = param.toLowerCase().charAt(i);
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
//    }


    //Zählt alle Buchstaben des Alphabet und gibt deren Menge aus
    private static void alphabet(String param) {
        String neuer = param.toLowerCase();
        char[] character = neuer.toCharArray();
        int[] counter = new int[26];
        System.out.println("Gezählte Buchstaben im Array: ");
        for (int i = 0; i < character.length; i++) {
            char myChar = character[i];
            int indexOfCounter = myChar - 97;
            if (indexOfCounter >= 0 && indexOfCounter < counter.length) {
                counter[indexOfCounter]++;
            }
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.print(("[" + (char) (i + 97)) + "]" + " = " + counter[i] + ", ");
            }
        }
    }

}

