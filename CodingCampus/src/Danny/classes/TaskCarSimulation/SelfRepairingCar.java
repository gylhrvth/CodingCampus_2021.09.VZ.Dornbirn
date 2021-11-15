package Danny.classes.TaskCarSimulation;

public class SelfRepairingCar extends Car {
    public SelfRepairingCar(String manufacturer, String model, Engine engine, int weight, Tank tank) {
        super(manufacturer, model, engine, weight, tank);
    }

    public int driveCar(int kilometerToDrive) {
        int kmDrive = 0;
        if (!isFuelEmpty()) {
            engine.startEngine();
        }
        do {
            fuelConsumtionFactor();
            wearConsumtionFactor();
            engine.runEngine(tank, getWeight());
            kmDrive++;
            isFuelEmpty();
            isEngineDefect(kmDrive);
            if (isBroken()) {
                repairCar();
            }
        } while (kilometerToDrive != kmDrive && !isFuelEmpty());
        engine.stopEngine();
        return kmDrive;
    }

    public void repairCar() {
        System.out.println("\nDas Autto wird repariert.");
        try {
            for (int i = 0; i < 25; i++) {
                System.out.print(">");
                Thread.sleep(120);
            }
        } catch (InterruptedException exc) {
            //noop
        }
        engine.setWearValue(0);
        engine.setRandomBound(2);
        System.out.println("\nDas Auto wurde repariert und fährt weiter.");
        System.out.println("Motor Verschleiss " + engine.getWearValue()
                + " von " + engine.getWearValueToRepair());
        try {
            for (int i = 0; i < 25; i++) {
                System.out.print(">");
                Thread.sleep(100);
            }
        } catch (InterruptedException exc) {
            //noop
        }
    }


}
