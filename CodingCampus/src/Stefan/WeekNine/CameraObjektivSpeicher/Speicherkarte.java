package Stefan.WeekNine.CameraObjektivSpeicher;

public class Speicherkarte {
    private String speicherkarte;

    public Speicherkarte(String speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public String getSpeicherkarte() {
        return speicherkarte;
    }

    public void setSpeicherkarte(String speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    @Override
    public String toString() {
        return String.format("Speichergrösse %2s", getSpeicherkarte());
    }
}
