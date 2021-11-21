package Danny.graph.taskGraph;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Labyrinth {


    private File file;
    private BufferedImage image;
    int[][] matrix;

    public Labyrinth(String path) throws IOException {

        this.file = new File(path);
        this.image = readImage();
        this.matrix = new int[this.image.getHeight()][this.image.getWidth()];
        fillMatrix();
    }


    public BufferedImage readImage() throws IOException {
        image = ImageIO.read(this.file);
        return image;
    }

    public void fillMatrix() {
        for (int y = 0; y < this.image.getHeight(); y++) {
            for (int x = 0; x < this.image.getWidth(); x++) {
                if (this.image.getRGB(x, y) == Color.BLACK.getRGB())
                    this.matrix[y][x] = 1;
            }
        }
    }

    public int[][] getMatrix() {
        return this.matrix;
    }
}
