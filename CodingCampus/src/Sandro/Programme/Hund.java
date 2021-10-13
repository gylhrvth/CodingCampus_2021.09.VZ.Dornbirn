package Sandro.Programme;

public class Hund {

    // Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfotegeben;
    boolean kannbellen;

    //Hund
    public Hund(int alter, String art, String fellfarbe, boolean kannPfotegeben) {
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfotegeben = kannPfotegeben;
    }

    public Hund(int alter, String art, String fellfarbe, boolean kannPfotegeben, boolean kannBellen) {
        this.alter = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfotegeben = kannPfotegeben;
        this.kannbellen = kannBellen;
    }

    public void Ente() {
    }

    public void Frosch() {
    }
}

