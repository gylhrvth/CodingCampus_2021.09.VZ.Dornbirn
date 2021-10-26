package Bartosz.week6.gameOfLifeGUI;


import javax.swing.*;

public class Gui {
    JFrame jf;

    public static final int WIDTH = 512, HEIGHT = 512, XOFF = 10, YOFF = 10;

    public void create() {
        jf = new JFrame("Game of Life");                   // Erstelle neues Fenster mit Titel
        jf.setSize(550, 570);                       // Erstelle Fenster mit Breite x Höhe (px)
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // Exit beim Drücken auf X
        jf.setLocationRelativeTo(null);                         // Wiedergabe auf Hauptbildschirm Mitte
        jf.setResizable(false);                                 // Ändern von Fenstergröße nicht gestattet.
    }

}
