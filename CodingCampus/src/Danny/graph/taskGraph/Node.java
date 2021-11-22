package Danny.graph.taskGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    int xCoordinateImage;
    int yCoordinateImage;
    Map<Node, Double> neighborsMap = new HashMap<Node, Double>();
    List<Neighbor> neighborsList = new LinkedList<>();


    public Node(int x, int y) {
        setxCoordinateImage(x);
        setyCoordinateImage(y);
    }

    public void createNeighborsList(int x, int y) {

        neighborsList.add(new Neighbor(x - 1, y - 1, 1.5, "Links Oben"));       // 1 Nachbarn Links Oben
        neighborsList.add(new Neighbor(x, y - 1, 1, "Oben"));                      // 2 Nachbarn  Oben
        neighborsList.add(new Neighbor(x + 1, y - 1, 1.5, "Rechts Oben"));      // 3 Nachbarn Rechts Oben
        neighborsList.add(new Neighbor(x - 1, y, 1, "Links"));                     // 4 Nachbarn Links
        neighborsList.add(new Neighbor(x + 1, y, 1, "Rechts"));                    // 5 Nachbarn Rechts
        neighborsList.add(new Neighbor(x - 1, y + 1, 1.5, "Links Unten"));      // 6 Nachbarn Links Unten
        neighborsList.add(new Neighbor(x, y + 1, 1, "Unten"));                     // 7 Nachbarn Unten
        neighborsList.add(new Neighbor(x + 1, y + 1, 1.5, "Rechts Unten"));     // 8 Nachbarn Rechts Unten

    }


    public List<Neighbor> getNeighborsList() {
        return this.neighborsList;
    }

    public void setxCoordinateImage(int xCoordinateImage) {
        this.xCoordinateImage = xCoordinateImage;
    }

    public void setyCoordinateImage(int yCoordinateImage) {
        this.yCoordinateImage = yCoordinateImage;
    }

    public int getxCoordinateImage() {
        return xCoordinateImage;
    }

    public void setNeighborsList(List<Neighbor> neighborsList) {
        this.neighborsList = neighborsList;
    }

    public int getyCoordinateImage() {
        return yCoordinateImage;
    }

    public Map<Node, Double> getNeighborsMap() {
        return neighborsMap;
    }

    public void putNeighborsMap(Node node,double distance) {
        this.neighborsMap.put(node,distance);
    }
}
