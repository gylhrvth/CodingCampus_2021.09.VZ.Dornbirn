package danny.classes.TaskCarSimulation;

public class Car {
    private String manufacturer;
    private String model;
    private int kW;
    private int tankCapacity;
    private DriveTyp driveTyp;
    private int weight;
    private int kilometer;

public Car (String manufacturer, String model, int kW,DriveTyp driveTyp,int weight) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.setkW(kW);
    this.driveTyp = driveTyp;
    this.weight = weight;

}
    public void setkW(int kW){
        if (kW < 0){
            throw new IllegalArgumentException("Provided value is invalid!");
        }
        this.kW = kW;
    }

    public String getManufacturer() {return manufacturer;
    }
    public String getModel() {return model;
    }
    public int getkW() {return kW;
    }
    public DriveTyp getDriveTyp() {return driveTyp;
    }
    public int getWeight() {return weight;
    }


}

