package Lena.FirstObjects.Persons;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Plamena", 170, 27, 55);
        Person p2 = new Person("Lena", 180, 24, 63);
        Person p3 = new Person("Hans", 185, 88, 130);

        List<Person> peolpe = new ArrayList<>();
        peolpe.add(p1);
        peolpe.add(p2);
        peolpe.add(p3);

        sortPeopleListByAttribute(peolpe,PersonAttributes.AGE);
        System.out.println(peolpe);

        sortPeopleListByAttribute(peolpe,PersonAttributes.WIGHT);
        System.out.println(peolpe);

        sortPeopleListByAttribute(peolpe,PersonAttributes.HIGH);
        System.out.println(peolpe);

        sortPeopleListByAttribute(peolpe,PersonAttributes.NAME);
        System.out.println(peolpe);

        System.out.println(getMinMaxAvg(peolpe));

    }

    public static void sortPeopleListByAttribute(List<Person> people, PersonAttributes attribute){

        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size()-1-i; j++) {
                if(attribute == PersonAttributes.AGE){
                   if(people.get(j).getAge()>people.get(j+1).getAge()){
                       Person temp = people.get(j);
                       people.set(j, people.get((j+1)));
                       people.set(j+1, temp);
                   }
                }else if (attribute==PersonAttributes.HIGH){
                    if(people.get(j).getHeight() > people.get(j + 1).getHeight()){
                        Person temp = people.get(j);
                        people.set(j, people.get((j+1)));
                        people.set(j+1, temp);
                    }
                }else if (attribute==PersonAttributes.WIGHT){
                    if(people.get(j).getWight()> people.get(j+1).getWight()){
                        Person temp = people.get(j);
                        people.set(j, people.get((j+1)));
                        people.set(j+1, temp);
                    }
                }else if(attribute==PersonAttributes.NAME){
                    if(people.get(j).getName().compareTo(people.get(j+1).getName())>0){
                        Person temp = people.get(j);
                        people.set(j, people.get((j+1)));
                        people.set(j+1, temp);
                    }
                }
            }

        }

    }



    public static MinMaxAvgOfPersons getMinMaxAvg(List<Person> people) {
        double minHigh = Double.MAX_VALUE;
        double maxHigh = Double.MIN_VALUE;
        double minWight = Double.MAX_VALUE;
        double maxWight = Double.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;
        double sumHigh = 0;
        double sumWight = 0;
        int sumAge = 0;

        for (Person p : people) {
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
            if (p.getWight() > maxWight) {
                maxWight = p.getWight();
            }
            if (p.getWight() < minWight) {

                minWight = p.getWight();
            }
            sumHigh += p.getHeight();
            sumAge += p.getAge();
            sumWight = p.getWight();


        }
        double avgHigh = sumHigh / people.size();
        double avgWight = sumWight / people.size();
        double avgAge = (double)sumAge / people.size();

        return new MinMaxAvgOfPersons(minHigh, maxHigh, minWight, maxWight, minAge, maxAge, avgHigh, avgWight, avgAge);
    }


}
