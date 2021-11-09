package Stefan.WeekNine.CameraObjektivSpeicher;

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

    public void takePhoto() {
        if(speicherkarte != null) {
            speicherkarte.setSpeicherkarte(speicherkarte.getSpeicherkarte() - 80);
        }
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
        return String.format("Hersteller:%6s, Model:%8s, Megapixel:%4s, Objektiv:%2s", getProducer(), getModel(), getMp(), getObjektiv());
    }
}
