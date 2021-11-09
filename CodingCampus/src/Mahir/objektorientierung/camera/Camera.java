package Mahir.objektorientierung.camera;

public class Camera {
    private String hersteller;
    private String model;
    private int objektiv, megapixel;
    private double speicherplatz;

    public Camera(String hersteller, String model, int objektiv, double speicherplatz, int megapixel) {
        this.hersteller = hersteller;
        this.model = model;
        this.objektiv = objektiv;
        this.speicherplatz = speicherplatz;
        this.megapixel = megapixel;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(int objektiv) {
        this.objektiv = objektiv;
    }

    public double getSpeicherplatz() {
        return speicherplatz;
    }

    public void setSpeicherplatz(double speicherplatz) {
        this.speicherplatz = speicherplatz;
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
    void takePhoto2(){
        System.out.println("                $$$        $$$$$      $$$$         $$$$     $$$$$           ");
        System.out.println("                $$$       $$$$$$$     $$$$         $$$$    $$$$$$$          ");
        System.out.println("                $$$       $$$$$$$     $$$$$       $$$$$    $$$$$$$          ");
        System.out.println("                $$$       $$$$$$$      $$$$       $$$$     $$$$$$$          ");
        System.out.println("                $$$      $$$$$$$$$     $$$$$     $$$$$    $$$$$$$$$         ");
        System.out.println("                $$$      $$$$ $$$$      $$$$     $$$$     $$$$ $$$$         ");
        System.out.println("                $$$     $$$$$ $$$$$     $$$$     $$$$    $$$$$ $$$$$        ");
        System.out.println("                $$$     $$$$   $$$$     $$$$$   $$$$$    $$$$   $$$$        ");
        System.out.println("                $$$     $$$$   $$$$      $$$$   $$$$     $$$$   $$$$        ");
        System.out.println("                $$$    $$$$$   $$$$$     $$$$$ $$$$$    $$$$$   $$$$$       ");
        System.out.println("                $$$    $$$$$$$$$$$$$      $$$$ $$$$     $$$$$$$$$$$$$       ");
        System.out.println("        $$$$   $$$$   $$$$$$$$$$$$$$$     $$$$$$$$$    $$$$$$$$$$$$$$$      ");
        System.out.println("        $$$$   $$$$   $$$$$$$$$$$$$$$     $$$$$$$$$    $$$$$$$$$$$$$$$      ");
        System.out.println("        $$$$$$$$$$$   $$$$       $$$$      $$$$$$$     $$$$       $$$$      ");
        System.out.println("        $$$$$$$$$$$  $$$$$       $$$$$     $$$$$$$    $$$$$       $$$$$     ");
        System.out.println("         $$$$$$$$$   $$$$         $$$$      $$$$$     $$$$         $$$$     ");
        System.out.println("          $$$$$$$    $$$$         $$$$      $$$$$     $$$$         $$$$     ");
    }

    void takePhoto() {
        System.out.println("/-------------------------\\");
        System.out.println("|+-----------------------+|");
        System.out.println("||                       ||  <--------->");
        System.out.println("||     \"Hello World\"     ||   |       |");
        System.out.println("||                       ||   |  ---  |");
        System.out.println("||         /---\\         ||   |       |");
        System.out.println("||         |   |         ||   |   X   |");
        System.out.println("||         \\---/         ||   |       |");
        System.out.println("|+-----------------------+|   |  O O  |");
        System.out.println("\\-------------------------/   |       |");
        System.out.println("        /         \\           |  ---  |");
        System.out.println("       /           \\--\\ /-----|       |");
        System.out.println("      |-------------|  \\     <--------->");
        System.out.println("		       |");
        System.out.println("    /----------------\\/ \\ ");
        System.out.println("    |   QWERTYUIOP   |   \\");
        System.out.println("    |   ASDFGHJKL;   |   /^\\");
        System.out.println("    |    ZXCVBNM     |   \\_/");
        System.out.println("    \\----------------/   ");
    }

    @Override
    public String toString() {
        return String.format("Hersteller: %s Model: %s Objektiv: %d Megapixel: %d Speicherplatz: %.2f", hersteller, model, objektiv, megapixel, speicherplatz);
    }
}
