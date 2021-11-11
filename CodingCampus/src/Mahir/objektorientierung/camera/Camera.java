package Mahir.objektorientierung.camera;

public class Camera {
    private String manufacturer;
    private String model;
    private int cameraLens, megapixel;
    private double memorySpace;

    public Camera(String manufacturer, String model, int cameraLens, double memorySpace, int megapixel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cameraLens = cameraLens;
        this.memorySpace = memorySpace;
        this.megapixel = megapixel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCameraLens() {
        return cameraLens;
    }

    public void setCameraLens(int cameraLens) {
        this.cameraLens = cameraLens;
    }

    public double getMemorySpace() {
        return memorySpace;
    }

    public void setMemorySpace(double memorySpace) {
        this.memorySpace = memorySpace;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    void menu() {
        System.out.println("1 - Take Photo \n2 - Gallery \n");
    }

    void gallery(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println("Photo" + (i + 1) + ".jpg");
        }

    }
    void  takePhoto6(){
        System.out.println("─▄▀▀▀▄────▄▀█▀▀█▄\n" +
                "▄▀─▀─▀▄▄▀█▄▀─▄▀─▄▀▄\n" +
                "█▄▀█───█─█▄▄▀─▄▀─▄▀▄\n" +
                "──█▄▄▀▀█▄─▀▀▀▀▀▀▀─▄█\n" +
                "─────▄████▀▀▀▀████─▀▄");
    }
    void  takePhoto5(){
        System.out.println("──▒▒▒▒▒▒▒▒───▒▒▒▒▒▒▒▒\n" +
                "─▒▐▒▐▒▒▒▒▌▒─▒▒▌▒▒▐▒▒▌▒\n" +
                "──▒▀▄█▒▄▀▒───▒▀▄▒▌▄▀▒\n" +
                "─────██─────────██\n" +
                "░░░▄▄██▄░░░░░░░▄██▄░░░");
    }
    void  takePhoto4(){
        System.out.println("──────▄▀▄─────▄▀▄\n" +
                "─────▄█░░▀▀▀▀▀░░█▄\n" +
                "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
                "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█\n");
    }
    void takePhoto3(){
        System.out.println("─▄───────▄█▄───────▄─\n" +
                "▐█▌──▄──█████──▄──▐█▌\n" +
                "─█──███▄▄███▄▄███──█─\n" +
                "░█░░█▄█▄█▀▒▀█▄█▄█░░█░\n" +
                "██▄▄█▄█▄█▒▒▒█▄█▄█▄▄██");
    }
    void takePhoto2(){
        System.out.println("───────────────▄▄───▐█\n" +
                "───▄▄▄───▄██▄──█▀───█─▄\n" +
                "─▄██▀█▌─██▄▄──▐█▀▄─▐█▀\n" +
                "▐█▀▀▌───▄▀▌─▌─█─▌──▌─▌\n" +
                "▌▀▄─▐──▀▄─▐▄─▐▄▐▄─▐▄─▐▄");
    }

    void takePhoto() {
        System.out.println("───▄▀▀▀▀▀───▄█▀▀▀█▄\n" +
                "──▐▄▄▄▄▄▄▄▄██▌▀▄▀▐██\n" +
                "──▐▒▒▒▒▒▒▒▒███▌▀▐███\n" +
                "───▌▒▓▒▒▒▒▓▒██▌▀▐██\n" +
                "───▌▓▐▀▀▀▀▌▓─▀▀▀▀▀\n");
    }

    @Override
    public String toString() {
        return String.format("Hersteller: %s Model: %s Objektiv: %d Megapixel: %d Speicherplatz: %.2f", manufacturer,
                model, cameraLens, megapixel, memorySpace);
    }
}
