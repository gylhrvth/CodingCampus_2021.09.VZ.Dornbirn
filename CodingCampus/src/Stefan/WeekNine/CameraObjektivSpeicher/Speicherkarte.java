package Stefan.WeekNine.CameraObjektivSpeicher;

public class Speicherkarte {
    private int sizeInGB;

    public Speicherkarte(int size) {
        this.sizeInGB = size;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }

    public void setSizeInGB(int sizeInGB) {
        this.sizeInGB = sizeInGB;
    }

    @Override
    public String toString() {
        return String.format("Speichergrösse %2s", getSizeInGB());
    }
}
