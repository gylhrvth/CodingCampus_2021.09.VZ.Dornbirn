package Lena.FirstObjects.graph;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {


    public static List<Node> findBestWay(Graph graph, Node start, Node end) {
        for (Node n : graph.getNodeList()) {
            n.setDistance(Integer.MAX_VALUE);
            n.setPreNode(null);
        }

        start.setDistance(0);

        List<Node> q = new ArrayList<>();
        q.add(start);
        Node actualNode = start;

        while (actualNode != end) {
            Node newAct = q.get(0);
            for (Node node : q) {
                if (node.getDistance() < newAct.getDistance()) {
                    newAct = node;
                }
            }
            actualNode = newAct;
            q.remove(newAct);
            for (Node neighbour : actualNode.getNeighbours()) {
                if (neighbour.getDistance() == Integer.MAX_VALUE) {
                    double newDistance = actualNode.getDistance() + actualNode.getDistanceOfNeighbour(neighbour);
                    if (newDistance < neighbour.getDistance()) {
                        neighbour.setDistance(newDistance);
                        neighbour.setPreNode(actualNode);
                        q.add(neighbour);
                    }
                }
            }
        }

        List<Node> shortestPath = new ArrayList<>();
        Node next = end;
        while (next != start && next != null) {
            shortestPath.add(next);
            next = next.getPreNode();

        }

        System.out.println("Returned path");
        return shortestPath;

    }
}
