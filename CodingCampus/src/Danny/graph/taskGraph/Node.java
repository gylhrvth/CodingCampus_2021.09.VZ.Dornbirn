package Danny.graph.taskGraph;

public class Node {

    int[] node = new int[2];

    public Node(int x, int y) {
        this.node[0] = x;
        this.node[1] = y;
    }

    public int[] getNode() {
        return node;
    }

    public int getX() {
        return node[0];
    }

    public int getY() {
        return node[1];
    }
}
