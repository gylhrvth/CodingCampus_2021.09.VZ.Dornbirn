package Stefan.WeekFive;

import java.util.Scanner;

public class allVocals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie einen Satz ein: ");
        String input1 = input.nextLine();
        System.out.println("In der Eingabe sind gesamt: " + count_Vowels(input1) + " Vokale vorhanden!");
    }

    public static int count_Vowels(String input1)
    {
        int count = 0;
        for (int i = 0; i < input1.length(); i++)
        {
            if (input1.charAt(i) == 'a' || input1.charAt(i) == 'e' || input1.charAt(i) == 'i'
                    || input1.charAt(i) == 'o' || input1.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
