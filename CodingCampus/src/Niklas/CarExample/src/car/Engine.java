package car;

public class Engine {
    private int cubicCapacity;
    private boolean isTurnedOn = false;

    public Engine(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    //Electro cars only
    public Engine() {
    }

    public void start() {
        this.isTurnedOn = true;
    }

    public  void stop(){
        this.isTurnedOn = false;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }


}
