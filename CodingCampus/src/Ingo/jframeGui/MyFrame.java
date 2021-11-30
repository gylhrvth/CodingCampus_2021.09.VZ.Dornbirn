package Ingo.jframeGui;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class MyFrame extends JFrame{

    MyFrame() {

        this.setSize(420,420);
        this.setTitle("JFrame coding by Ingo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit out of app, schließt bei X-gedrückt !!
        this.setVisible(true);

        ImageIcon image = new ImageIcon();  // Icon neben Title links oben  !!
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(144,72,104));  // Color background, Farbe von 0 = bis 255 !!

    }


}
