package Rauan.woche8.CarSimulation;


public class Car {

    public int carNumber;
    public String driverName;
    public String sponsor;
    public double speedInMph;
    public double totalOdometerMiles;



    public Car() {
        totalOdometerMiles = 0;
        speedInMph = 120 + (Math.random() * (60 - 120));
    }

    public void Progress() {
        double progress = totalOdometerMiles / 100;
        System.out.println("Total Mileage: " + progress);
    }

    public double ConvertMpHtoMpS() {
        return speedInMph / 3600.00;
    }
    public void printCar()
    {
        System.out.println("car Number" + this.carNumber + "\nIt's Driver: " + driverName + " Sponsor: " + sponsor
                + " Miles:" + this.totalOdometerMiles);
    }
    public double ReRandomizeSpeed() {
        return (120 + (Math.random() * (60 - 120)));
    }

}

