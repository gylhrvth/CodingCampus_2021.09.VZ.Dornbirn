package Lena.FirstObjects.graph.ui;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.io.File;

public class InfoPanel extends JPanel {

    private JLabel startedKlicked;
    private JLabel endKlicked;

    public InfoPanel(int width, int height) {
        this.setLayout(new GridLayout(2, 1));

        JPanel coordinatePanel = new JPanel();
        GridLayout gridLayout = new GridLayout(0,1, 30,0);
        coordinatePanel.setLayout(gridLayout);
        coordinatePanel.setPreferredSize(new Dimension(width, 10));
        this.add(coordinatePanel);

        JLabel header = new JLabel();
        header.setText("You have klicked:");
        coordinatePanel.add(header);


        this.startedKlicked = new JLabel();
        startedKlicked.setText("Start X/Y-Coordinate:");
        coordinatePanel.add(startedKlicked);


        this.endKlicked = new JLabel();
        endKlicked.setText("End X/Y-Coordinate:");
        coordinatePanel.add(endKlicked);


        JPanel docChooser = new JPanel();
        this.add(docChooser);

        JLabel headerFileChooser = new JLabel();
        headerFileChooser.setText("Choose your Roadmap:");
        docChooser.add(headerFileChooser);


        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setPreferredSize(new Dimension(width, height));

        fileChooser.setCurrentDirectory(new File("CodingCampus/src/Lena/FirstObjects/graph/source/Roadmap.png"));
        docChooser.add(fileChooser);

    }

    public JLabel getStartedKlicked() {
        return startedKlicked;
    }

    public void setStartedKlicked(JLabel startedKlicked) {
        this.startedKlicked = startedKlicked;
    }

    public JLabel getEndKlicked() {
        return endKlicked;
    }

    public void setEndKlicked(JLabel endKlicked) {
        this.endKlicked = endKlicked;
    }
}
