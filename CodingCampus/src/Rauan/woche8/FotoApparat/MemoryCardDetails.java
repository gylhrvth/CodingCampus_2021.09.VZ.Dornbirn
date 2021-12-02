package Rauan.woche8.FotoApparat;

public class MemoryCardDetails {

    private double MemoryCard = 0;

    public MemoryCardDetails(double memoryCard) {
        this.MemoryCard = memoryCard;
    }

    public MemoryCardDetails(String s, String nikon) {
    }

    public double getMemoryCard() {
        return MemoryCard;
    }

    public void setMemoryCard() {
        this.MemoryCard = MemoryCard;
    }

    @Override
    public String toString() {
        return String.format("Dein Speicherkarte hat " + MemoryCard + "MB");
        
        

    }
}
