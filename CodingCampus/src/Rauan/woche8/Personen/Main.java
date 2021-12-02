package Rauan.woche8.Personen;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personenklasse Rauan = new Personenklasse("Rauan", 24, 63, 163);
        Personenklasse Ahmad = new Personenklasse("Ahmad", 22, 65, 184);
        Personenklasse Sara = new Personenklasse("Sara", 30, 55, 158);


        List<Personenklasse> People = new ArrayList<>();
        People.add(Rauan);
        People.add(Ahmad);
        People.add(Sara);

        printPersonen(People);


        MinMaxAveragePerson minMaxAveragePerson= getMinMaxAvg(People);
        System.out.println(minMaxAveragePerson);



    }

    private static void printPersonen(List<Personenklasse> personenklasseList) {
        for (Personenklasse personenklasse : personenklasseList) {
            System.out.println(personenklasse);
        }
    }

    public static MinMaxAveragePerson getMinMaxAvg(List<Personenklasse> people) {
        double minHigh = Double.MAX_VALUE;
        double maxHigh = Double.MIN_VALUE;
        double minWight = Double.MAX_VALUE;
        double maxWight = Double.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;
        double sumHigh = 0;
        double sumWight = 0;
        int sumAge = 0;

        for (Personenklasse p : people) {
            if (p.getAge() > maxAge) {
                maxAge = p.getAge();
            }
            if (p.getAge() < minAge) {
                minAge = p.getAge();
            }
            if (p.getHeight() > maxHigh) {
                maxHigh = p.getHeight();
            }
            if (p.getHeight() < minHigh) {
                minHigh = p.getHeight();
            }
            if (p.getWeight() > maxWight) {
                maxWight = p.getWeight();
            }
            if (p.getWeight() < minWight) {

                minWight = p.getWeight();
            }
            sumHigh += p.getHeight();
            sumAge += p.getAge();
            sumWight = p.getWeight();


        }
        double avgHigh = sumHigh / people.size();
        double avgWight = sumWight / people.size();
        double avgAge = (double) sumAge / people.size();

        return new MinMaxAveragePerson( minHigh,maxHigh,minWight,maxWight,minAge,maxAge,avgHigh,avgWight,avgAge);
    }

}