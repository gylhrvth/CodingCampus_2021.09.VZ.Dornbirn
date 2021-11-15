package Bartosz.week8.oop.exercise3;

public class MemoryCard {
    private String type;
    private double cardSize;
    private String suitable;

    public MemoryCard(String type, double size, String suitable) {
        this.type = type;
        this.cardSize = size;
        this.suitable = suitable;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCardSize() {
        return cardSize;
    }
    public void setCardSize(double cardSize) {
        this.cardSize = cardSize;
    }
    public String getSuitable() {
        return suitable;
    }
    public void setSuitable(String suitable) {
        this.suitable = suitable;
    }


}
