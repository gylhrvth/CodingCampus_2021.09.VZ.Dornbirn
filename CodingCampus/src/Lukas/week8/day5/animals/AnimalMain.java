package Lukas.week8.day5.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Alfons", 4);

//        animal.sleep();
//        animal.eat();

        Animal cat = new Cat("Felix", 10);
        Animal dog = new Dog("Rambo", 2);

//        cat.eat();

        System.out.println("---------\n---Eat---\n---------");

        letAnimalEat(animal);
        letAnimalEat(cat);
        letAnimalEat(dog);

        System.out.println("-------------------------------\n---Do Animal Specific things---\n-------------------------------");

        doAnimalSpecificThings(animal);
        doAnimalSpecificThings(cat);

        System.out.println("---Animal list---");

        List<Animal> animals = createAnimals(10);
        for(Animal animal1 : animals) {
            doAnimalSpecificThings(animal1);
            letAnimalEat(animal1);
        }
    }

    private static void letAnimalEat(Animal animal) {
        animal.eat();
    }

    private static void doAnimalSpecificThings(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.miau();
        } else {
            animal.sleep();
        }
    }

    private static List<Animal> createAnimals(int count) {
        List<Animal> animals = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            if (random.nextInt(2) == 0) {
                animals.add(new Cat("Cat" + i, i));
            } else {
                animals.add(new Dog("Dog" + i, i));
            }
        }
        return animals;
    }
}
