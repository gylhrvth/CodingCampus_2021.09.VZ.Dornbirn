package Danny.graph.taskGraph;

public class Edge {

    private int startNodeID;
    private int  endNodeID;
    double weight;

    public Edge(int startNodeID, int  endNodeID, double weight) {
        this.startNodeID = startNodeID;
        this.endNodeID = endNodeID;
        this.weight = weight;
    }

    public int getStartNodeID() {
        return startNodeID;
    }

    public void setStartNodeID(int startNodeID) {
        this.startNodeID = startNodeID;
    }

    public int getEndNodeID() {
        return endNodeID;
    }

    public void setEndNodeID(int endNodeID) {
        this.endNodeID = endNodeID;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
