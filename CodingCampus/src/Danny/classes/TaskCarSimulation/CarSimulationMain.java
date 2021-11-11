package Danny.classes.TaskCarSimulation;

public class CarSimulationMain {

    public static void main(String[] args) {
        DriverInteraction driverInteraction = new DriverInteraction();
        driverInteraction.start();
        do {
            driverInteraction.driveAndAfterDrive();
        } while (driverInteraction.driveAgain());
        System.out.println("Die Fahrt ist beendet.");
    }

}
