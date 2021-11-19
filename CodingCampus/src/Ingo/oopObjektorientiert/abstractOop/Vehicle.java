package Ingo.oopObjektorientiert.abstractOop;

public abstract class Vehicle {

    public void drive(int km) {
        start();
        for (int i = 0; i < km; i++) {
            if(i % 10 == 0 || i == km - 1) {
                System.out.println("Driven kilometer" + i + "-->" +(i +1));
            }
        }
        stop();
    }

    public abstract void start();

    public abstract void stop();

}
