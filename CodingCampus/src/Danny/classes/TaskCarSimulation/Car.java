package Danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    private int tankCapacity;
    private DriveTyp driveTyp;
    private int weight;
    private int kilometer;

    public Car(String manufacturer, String model, int kW, DriveTyp driveTyp, int weight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.setkW(kW);
        this.driveTyp = driveTyp;
        this.weight = weight;

    }

    public void setkW(int kW) {
        if (kW < 0) {
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getkW() {
        return kW;
    }

    public DriveTyp getDriveTyp() {
        return driveTyp;
    }

    public int getWeight() {
        return weight;
    }

    public void driveCar() {


        while (true) {

            try {
                for (int j = 0; j <= 159; j++) {
                    System.out.println();
                    System.out.println();
                    String carRepat = " ";
                    System.out.println(carRepat.repeat(j) + "     ___     " + carRepat.repeat(159 - j));
                    carRepat = "_";
                    System.out.print(carRepat.repeat(j) + "___=o---o>___" + carRepat.repeat(159 - j));
                    Thread.sleep(15);
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }

            } catch(InterruptedException exc){
                //noop
            }

        }
    }



}

