package Lena.FirstObjects.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Node {

    private int yKoordinate;
    private int xKoordinate;
    private HashMap<Node, Double> neighbours = new HashMap<>();
    private double distance;
    private Node preNode=null;


    public Node(int xKoordinate, int yKoordinate){
        setxKoordinate(xKoordinate);
        setyKoordinate(yKoordinate);
    }

    public Node getPreNode() {
        return preNode;
    }

    public void setPreNode(Node preNode) {
        this.preNode = preNode;
    }

    public int getyKoordinate() {
        return yKoordinate;
    }

    public void setyKoordinate(int yKoordinate) {
        this.yKoordinate = yKoordinate;
    }

    public int getxKoordinate() {
        return xKoordinate;
    }

    public void setxKoordinate(int xKoordinate) {
        this.xKoordinate = xKoordinate;
    }

    public Set<Node> getNeighbours(){
        return this.neighbours.keySet();
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistanceOfNeighbour(Node node){
        return neighbours.get(node);
    }

    public void addNeighbour(Node node, double distance){
        boolean alreadyANeighbour=false;
        for (Node node1: neighbours.keySet()) {
            if(node1==node){
                alreadyANeighbour=true;
                break;
            }
        }
        if(!alreadyANeighbour) {
            this.neighbours.put(node, distance);
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "yKoordinate=" + yKoordinate +
                ", xKoordinate=" + xKoordinate ;

    }
}
