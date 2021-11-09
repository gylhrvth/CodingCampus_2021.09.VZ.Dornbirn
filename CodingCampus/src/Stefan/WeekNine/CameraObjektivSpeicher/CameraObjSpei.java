package Stefan.WeekNine.CameraObjektivSpeicher;

public class CameraObjSpei {
    private String model;
    private String producer;
    private int mp;

    public CameraObjSpei(String model, String producer, int mp) {
        this.model = model;
        this.producer = producer;
        this.mp = mp;
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
}
