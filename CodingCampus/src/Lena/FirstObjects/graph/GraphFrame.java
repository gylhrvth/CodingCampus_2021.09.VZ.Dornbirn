package Lena.FirstObjects.graph;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class GraphFrame extends JFrame {

    public GraphPanel panel;
    private Graph graph;



    public GraphFrame(Graph graph) {
        this.graph = graph;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graph");
        this.setSize(700, 700);
        this.setVisible(true);

        this.panel = new GraphPanel(this.graph);
        this.add(panel);

    }








}
