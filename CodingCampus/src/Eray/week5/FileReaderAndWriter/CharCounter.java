package Eray.week5.FileReaderAndWriter;

public class CharCounter {

    public static void countChars(String text) {
        int[] counter = new int[127];
        char[] charakters = text.toCharArray();

        for (int i = 0; i < charakters.length; i++) {

            int positionOfCharacterInAscii = charakters[i];
            if (positionOfCharacterInAscii <= 127) {
                counter[positionOfCharacterInAscii]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println((char) i + ": " + counter[i]);
        }
    }
}
