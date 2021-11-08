package Lena.FirstObjects.Camera;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private double maxMemorySpaceInMB;
    private List<Picture> pictureList;

    public Memory(double maxMemorySpaceInMB){
        setMaxMemorySpaceInMB(maxMemorySpaceInMB);
        this.pictureList = new ArrayList<>();
    }

    public double getMaxMemorySpaceInMB() {
        return maxMemorySpaceInMB;
    }

    public void setMaxMemorySpaceInMB(double maxMemorySpaceInMB) {
        this.maxMemorySpaceInMB = maxMemorySpaceInMB;
    }

    public List<Picture> getPictureList() {
        return pictureList;
    }

    public void savePicture(Picture picture){
        if(getFreeSpaceOnMemory()< picture.getSize()){
            throw new IllegalArgumentException("No Memory-Space left");
        }
        this.pictureList.add(picture);
    }

    public double getFreeSpaceOnMemory(){
        return this.maxMemorySpaceInMB -usedSpaceOnMemory();
    }

    public double usedSpaceOnMemory(){
        double usedSpace =0;

        for (Picture picture:this.pictureList){
          usedSpace+= picture.getSize();
        }

        return usedSpace;
    }

    public int amountOfPictures(){
        return pictureList.size();
    }


}
