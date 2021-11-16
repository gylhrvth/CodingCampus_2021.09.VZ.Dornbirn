package Stefan.Week6;

import java.lang.StringBuilder;

public class UebungenVonLukasStringManipulation {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";

//        text = text.replaceAll("wird", "war und ist");
//        text = text.replaceAll("[a-z]", " ");
//        text = text.replaceAll("[A-Z]", " ");
//        text = text.replaceAll(" ", "");
//        text = text.replaceAll("!", " ");
//        System.out.println(text);


        String zahlen = "749813247132984712039487123049871204398712039487";

//        zahlen = zahlen.replaceAll("[0-9]", " ");
//        zahlen = zahlen.replaceAll("[1-9]", " ");
//        zahlen = zahlen.replaceAll("[2-4]", " ");
//        zahlen = zahlen.replaceAll("[1-3]|[6-9]", " ");
//        System.out.println(zahlen);

        String textSplit = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        wordSplit(textSplit, "Tag");
    }

    public static void wordSplit(String textSplit, String split) {
        String[] words = textSplit.split(split);
        StringBuilder text1 = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            text1.append(words[i]).append(System.lineSeparator());

        }
        String ausgabe = text1.toString();
        System.out.println(ausgabe);
    }
}
