package Mahir.Week5;

public class Day2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Niklas\\filereadwrite\\1342-0.txt";

        String result = Day1FileReader.FileReader.readFile(path);
        System.out.println(result);
/*
        System.out.println("reverse text");
        reverseText(result);
        System.out.println();

        System.out.println("reverse words");
        reverseWords(result);
        System.out.println();

        System.out.println("reverse all words and text");
        reverseWordsAndText(result);
        System.out.println();
*/
        System.out.println("reverse lines");
        reverseLines(result);


    }

    private static void reverseLines(String txt) {
        String[] splitText = txt.split("\\n");
        String tmp = "";
        for (int i = splitText.length - 1; i <= 0; i++) {
            tmp += splitText[i];

        }
        System.out.println(tmp);
    }

    private static void reverseWords(String txt) {
        String[] splitTxt = txt.split(" ");
        String tmp = "";
        for (int i = 0; i < splitTxt.length; i++) {
            char[] reverse = splitTxt[i].toCharArray();
            for (int j = reverse.length - 1; j >= 0; j--) {
                tmp += reverse[j];
            }
            tmp += " ";
        }
        System.out.println(tmp);

    }

    private static void reverseText(String txt) {
        String[] text = txt.split(" ");
        String tmp = "";
        for (int i = text.length - 1; i >= 0; i--) {
            tmp += text[i] + " ";

        }
        System.out.println(tmp);


    }

    private static void reverseWordsAndText(String txt) {

        String temp = "";
        char[] reverseText = txt.toCharArray();
        for (int i = reverseText.length - 1; i > 0; i--) {
            temp += reverseText[i];

        }
        System.out.println(temp);

    }

}
