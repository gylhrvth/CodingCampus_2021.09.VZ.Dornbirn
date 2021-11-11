package Bartosz.oldStuff.week6.gameOfLifeGUI;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;        // Antialiasing aus
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);

        g.setColor(Color.RED);
    }
}
