package Lena.FirstObjects.graph;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("assets/labyrinth/Labyrinth.png"));
        byte[][] bytemap = readImage(image);
        Node[][] nodeMatrix = fillNodesMatrix(bytemap);

        Graph graph = new Graph();
        graph.fillNodeList(nodeMatrix);
        GraphFrame graphFrame = new GraphFrame(graph);

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

    public static Node[][] fillNodesMatrix(byte[][] byteMap) {
        Node[][] nodeMatrix = new Node[byteMap.length][byteMap[0].length];

        for (int i = 0; i < byteMap.length; i++) {
            for (int j = 0; j < byteMap[i].length; j++) {
                if (byteMap[i][j] == 1) {
                    nodeMatrix[i][j] = new Node(j, i);
                }
            }

        }

        findNeighbours(nodeMatrix);

        return nodeMatrix;
    }

    public static void findNeighbours(Node[][] nodeMatrix) {
        for (int i = 0; i < nodeMatrix.length; i++) {

            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {

                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if(!(k==0 && l==0)) {
                                double distance = ((k == 0) || (l == 0))?1.0:Math.sqrt(2);
                                if ( i + k >= 0 && i + k < nodeMatrix.length && j + l >= 0 && j + l < nodeMatrix[0].length) {
                                    if (nodeMatrix[i + k][j + l] != null) {
                                        nodeMatrix[i][j].addNeighbour(nodeMatrix[i + k][j + l], distance);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}
