package Danny.classes.TaskCarSimulation;

public class CarSimulationMain {
    static Car auto1 = new Car("Audi", "TT", 180, DRIVE_TYP.gasoline, 1370);
    static Car auto2 = new Car("Ford", "Mondeo", 110, DRIVE_TYP.diesel, 1577);
    static Car auto3 = new Car("Fiat", "Panda", 59, DRIVE_TYP.gas, 1155);
    static Car auto4 = new Car("Tesla", "Model 3", 350, DRIVE_TYP.electricity, 1847);

    public static void main(String[] args) {
        System.out.println(auto1.getManufacturer());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getkW());
        System.out.println(auto1.getDriveTyp());
        System.out.println(auto1.getWeight());

        auto1.beforeDrive();
        auto1.coveredDistance(auto1.driveCar(auto1.howFarDrive()));
    }

}
