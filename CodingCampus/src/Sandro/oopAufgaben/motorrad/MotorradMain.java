package Sandro.oopAufgaben.motorrad;

public class MotorradMain {

    public static void main(String[] args) {

        Motorrad meinMotorrad = new Motorrad((new Motor(62,0.6)),
                new Reifen(60,2.5,"Sommer"),
                new Reifen(67,2.5,"Sommer"));

        System.out.println();
        System.out.println(meinMotorrad);
    }
}
