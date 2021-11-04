package Mahir.ferienAufgaben;

import javax.swing.*;
import java.awt.*;

public class TestJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        JColorChooser jcolor = new JColorChooser();
        JFileChooser choser = new JFileChooser();

        frame.setSize(500,500);


//        frame.getContentPane().add(jcolor);
//        frame.add(new JLabel("Test"));
        frame.setVisible(true);



    }
}
