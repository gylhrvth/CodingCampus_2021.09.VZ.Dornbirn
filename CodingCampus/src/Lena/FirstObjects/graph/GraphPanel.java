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
            public void mouseClicked(MouseEvent e) {

                Node node = graph.findNode(e.getX(), e.getY());
                if(node==null){
                    JOptionPane.showMessageDialog(GraphPanel.this, "Das war kein Punkt auf der Straße");
                }else {
                    if (mousePressed == 0) {
                        start = node;
                        mousePressed = 1;


                    } else if (mousePressed == 1) {
                        end = node;
                        mousePressed = 0;

                        findFastestWayAndDisplay();
                    }
                }
            }
        });


    }

    public void findFastestWayAndDisplay() {
        new Thread(() -> {
            System.out.println(graph + "--" + start + "--" + end);
            List<Node> path = Dijkstra.findBestWay(() -> {

            }, this.graph, this.start, this.end);
            setFastestPath(path);
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(100);
                } catch (Exception exc) {
                    //noop
                }
                SwingUtilities.invokeLater(this::repaint);
            }
        }).start();
    }

    public void setFastestPath(List<Node> fastestPath) {
        System.out.println("Setting path...");
        this.fastestPath = fastestPath;
    }


    @Override
    public void paint(Graphics g) {
        System.out.println("Painted...");
        super.paint(g);

        /**
         * TODO Optimize with buffered image
         */
        for (Node n : graph.getNodeList()) {
            g.setColor(n.getDistance() != Integer.MAX_VALUE ? Color.BLACK : Color.BLUE);
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
