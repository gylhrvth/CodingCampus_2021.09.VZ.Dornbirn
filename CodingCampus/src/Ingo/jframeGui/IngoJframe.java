package Ingo.jframeGui;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class IngoJframe {

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setTitle("JFrame coding by Ingo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit out of app, schließt bei X-gedrückt !!
        frame.setVisible(true);

        ImageIcon image = new ImageIcon();  // Icon neben Title links oben  !!
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(144,72,104));  // Color background, Farbe von 0 = bis 255 !!

        MyFrame myFrame = new MyFrame();



    }

}
