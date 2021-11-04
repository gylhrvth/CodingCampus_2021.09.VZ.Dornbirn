package Lukas.week8.day3.explenation;

import Lukas.week8.day3.explenation.Animal;

import java.util.ArrayList;
import java.util.List;

public class ExcerciseClass {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bello", 5, "Dogge");

        Animal animal2 = new Animal("Kiki", 10, "Katze");


        Animal animal3 = new Animal("Rambina", 15, "Katze");

        Animal animal4 = null;

        int a = 0;


        System.out.println(a);

        try {
            animal4 = new Animal("Schleichi", -22, "Schlange");
        } catch (IllegalArgumentException exc) {
            System.out.println(exc.getMessage());
        }

        Animal[] animals = new Animal[]{animal1, animal2, animal3, animal4};

        Object[] objects = new Object[]{1, 2, 3, 'c'};

        printAnimals(animals);
        System.out.println("Durchschnittsalter unserer Tiere: " + getAverageAge(animals));

        List<Animal> animalList = new ArrayList<>();
        for (int i = 0; i < animals.length; i++) {
            animalList.add(animals[i]);
        }

        System.out.println(getAverageAge(animalList));
        printAnimals(animalList);
    }

    private static void printAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void printAnimals(List<Animal> animalList) {
        for (Animal animal : animalList) {
            System.out.println(animal);
        }
    }


    private static double getAverageAge(List<Animal> animalList) {
        double averageAge = 0;
        int counter = 0;
        for (Animal animal : animalList) {
            if (animal != null) {
                averageAge += animal.getAge();
                counter++;
            }
        }
        return averageAge / counter;
    }

    private static double getAverageAge(Animal[] animals) {
        double averageAge = 0;
        int counter = 0;
        for (Animal animal : animals) {
            if (animal != null) {
                averageAge += animal.getAge();
                counter++;
            }
        }
        return averageAge / counter;
    }
}
