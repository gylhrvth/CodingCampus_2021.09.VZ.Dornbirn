package Sandro.test;

import javax.swing.*;

public class nullPointerException {

    public static void main(String[] args) {


        // javax.swing. markieren -> show context actions anklicken.
        // -> introduce local variable anklicken
        // dann kann eine Variable deklariert werden

        // shopwInputDialog = Rückgabe = 0, wenn Input abgebrochen wird (steht nicht
        // in der API

        String input = JOptionPane.showInputDialog("Text Eingabe");

        checkNull(input);
    }

    public static void checkNull(String input) {

        if (input != null) {
            System.out.println(input.length());
        } else
            System.out.println("input == null");
    }
}
