package Stefan.WeekNine.CameraObjektivSpeicher;

public class Speicherkarte {
    private int speicherkarte;

    public Speicherkarte(int speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public int getSpeicherkarte() {
        return speicherkarte;
    }

    public void setSpeicherkarte(int speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    @Override
    public String toString() {
        return String.format("Speichergrösse:%4s\n", getSpeicherkarte());
    }
}
