package Mahir.objektorientierung.car;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Opel","Corsa",75,41,3.3,ENGINE_TYPE.DIESEL,1165);

        car.carSimulation();

    }
}
