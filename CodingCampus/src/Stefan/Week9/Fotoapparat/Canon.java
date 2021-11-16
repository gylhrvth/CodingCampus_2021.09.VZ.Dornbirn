package Stefan.Week9.Fotoapparat;

public class Canon extends Camera{

    public String producer;

    public Canon(String producer, String modell, double mp, double focalDistanceMin, double focalDistanceMax) {
        super(modell, mp, focalDistanceMin, focalDistanceMax);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return String.format("Hersteller:\t%s\nModell:\t\t%s\nMegapixel:\t%s\nBrenn-min:\t%s\nBrenn-max:\t%s\n", getProducer(), getModell(), getMp(), getFocalDistanceMin(), getFocalDistanceMax());
    }
}
