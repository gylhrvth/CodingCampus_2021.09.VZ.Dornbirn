package Stefan.Week3;

import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        Scanner schulnoten = new Scanner(System.in);
        int textEingabe = 0;

        System.out.println("Gib einen Wurf zwischen 1 - 9 ein:");
        textEingabe = schulnoten.nextInt();



        switch (textEingabe) {
            case 1:
            case 2:
            case 3:
                System.out.println("okay");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("guter Wurf");
                break;
            case 7:
            case 8:
                System.out.println("sehr guter Wurf");
                break;
            case 9:
                System.out.println("perfekt");
                break;


        }

    }
}
