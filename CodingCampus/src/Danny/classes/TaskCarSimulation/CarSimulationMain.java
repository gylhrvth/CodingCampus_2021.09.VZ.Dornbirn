package Danny.classes.TaskCarSimulation;

public class CarSimulationMain {
    static Car auto1 = new Car("Audi","TT",250,DriveTyp.gasoline,1260);

    public static void main(String[] args) {
        System.out.println(auto1.getManufacturer());
        System.out.println(auto1.getModel());
        System.out.println(auto1.getkW());
        System.out.println(auto1.getDriveTyp());
        System.out.println(auto1.getWeight());

        auto1.driveCar();
    }

}
