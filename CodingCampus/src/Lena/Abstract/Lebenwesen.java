package Lena.Abstract;

public abstract class Lebenwesen {

    private String name;
    private int alter;

    public Lebenwesen(String name, int alter) {
        this.name=name;
        this.alter=alter;
    }

    public void sagtHallo(){
        System.out.println("Hallo");
    }

    public abstract void essen();
}
