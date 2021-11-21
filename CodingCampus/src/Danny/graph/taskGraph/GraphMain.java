package Danny.graph.taskGraph;


import java.awt.*;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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


    }

    public static void checkForNeighbors(Node[][] nodeMatrix) {
        for (int i = 0; i < nodeMatrix.length; i++) {
            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {
                    currentNode = new Node(j, i);
                    currentNode.createNeighborsList(j,i);
                    List<Neighbor> tmp = new LinkedList<>();
                    for (Neighbor neighbor : currentNode.neighborsList) {
                        if (nodeMatrix[neighbor.getyCoordinateImage()][neighbor.getxCooordinateImage()] != null){
                            tmp.add(neighbor);
//                            System.out.println(neighbor.getName());
                        }
                    }



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
