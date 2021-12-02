package Danny.string;

public class CharCounterNiklasItsRight {


    public static void main(String[] args) {


        String text = "das das";
        countChars(text);
    }

    public static void countChars(String text) {
        int[] counter = new int[127];
        char[] characters = text.toCharArray();
        for (int i = 0; i < characters.length; i++) {

            int positionOfCharacterInAscii = characters[i];
            if (positionOfCharacterInAscii <= 127) {
                counter[positionOfCharacterInAscii]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            System.out.println((char) i + ": " + counter[i]);
        }

    }
}

