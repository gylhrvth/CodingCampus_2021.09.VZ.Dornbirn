package Lena.FirstObjects.CarSimulation;

public class GasStation {

    private String name;

    public GasStation (String name){
        this.name=name;
    }

    public void fillTank(Car car, int liter) {
        System.out.println("Tankstand vor Tanken: "+car.getTank().getTanklevel());
        if(car.getTank().getTanklevel()+liter>car.getTank().getMaxTanklevel()){
            System.out.println("Der Tank wird aufgefüllt mit "+(car.getTank().getMaxTanklevel()- car.getTank().getTanklevel())+" Liter");
            car.getTank().setTanklevel(car.getTank().getMaxTanklevel());
        }else{
            System.out.println("Das Auto wird aufgefüllt mit "+liter+" Liter");
            car.getTank().setTanklevel(car.getTank().getTanklevel()+liter);

        }
        System.out.println("Neuer Tankstand: "+car.getTank().getTanklevel());

    }
}
