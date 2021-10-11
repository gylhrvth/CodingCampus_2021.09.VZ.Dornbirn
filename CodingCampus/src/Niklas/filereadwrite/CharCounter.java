package Niklas.filereadwrite;

public class CharCounter {

    public static void countChars(String text) {
        int[] counter = new int[127];
        char[] characters = text.toCharArray();
        for(int i = 0; i < characters.length; i++) {
            System.out.println((int)characters[i]);
            int positionOfCharacterInAscii = characters[i];
            if(positionOfCharacterInAscii <= 127) {
                counter[positionOfCharacterInAscii]++;
            }
        }

        for(int i = 0; i < counter.length; i++) {
            System.out.println((char)i + ": " + counter[i]);
        }

    }
}
