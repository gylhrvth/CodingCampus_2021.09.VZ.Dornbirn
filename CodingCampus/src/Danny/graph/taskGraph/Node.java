package Danny.graph.taskGraph;

import java.util.LinkedList;
import java.util.List;

public class Node {
    int xCooordinateImage;
    int yCoordinateImage;

    List<Neighbor> neighborsList = new LinkedList<>();


    public Node(int x, int y) {
        setxCooordinateImage(x);
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
        return neighborsList;
    }

    public void setxCooordinateImage(int xCooordinateImage) {
        this.xCooordinateImage = xCooordinateImage;
    }

    public void setyCoordinateImage(int yCoordinateImage) {
        this.yCoordinateImage = yCoordinateImage;
    }

    public int getxCooordinateImage() {
        return xCooordinateImage;
    }

    public void setNeighborsList(List<Neighbor> neighborsList) {
        this.neighborsList = neighborsList;
    }

    public int getyCoordinateImage() {
        return yCoordinateImage;
    }
}
