package Lena.FirstObjects.Camera;

import java.util.Random;

public class Picture {

    private Motive motive;
    private double size;

    public Picture(double size){
        setSize(size);
        setMotive();
    }

    public Motive getMotive() {
        return motive;
    }

    public void setMotive() {
        int pick =new Random().nextInt(Motive.values().length);
        this.motive = Motive.values()[pick];
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "**PICTURE FROM "+this.getMotive().toString()+"**";
    }
}
