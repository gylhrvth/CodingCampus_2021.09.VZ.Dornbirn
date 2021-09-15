package Danny.Woche1;

import com.sun.source.tree.IfTree;

public class Tannenbaum {
    public static void main(String[] args) {


        int counter = 1;
        int spaces = 10;
        for (int h = 0; h <= 10; h++) {

            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y < counter; y++) {
                System.out.print("X");

            }
            System.out.println();
            counter += 2;
            spaces--;
        }
    }

}

