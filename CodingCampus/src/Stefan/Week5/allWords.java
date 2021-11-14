package Stefan.Week5;

import java.util.Scanner;

public class allWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie einen Satz ein: ");
        String textInput = input.nextLine();

        System.out.println(words(textInput));
    }

    public static int words (String textInput) {
        int counter = 0;

        String[] words = textInput.split(" ");
        for (int counter1 = 0; counter1 < words.length; counter1++) {
            counter++;
        }

        return counter;
    }

}
