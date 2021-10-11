package Stefan.WeekFive;

import java.util.Scanner;

public class mittlereZeichen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie eine zeichenfolge ein: ");
        String input1 = input.nextLine();
        System.out.println("Das mittlere Zeichen der Eingabe ist: " + center(input1));
    }

    public static String center (String input1) {
        int position;
        int length;
        if (input1.length() % 2 == 0)
        {
            position = input1.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = input1.length() / 2;
            length = 1;
        }
        return input1.substring(position, position + length);
    }
}
