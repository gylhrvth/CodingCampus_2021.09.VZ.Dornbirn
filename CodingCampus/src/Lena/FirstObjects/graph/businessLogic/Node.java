package Lena.FirstObjects.graph.businessLogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Node {

    private int y;
    private int x;
    private int weight;
    private final Map<Node, Double> neighbours = new HashMap<>();
    private double distance=Integer.MAX_VALUE;
    private Node preNode = null;


    public Node(int xKoordinate, int yKoordinate, int weight) {
        setX(xKoordinate);
        setY(yKoordinate);
        setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Node getPreNode() {
        return preNode;
    }

    public void setPreNode(Node preNode) {
        this.preNode = preNode;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Set<Node> getNeighbours() {
        return this.neighbours.keySet();
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistanceOfNeighbour(Node node) {
        return neighbours.get(node);
    }

    public void addNeighbour(Node node, double distance) {
        if(!neighbours.containsKey(node)) {
            this.neighbours.put(node, distance);
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "yKoordinate=" + y +
                ", xKoordinate=" + x;

    }
}
