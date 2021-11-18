package Mahir.objektorientierung.car.car2;

public class RepairStation {
    private Tank tank;
    private Engine engine;

    public RepairStation(Tank tank, Engine engine) {
        this.tank = tank;
        this.engine = engine;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("Tank: %s Engine: %s", tank,engine);
    }
}
