package Eray.week10.graph;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class GraphMain {
    public static void main(String[] args) {
        try {
            printAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printAll() throws Exception {
        BufferedImage image = ImageIO.read(new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\assets\\labyrinth\\Labyrinth.png"));
        byte[][] byteMap = readImage(image);
        Node[][] nodeMap = fillNodeMap(byteMap);

        for (byte[] row : byteMap) {
            for (byte column : row) {
                System.out.print(column);
            }
            System.out.println();

        }
    }


    public static byte[][] readImage(BufferedImage image) {
        byte[][] byteMap = new byte[image.getHeight()][image.getWidth()];

        int black = new Color(0, 0, 0).getRGB();

        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                if (image.getRGB(x, y) == black) {
                    byteMap[y][x] = 1;
                }
            }
        }
        return byteMap;
    }

    public static Node[][] fillNodeMap(byte[][] byteMap) {
        Node[][] nodeMap = new Node[byteMap.length][byteMap[0].length];

        for (int i = 0; i < byteMap.length; i++) {
            for (int j = 0; j < byteMap[i].length; j++) {
                if (byteMap[i][j] == 1) {
                    nodeMap[i][j] = new Node(j, i);
                }
            }
        }

        return nodeMap;
    }

    public static void findNeighbours(Node[][] nodeMap) {
        for (int i = 0; i < nodeMap.length; i++) {
            for (int j = 0; j < nodeMap.length; j++) {
                if (nodeMap[i][j] != null) {
                    addNeighbours(i, j,nodeMap);
                }
            }
        }
    }

    public static void addNeighbours(int i, int j,Node[][] nodeMap) {
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if (!(k == 0) || (l == 0)) {
                    if(i + k >=  0 && i+k < nodeMap.length){

                    }
                }
            }
        }
    }


}
