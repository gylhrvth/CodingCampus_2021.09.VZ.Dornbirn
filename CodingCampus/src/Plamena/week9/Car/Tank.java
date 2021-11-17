package Plamena.week9.Car;

public class Tank {
    private double fuelStand;
    private double maxVolume;
    private final double reserve = 0.05 * maxVolume;

    public Tank(double fuelStand, double maxVolume) {
        this.fuelStand = fuelStand;
        this.maxVolume = maxVolume;
    }

    public double getFuelStand() {
        return fuelStand;
    }

    public double getReserve() {
        return reserve;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setFuelStand(double fuelStand) {
        this.fuelStand = fuelStand;
    }
}
