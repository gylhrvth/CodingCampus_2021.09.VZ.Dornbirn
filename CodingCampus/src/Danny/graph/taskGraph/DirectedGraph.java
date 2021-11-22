package Danny.graph.taskGraph;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraph {

    private List<Node> nodeList = new ArrayList<>();
    private int[][] adjazenzMatrix;

    public DirectedGraph(Node[][] nodeMatrix) {
        fillNodeList(nodeMatrix);

    }


    public void fillAdjazenzMatrix(Node node){


    }

    public void fillNodeList(Node[][] nodeMatrix) {

        for (int i = 0; i < nodeMatrix.length; i++) {
            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {
                    nodeList.add(nodeMatrix[i][j]);
                }
            }
        }
        System.out.println(nodeList);


    }


}
