package Eray.week10.graph;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        printAll();

    }

    public static void printAll() throws Exception {
        BufferedImage image = ImageIO.read(new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\labyrinth\\Labyrinth.png"));
        byte[][] byteMap = readImage(image);

        for (byte[] row : byteMap) {
            for (byte column : row) {
                System.out.println(column);
            }

        }
    }


    public static byte[][] readImage(BufferedImage image) {
        byte[][] byteMap = new byte[image.getHeight()][image.getWidth()];

        int black = new Color(0, 0, 0).getRGB();

        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                if (image.getRGB(i, j) == black) {
                    byteMap[i][j] = 1;
                } else {
                    byteMap[i][j] = 0;
                }
            }
        }
        return byteMap;
    }

}
