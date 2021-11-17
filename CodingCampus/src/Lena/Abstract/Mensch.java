package Lena.Abstract;

public class Mensch extends Lebenwesen{


    private String adresse;
    public Mensch(String name, int alter, String adresse) {
        super(name, alter);
        this.adresse=adresse;
    }

    public void essen(){
        System.out.println("Ich esse gerne schnitzel");
    }
}
