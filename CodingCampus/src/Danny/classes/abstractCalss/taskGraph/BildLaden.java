package Danny.classes.abstractCalss.taskGraph;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class BildLaden extends JFrame {

    public BildLaden() {
        JLabel label = new JLabel(showImg());
        JPanel panel = new JPanel();
        panel.add(label);
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bild laden bei Swing");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private ImageIcon showImg() {
        BufferedImage img = null;
        try {
            img = ImageIO.read(getClass().getResource("assets/labyrinth/Labyrinth.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert img != null;
        return new ImageIcon(img);
    }

    public static void main(String[] args) {
        new BildLaden();


    }


}

