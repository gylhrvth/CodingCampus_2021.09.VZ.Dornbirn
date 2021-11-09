package Rauan.woche8.Personen;

public class Personenklasse {
    private String Name;
    private int Age;
    private double Weight;
    private double Height;

    public Personenklasse(String name, int age, double weight, double height) {
        Name = name;
        Age = age;
        Weight = weight;
        Height = height;
    }


    public String getName() {return Name;}

    public int getAge() {return Age;}

    public double getWeight() {return Weight;}

    public double getHeight() {return Height;}

    @Override
    public String toString (){return String.format("Mein Name is %s ,Ich bin %d Jahre alt," +
                    "mein Weight is %.2f und mein Height is %.2f",Name,Age,Weight,Height);}
}
