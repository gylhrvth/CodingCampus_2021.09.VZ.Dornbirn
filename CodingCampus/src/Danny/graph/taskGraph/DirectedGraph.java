//package Danny.graph.taskGraph;
//
//import java.util.*;
//
//public class DirectedGraph {
//
//    private Map<Integer,Node> nodeMap = new HashMap<Integer,Node>();
//    private List<Node> nodeList = new LinkedList<>();
//    private int count = 0;
//
//    private List<Node> adjazenzMatrix= new LinkedList<>();
//
//    public DirectedGraph(Node[][] nodeMatrix) {
////        fillNodeMap(nodeMatrix);
////        fillAdjazenzList();
//        fillNodeList(nodeMatrix);
//    }
//
//
////    public void fillAdjazenzList() {
//////        adjazenzMatrix = new int[200][200];
////
////
////        for (Map.Entry<Node, Integer> entryNode : nodeMap.entrySet()) {
////            for (Map.Entry<Node, Double> entryNeighbor : entryNode.getKey().neighborsMap.entrySet()) {
////
////                System.out.println(nodeMap.get(entryNeighbor.getKey()));
////
////
//////                adjazenzMatrix[entryNode.getValue()][[nodeMap.get(entryNeighbor.getKey())] = 0;
////
////            }
////
////        }
////
////
////    }
//
//    public void fillNodeList(Node[][] nodeMatrix) {
//
//        for (int i = 0; i < nodeMatrix.length; i++) {
//            for (int j = 0; j < nodeMatrix[i].length; j++) {
//                if (nodeMatrix[i][j] != null) {
//                    nodeList.add(nodeMatrix[i][j]);
//
//                }
//            }
//        }
//        System.out.println(nodeList.get(2));
//    }
//
//
////
////    public void fillNodeMap(Node[][] nodeMatrix) {
////
////        for (int i = 0; i < nodeMatrix.length; i++) {
////            for (int j = 0; j < nodeMatrix[i].length; j++) {
////                if (nodeMatrix[i][j] != null) {
////                    nodeMap.put(nodeMatrix[i][j], count);
////                    count++;
////                }
////            }
////        }
////
////    }
//
//
//}
