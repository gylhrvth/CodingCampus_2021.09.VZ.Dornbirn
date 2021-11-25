package Rauan.woche10.interfaces;

public class AmphibienFahrzeug implements canSwim,canDrive{
    @Override
    public void drive(int km) {
        System.out.println("Ich kann alles, an das Land "+ km+ " kilometer fahren");
    }

    @Override
    public void swim(int km) {
        System.out.println("Ich kann auch "+km+ " kilometer swimmen");
    }
}
