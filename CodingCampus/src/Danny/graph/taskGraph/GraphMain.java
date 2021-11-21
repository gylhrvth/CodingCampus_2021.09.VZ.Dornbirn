package Danny.graph.taskGraph;


import java.io.IOException;
import java.util.Arrays;

public class GraphMain {


    public static void main(String[] args) throws IOException {
//        String path = "assets/labyrinth/Labyrinth.png";
//        File file = new File(path);
//        BufferedImage image = ImageIO.read(file);
        Labyrinth labyrinth = new Labyrinth("assets/labyrinth/Labyrinth.png");
        System.out.println(Arrays.deepToString(labyrinth.getMatrix()));


    }


}
