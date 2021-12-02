package Plamena.week8.Camera;

public class Main {

    public static void main(String[] args) {

        Camera camera = new Camera("Sony", "XXX", 16);

        camera.setMemoryCard(new MemoryCard());

        camera.takePicture("Baum", 10.0);
        camera.takePicture("Katze", 3.0);
        camera.takePicture("See", 13);
        camera.takePicture("Himmel", 15);
        camera.takePicture("Sand", 18);
        camera.takePicture("Sterne", 25);
        camera.takePicture("Kind", 35);
        camera.takePicture("Feuer", 35);
        camera.takePicture("Bus", 35);
        camera.takePicture("Stadt", 35);
        camera.takePicture("Kind", 35);
        camera.takePicture("Mann", 35);
        camera.takePicture("Kind", 35);
        camera.takePicture("Frau", 35);
        camera.takePicture("Familie", 35);


    }
}
