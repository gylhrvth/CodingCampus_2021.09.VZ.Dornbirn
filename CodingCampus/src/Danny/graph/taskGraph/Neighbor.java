package Danny.graph.taskGraph;

public class Neighbor extends Node{

    double distance;
    String name;

    public Neighbor(int x, int y,double distance,String name) {
        super(x, y);
        this.distance = distance;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
