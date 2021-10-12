package Sandro.Programme;

import javax.swing.*;

public class CurrencyCalculator {
    public static void main(String[] args) {
        String eingabe;
        double ergebnis;
        double euro;

        eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betrag in Euro ein: \n");

        euro = Double.parseDouble(eingabe);
        ergebnis = euro * 1.1566; //kurs vom 12.10.2021
        JOptionPane.showMessageDialog(null,"Die Summe ergibt genau: " + ergebnis + " Dollar");
    }



}


