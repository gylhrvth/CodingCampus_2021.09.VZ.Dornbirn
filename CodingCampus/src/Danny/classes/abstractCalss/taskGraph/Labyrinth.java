package Danny.classes.abstractCalss.taskGraph;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Labyrinth {

    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth();
        BufferedImage bi = createBI();

        System.out.println(bi);

    }

    private static BufferedImage createBI() {
        BufferedImage bi = null;
        try {
            bi = ImageIO.read(new File("C:\\Users\\dan\\IdeaProjects\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Danny\\classes\\abstractCalss\\taskGraph\\Labyrinth.png"));
        } catch (IOException e) {
            System.err.println("Datei nicht lesbar!");
        }
        return bi;
    }



}
