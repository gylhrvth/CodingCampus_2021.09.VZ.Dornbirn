package Rauan.woche8.carSimulation2;

public class RepairMethodSubClass extends DataCar {


    public RepairMethodSubClass(String hersteller, String modell, String antriebsArt,
                                double tankInhalt, int gewicht, int kiloWatt, String motor) {
        super(hersteller, modell, antriebsArt, tankInhalt, gewicht, kiloWatt, motor);

        double akteullTankInhalt = getTankInhalt();
    }

    public static void selbRepair() {

    }

    public static void AreoDynamic() {
        System.out.println("Du kannst weiterfahren hne TankStation zu gehen");
    }

    public static void badCar() {

    }
}
