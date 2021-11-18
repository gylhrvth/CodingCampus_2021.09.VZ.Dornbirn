package Eray.week8andweek9.fotoapparat;

public class SpeicherKarteDatenUebung2 {
    private double speicherKarte = 0;

    public SpeicherKarteDatenUebung2(double speicherKarte) {
        this.speicherKarte = speicherKarte;
    }

    public double getSpeicherKarte() {
        return speicherKarte;
    }

    public void setSpeicherKarte(double speicherKarte) {
        this.speicherKarte = speicherKarte;
    }

    @Override
    public String toString() {
        return "Deine SpeicherKarte hat " + speicherKarte + " MB";
    }
}
