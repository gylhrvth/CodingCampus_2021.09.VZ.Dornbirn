package Stefan.Week10.CarSimulation;

public class Car {
    private String producer;
    private String model;
    private double kw;
    private double tankCapacity;
    private double weight;

    public Car(String producer, String model, double kw, double tankCapacity, double weight) {
        this.producer = producer;
        this.model = model;
        this.kw = kw;
        this.tankCapacity = tankCapacity;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getKw() {
        return kw;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
       return String.format("Hersteller: %2s\nModell: %2s\nkw: %2s\nTankfüllung: %2s\nGewicht: %2s\n", getProducer(), getModel(),getKw(),getTankCapacity(),getWeight());
    }
}
