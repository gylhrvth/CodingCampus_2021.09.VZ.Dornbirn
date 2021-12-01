package Lena.FirstObjects.graph;

import Lena.FirstObjects.graph.ui.GraphFrame;
import Lena.FirstObjects.graph.businessLogic.Graph;
import Lena.FirstObjects.graph.businessLogic.Node;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("CodingCampus/src/Lena/FirstObjects/graph/source/Roadmap.png"));
        Node[][] nodeMatrix = readImage(image);
        findNeighbours(nodeMatrix);

        Graph graph = new Graph();
        graph.fillNodeList(nodeMatrix);
        new GraphFrame(graph, nodeMatrix[0].length, nodeMatrix.length);


    }


    public static Node[][] readImage(BufferedImage image) {
        Node[][] nodeMap = new Node[image.getHeight()][image.getWidth()];

        Set<Integer> colors = new HashSet<>();

        int black = new Color(0, 0, 0).getRGB();
        int yellow = new Color(255, 201, 14).getRGB();
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                colors.add(image.getRGB(x, y));

                if (image.getRGB(x, y) == black) {
                    nodeMap[y][x] = new Node(x,y,2);
                }
                if(image.getRGB(x,y)==yellow){
                    nodeMap[y][x]= new Node(x,y,1);
                }
            }
        }
    /*    for (int color : colors) {
            int red = (color >> 16) & 0x000000FF;
            int green = (color >> 8) & 0x000000FF;
            int blue = (color) & 0x000000FF;
            System.out.println("r: " + red + " g: " + green + " b: " + blue);
        }*/
        return nodeMap;
    }


    public static void findNeighbours(Node[][] nodeMatrix) {
        for (int i = 0; i < nodeMatrix.length; i++) {

            for (int j = 0; j < nodeMatrix[i].length; j++) {
                if (nodeMatrix[i][j] != null) {

                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (!(k == 0 && l == 0)) {
                                double distance = ((k == 0) || (l == 0)) ? 1.0 : Math.sqrt(2);
                                if (i + k >= 0 && i + k < nodeMatrix.length && j + l >= 0 && j + l < nodeMatrix[0].length) {
                                    if (nodeMatrix[i + k][j + l] != null) {
                                        nodeMatrix[i][j].addNeighbour(nodeMatrix[i + k][j + l], distance+nodeMatrix[i][j].getWeight());
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
