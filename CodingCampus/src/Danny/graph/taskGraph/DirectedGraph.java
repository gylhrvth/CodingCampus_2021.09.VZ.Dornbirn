package Danny.graph.taskGraph;

import java.util.HashMap;
import java.util.Map;

public class DirectedGraph {

    private Map<Node, Integer> nodeMap = new HashMap<Node, Integer>();
    private int count = 0;

    private int[][] adjazenzMatrix;

    public DirectedGraph(Node[][] nodeMatrix) {
        fillNodeMap(nodeMatrix);
fillAdjazenzMatrix();
    }


    public void fillAdjazenzMatrix() {
        adjazenzMatrix = new int[20000][20000];


        for (Map.Entry<Node,Integer> entryNode : nodeMap.entrySet()) {
            for (Map.Entry<Node,Double> entryNeighbor : entryNode.getKey().neighborsMap.entrySet()) {

                System.out.println(nodeMap.get(entryNeighbor.getKey()));




//                adjazenzMatrix[entryNode.getValue()][[nodeMap.get(entryNeighbor.getKey())] = 0;

            }

        }


    }

    public void fillNodeMap(Node[][] nodeMatrix) {

        for (int i = 0; i < nodeMatrix.length; i++) {
            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {
                    nodeMap.put(nodeMatrix[i][j], count);
                    count++;
                }
            }
        }

    }


}
