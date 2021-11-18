package Stefan.Week10.CarSimulation;

import java.util.Scanner;

public class Car {
    private String producer;
    private String model;
    private double kw;
    private final double maxTankCapacity;
    private double tankCapacity;
    private double weight;
    private DriveTyp driveTyp;
    public double verbrauch;
    public int gefahreneStrecke;


    public Car(String producer, String model, double kw, double tankCapacity, double weight, DriveTyp driveTyp) {
        this.producer = producer;
        this.model = model;
        this.kw = kw;
        this.maxTankCapacity = tankCapacity;
        this.tankCapacity = tankCapacity;
        this.weight = weight;
        this.driveTyp = driveTyp;
        this.verbrauch = kw / weight;
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

    public void setKw(int kw) {
        this.kw = kw;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public DriveTyp getDriveTyp() {
        return driveTyp;
    }

    public void setDriveTyp(DriveTyp driveTyp) {
        this.driveTyp = driveTyp;
    }


    Scanner scanner = new Scanner(System.in);


    public int drive(int kilometer) {

        double aktuellerVerbrauch = kilometer * this.verbrauch;


        if (aktuellerVerbrauch < this.tankCapacity) {
            System.out.println("Ich fahre.......");
//            for (int i = 0; i <= kilometer; i++) {
//                if (i % 50 == 0) {
//                    System.out.printf("...%4d km .....%n", i);
//                }
//            }
            gefahreneStrecke += kilometer;
            this.tankCapacity -= aktuellerVerbrauch;
            System.out.println();
            System.out.printf("%.2f L sind noch verfügbar", this.tankCapacity);
            System.out.println();
        } else if (aktuellerVerbrauch > this.tankCapacity) {

            double nochMoeglicheKilometer = this.tankCapacity / this.verbrauch;

            this.tankCapacity = 0;

            System.out.printf("Du bist gefahren %.2fkm. Tanken gehen [1]Ja, [2]Nein", nochMoeglicheKilometer);
            System.out.println();

            refuel();

            double restKilometer = kilometer - nochMoeglicheKilometer;
            System.out.println();
            System.out.printf("Wollen Sie die restlichen %.2f Kilometer fahren? [1]Ja, [2]Nein", restKilometer);
            System.out.println();
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.printf("Sie siend die %.2f gefahren!\n", restKilometer);
                double restVerbrauch = restKilometer * this.verbrauch;
                this.tankCapacity = this.tankCapacity - restVerbrauch;
            }

        }
        return gefahreneStrecke;
    }

    public void refuel() {
        boolean refuelTank = true;
        double fullTank = this.tankCapacity;
        int input = scanner.nextInt();
        while (refuelTank) {

            if (input == 1) {
                System.out.println("Wieviel Liter wollen sie tanken?");
                int inputFuell = scanner.nextInt();

                if (inputFuell <= maxTankCapacity - fullTank) {
                    double refuel = inputFuell + this.tankCapacity;
                    this.tankCapacity = refuel;
                    System.out.printf("Es sind wieder %.2fL im Tank", this.tankCapacity);
                    refuelTank = false;
                }

                if (inputFuell > maxTankCapacity - fullTank) {
                    double maxFuell = maxTankCapacity - fullTank;
                    System.out.printf("Sie können nur %.2fL tanken", maxFuell);
                    System.out.println();
                    System.out.println("Soll der Tank ganz gefüllt werden? [x]Ja [y]Nein");
                    String inputFuellTank = scanner.next();
                    if (inputFuellTank.equals("x")) {
                        System.out.println("Ihr Tank ist wieder voll!");
                        this.tankCapacity = maxTankCapacity;
                    } else if (inputFuellTank.equals("y")) {
                        CarMain.driving = false;
                        System.out.println("Ihr Auto wurde blockiert");
                    }
                    return;
                }

            } else if (input == 2) {
                refuelTank = false;
                CarMain.driving = false;
                System.out.println("Danke das wars");
            }
        }

    }


    @Override
    public String toString() {
        return String.format("Hersteller: %2s\nModell: %2s\nkw: %2s\nTankfüllung: %2s\nGewicht: %2s\nTanktyp: %2s\n", getProducer(), getModel(), getKw(), getTankCapacity(), getWeight(), getDriveTyp());
    }
}
