package Danny.graph.taskGraph;


import java.awt.*;
import java.io.IOException;

class GraphMain {

    // current = aktuell
    private static Node currentNode;
    private static Object Node;


    public static void main(String[] args) throws IOException {
//        String path = "assets/labyrinth/Labyrinth.png";
//        File file = new File(path);
//        BufferedImage image = ImageIO.read(file);
        Labyrinth labyrinth = new Labyrinth("assets/labyrinth/Labyrinth.png");
        Node[][] nodeMatrix = createNodeMatrix(labyrinth);
//        System.out.println(Arrays.deepToString(nodeMatrix));
        checkForNeighbors(nodeMatrix);
        DirectedGraph graph = new DirectedGraph(nodeMatrix);

    }


    public static void checkForNeighbors(Node[][] nodeMatrix) {
        for (int i = 0; i < nodeMatrix.length; i++) {
            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {
                    nodeMatrix[i][j].createNeighborsList(j, i);
                    for (Neighbor neighbor : nodeMatrix[i][j].neighborsList) {
                        if (neighbor.getyCoordinateImage() >= 0 && neighbor.getyCoordinateImage() < nodeMatrix.length
                                && neighbor.getxCoordinateImage() >= 0 && neighbor.getxCoordinateImage() < nodeMatrix[i].length) {
                            if (nodeMatrix[neighbor.getyCoordinateImage()][neighbor.getxCoordinateImage()] != null)
                                nodeMatrix[i][j].putNeighborsMap(nodeMatrix[neighbor.getyCoordinateImage()][neighbor.getxCoordinateImage()],neighbor.getDistance());
                        }
                    }

//                    System.out.println(nodeMatrix[i][j].getxCoordinateImage());
//                    System.out.println(nodeMatrix[i][j].getyCoordinateImage());
//                    System.out.println();
//                    for (Map.Entry<Node,Double> entry : nodeMatrix[i][j].neighborsMap.entrySet()) {
//                        System.out.println(entry.getKey().getxCoordinateImage());
//                        System.out.println(entry.getKey().getyCoordinateImage());
//                        System.out.println(entry.getValue());


                }

            }
        }


    }

    public static Node[][] createNodeMatrix(Labyrinth labyrinth) {
        Node[][] nodeMatrix = new Node[labyrinth.getImage().getHeight()][labyrinth.getImage().getWidth()];
        for (int y = 0; y < labyrinth.getImage().getHeight(); y++) {
            for (int x = 0; x < labyrinth.getImage().getWidth(); x++) {
                if (labyrinth.getImage().getRGB(x, y) == Color.BLACK.getRGB())
                    nodeMatrix[y][x] = new Node(x, y);
            }
        }
        return nodeMatrix;
    }


}
