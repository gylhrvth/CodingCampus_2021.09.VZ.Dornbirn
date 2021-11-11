package Bartosz.oldStuff.week3.arrays;

public class CountingArrayUnit {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor siniti 69402";

        int[] counter = new int[127];   // position der ASCII Charaktere in Array
        char[] characters = text.toCharArray();

        for (char character : characters) {
            System.out.println((int) character);
            int positionOfCharacterInAscii = character;
            if (positionOfCharacterInAscii <= 127) {
                counter[positionOfCharacterInAscii]++;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if(counter[i] > 0) {    // Wenn Char vorhanden dann gib aus
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }
}
