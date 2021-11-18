package Lena.FirstObjects.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {


    private List<Node> nodeList = new ArrayList<>();

    public Graph() {

    }

    public void fillNodeList(Node[][] nodeMatrix) {
        for (int i = 0; i < nodeMatrix.length; i++) {
            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {
                    this.nodeList.add(nodeMatrix[i][j]);
                }
            }
        }
    }

    public List<Node>getNodeList(){
        return this.nodeList;
    }

    public Node findNode(int xKoord, int yKoord){
        for (Node n: nodeList){
            if(n.getxKoordinate()==xKoord && n.getyKoordinate()==yKoord){
                return n;
            }
        }
        return null;
    }


    @Override
    public String toString() {

        return "Graph "+this.nodeList.size();
    }
}
