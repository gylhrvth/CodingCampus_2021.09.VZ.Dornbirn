package Bartosz.oop.training.basics;

import java.util.ArrayList;

public class Init {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs(5, "Lucky", "shepard", "brown");
        Dogs dog2 = new Dogs(8, "Bello", "labrador", "black");
        Dogs dog3 = new Dogs(4, "Yoon", "dackel", "brown");

        ArrayList<Dogs> ourDogs = new ArrayList<Dogs>();
        ourDogs.add(dog1);
        ourDogs.add(dog2);
        ourDogs.add(dog3);

        System.out.println();

        sortDogs(ourDogs);
    }

    public static ArrayList<Double> sortDogs(ArrayList<Dogs> ourDogs){
        double minAge = 0;
        double maxAge = 20;
        double sum = 0;
        int counter = 0;
        for (Dogs dog : ourDogs){
            if(minAge < dog.getAge()) {
                minAge = dog.getAge();
            }
            if(maxAge > dog.getAge()) {
                maxAge = dog.getAge();
            }
            sum += dog.getAge();
            counter++;
        }
        double avgAge = sum / counter;

        ArrayList<Double> dogsAge = new ArrayList<Double>();
        dogsAge.add(minAge);
        dogsAge.add(maxAge);
        dogsAge.add(avgAge);

        return dogsAge;
    }

    public static void printArrayValues(ArrayList<Double> dogsAge) {
        for(Double numbers : dogsAge){

        }
    }
}
