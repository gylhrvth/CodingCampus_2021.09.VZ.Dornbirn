package Mahir.objektorientierung.camera;

public class MemorySpace {
    private String name;
    private double memory;

    public MemorySpace(String name, double memory) {
        this.name = name;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Memory: %.2f GB",name,memory);
    }
}
