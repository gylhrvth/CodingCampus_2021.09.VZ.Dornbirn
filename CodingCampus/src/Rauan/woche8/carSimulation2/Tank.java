package Rauan.woche8.carSimulation2;

public class Tank {

    private  double tankVerbrauch = 14.00;

    public Tank(String hersteller, String modell, String antriebsArt, double tankInhalt, String motor, int gewicht, int
                kilowatt){

    }
    public double getTankVerbrauch (){
        return tankVerbrauch;
    }
    public void setTankVerbrauch(double tankVerbrauch){
        this.tankVerbrauch = tankVerbrauch;
    }
}
