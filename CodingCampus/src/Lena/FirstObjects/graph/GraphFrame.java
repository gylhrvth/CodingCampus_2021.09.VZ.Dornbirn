package Lena.FirstObjects.graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class GraphFrame extends JFrame {

    /**
     * TODO choose size depending on graph image
     * @param graph
     */
    public GraphFrame(Graph graph) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graph");
        GraphPanel panel = new GraphPanel(graph);
        panel.setPreferredSize(new Dimension(700, 700));
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
