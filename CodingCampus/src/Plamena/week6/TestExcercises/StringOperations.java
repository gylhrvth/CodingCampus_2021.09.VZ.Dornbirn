package Plamena.week6.TestExcercises;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unused")
    private static String splitAndSort(String text) {
        StringBuilder sb = new StringBuilder();

        text = text.replaceAll("!", " ");
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - i; j++) {
                if (j > 0 && words[j].compareTo(words[j - 1]) < 0) {
                    String tmp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = tmp;
                }
            }
        }

        for (String word : words) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    @SuppressWarnings("unused")
    private static String wordsSplit(String text, String split) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(split);
        for (String word : words) {
            sb.append(word).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @SuppressWarnings("unused")
    private static void replaceChars(String text) {

        Scanner sc = new Scanner(System.in);

        System.out.println(text);
        System.out.println("Which character(s) do you want to replace?");
        String input = sc.nextLine();

        System.out.println("Enter replacement: ");
        String replacement = sc.nextLine();

//        if (input.matches("[a-z]")) {
//            text = text.replaceAll("[a-z]", replacement);
//        }
//        if (input.matches("[A-Z]")){
//            text = text.replaceAll("[A-Z]", replacement);
//        }
//        if (input.matches("\\s")){
//            text = text.replaceAll("\\s",replacement);
//        }
//        if (input.matches("!")){
//            text = text.replaceAll("!", replacement);
//        }

        text = text.replaceAll(input, replacement);
        System.out.println(text);
    }

    @SuppressWarnings("unused")
    private static void replaceWords() {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";

        text = text.replaceAll("wird", "war und ist");
        System.out.println(text);
    }

    @SuppressWarnings("unused")
    private static void regex() {
        String regexMail = "[a-zA-Z]+" + "[a-zA-Z0-9]+" + "(\\.*[a-zA-Z0-9]*)" +
                "@" + "[a-z0-9]+" + "(\\.[a-zA-Z])*" + "\\." + "[A-Za-z]{2,}";
        System.out.println("alfons@drlue.at " + "alfons@drlue.at".matches(regexMail));
        System.out.println("rambina.alfons@drlue.at " + "rambina.alfons@drlue.at".matches(regexMail));
        System.out.println("rambina1.1alfons@drlue.at " + "rambina1.1alfons@drlue.at".matches(regexMail));
        System.out.println("1rambina1.alfons@drlue.at " + "1rambina1.alfons@drlue.at".matches(regexMail));
        System.out.println("@drlue.at " + "@drlue.at".matches(regexMail));
        System.out.println("drlue.at " + "drlue.at".matches(regexMail));
        System.out.println("asdf@drlue " + "asdf@drlue".matches(regexMail));
        System.out.println("asdf@microsoft.c " + "asdf@microsoft.c".matches(regexMail));

    }
}
