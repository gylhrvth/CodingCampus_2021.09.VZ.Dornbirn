package Lena.FirstObjects.graph.ui;

import Lena.FirstObjects.graph.businessLogic.Dijkstra;
import Lena.FirstObjects.graph.businessLogic.Graph;
import Lena.FirstObjects.graph.businessLogic.Node;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.List;


public class GraphPanel extends JPanel {

    public Graph graph;
    public List<Node> fastestPath;
    private Node start;
    private Node end;
    private BufferedImage bufferedImage;


    public GraphPanel(Graph graph, int width, int heigth) {
        this.graph = graph;
        this.bufferedImage = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_BGR);
        Graphics2D g = (Graphics2D) bufferedImage.getGraphics();
        paint(g);

    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public List<Node> getFastestPath() {
        return fastestPath;
    }


    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public void findFastestWayAndDisplay() {
        new Thread(() -> {
            System.out.println(graph + "--" + start + "--" + end);
            List<Node> path = Dijkstra.findBestWay(() -> {
                try {
                    Thread.sleep(1);
                } catch (Exception exc) {
                    //noop
                }
            }, this.graph, this.start, this.end);
            setFastestPath(path);
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(10);
                } catch (Exception exc) {
                    //noop
                }
                SwingUtilities.invokeLater(this::repaint);
            }
        }).start();
    }

    public void setFastestPath(List<Node> fastestPath) {
        this.fastestPath = fastestPath;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        /**
         * TODO Optimize with buffered image
         */
        double timeStart = System.currentTimeMillis();

        for (Node n : graph.getNodeList()) {
            g.setColor(n.getDistance() != Integer.MAX_VALUE ? Color.BLUE : n.getWeight() == 1 ? Color.YELLOW : Color.BLACK);
            g.drawRect(n.getX(), n.getY(), 1, 1);
        }
        if (this.fastestPath != null) {
            g.setColor(Color.RED);
            for (Node n : fastestPath) {
                g.drawRect(n.getX(), n.getY(), 1, 1);
            }
        }

        double timeEnd = System.currentTimeMillis();

        //   System.out.println("Time to print:" + (timeEnd - timeStart) / 1000 + "ms");

    }

    public void buildImage() {


    }


}
