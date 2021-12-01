package Lena.FirstObjects.graph.businessLogic;

import java.util.ArrayList;
import java.util.List;

public class Dijkstra {

    public interface OnNodeInteractionListener {
        void onCalculation();
    }

    public static List<Node> findBestWay(OnNodeInteractionListener listener, Graph graph, Node start, Node end) {
        long timeStart = System.currentTimeMillis();
        int count =0;

        for (Node n : graph.getNodeList()) {
            n.setDistance(Integer.MAX_VALUE);
            n.setPreNode(null);
        }

        start.setDistance(0);

        List<Node> q = new ArrayList<>();
        q.add(start);
        Node actualNode = start;

        while (actualNode != end) {
            Node newNodeWithLowestDistance = q.get(0);
            for (Node node : q) {
                if (node.getDistance() < newNodeWithLowestDistance.getDistance()) {
                    newNodeWithLowestDistance = node;
                }
            }
            actualNode = newNodeWithLowestDistance;
            q.remove(newNodeWithLowestDistance);
            if(count++==10) {
                listener.onCalculation();
                count=0;
            }

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

        long timeEnd = System.currentTimeMillis();

        System.out.println("Time to find best Way:  "+(timeEnd-timeStart)+"ms");
        return shortestPath;

    }


}
