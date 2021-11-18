package Lena.FirstObjects.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<Node> nodeList = new ArrayList<>();

    public void fillNodeList(Node[][] nodeMatrix) {
        for (Node[] matrix : nodeMatrix) {
            for (Node node : matrix) {
                if (node != null) {
                    this.nodeList.add(node);
                }
            }
        }
    }

    public List<Node> getNodeList() {
        return this.nodeList;
    }

    public Node findNode(int x, int y) {
        for (Node n : nodeList) {
            if (n.getxKoordinate() == x && n.getyKoordinate() == y) {
                return n;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Graph " + this.nodeList.size();
    }
}
