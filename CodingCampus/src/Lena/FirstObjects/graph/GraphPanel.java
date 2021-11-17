package Lena.FirstObjects.graph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;


public class GraphPanel extends JPanel {

    public Graph graph;
    public List<Node> fastestPath;
    private int mousePressed = 0;
    private Node start;
    private Node end;


    public GraphPanel(Graph graph) {
        this.graph = graph;

            this.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e)  {
                    if (mousePressed == 0) {

                        start = graph.findNode(e.getX(), e.getY());

                        mousePressed = 1;

                    } else if (mousePressed == 1) {
                        end = graph.findNode(e.getX(), e.getY());
                        mousePressed = 0;

                        findFastestWayAndDisplay();
                    }
                }
            });


    }

    public void findFastestWayAndDisplay() {
        System.out.println(graph + "--" + start + "--" + end);
        List<Node> path = Dijkstra.findBestWay(this.graph, this.start, this.end);
        setFastestPath(path);
    }


    public void setFastestPath(List<Node> fastestPath) {
        this.fastestPath = fastestPath;
        this.repaint();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        for (Node n : graph.getNodeList()) {
            g.drawRect(n.getxKoordinate(), n.getyKoordinate(), 1, 1);
        }
        if (this.fastestPath != null) {
            g.setColor(Color.RED);
            for (Node n : fastestPath) {
                g.drawRect(n.getxKoordinate(), n.getyKoordinate(), 1, 1);
            }
        }

    }


}
