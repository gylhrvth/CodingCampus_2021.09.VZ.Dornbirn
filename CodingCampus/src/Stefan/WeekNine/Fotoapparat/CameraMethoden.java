package Stefan.WeekNine.Fotoapparat;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CameraMethoden {

    //Listet alle Cameras auf
    public static void printCameraList(List<Camera> cameras) {
        for (Camera camera : cameras) {
            System.out.println(camera);
        }
    }

    public static boolean loadPhoto() throws IOException {
        File file = new File("assets/res/jeam-beam.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(600,750,Image.SCALE_DEFAULT));
        JFrame jFrame = new JFrame();

        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(600,790);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return false;
    }

    public static void takePhoto() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit welcher Camera wollen Sie ein Foto machen: Canon, Nikon, Sony");
        String inputCamera = scanner.next();

        if (inputCamera.equalsIgnoreCase("Canon")) {
            System.out.println("Wollen Sie nun das Foto machen? Ja / Nein");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Ja")) {
                System.out.println(loadPhoto());
            }
        } else if (inputCamera.equalsIgnoreCase("Nikon")) {
            System.out.println("Wollen Sie nun das Foto machen? Ja / Nein");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Ja")) {
                System.out.println(loadPhoto());
            }
        } else if (inputCamera.equalsIgnoreCase("Sony")) {
            System.out.println("Wollen Sie nun das Foto machen? Ja / Nein");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Ja")) {
                System.out.println(loadPhoto());
            }
        }
    }

}
