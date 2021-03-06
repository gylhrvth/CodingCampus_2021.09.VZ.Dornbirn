package Stefan.Week9.CameraObjektivSpeicher;

public class Kamera {
    private String model;
    private String producer;
    private int mp;

    private Objektiv objektiv;
    private Speicherkarte speicherkarte;

    public Kamera(String model, String producer, int mp) {
        this.model = model;
        this.producer = producer;
        this.mp = mp;
    }

    public Speicherkarte makePhotos() {
        if (speicherkarte != null) {
            speicherkarte.setSizeInGB(speicherkarte.getSizeInGB() * 1000 / getMp());
        }
        return speicherkarte;
    }

    public void insertSDCard(Speicherkarte sdCard) {
        this.speicherkarte = sdCard;
    }

    public void mountObjectiv(Objektiv objektiv) {
        this.objektiv = objektiv;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void mountSpeicherkarte(Speicherkarte speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public Speicherkarte getSpeicherkarte() {
        return speicherkarte;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        String output = String.format("%-6s %3s %3sMP", getProducer(), getModel(), getMp());
        if (objektiv != null) {
            output += "\n" + objektiv;
        }
        if (speicherkarte != null) {
            output += "\n" + speicherkarte;
        }
        return output;
    }
}
