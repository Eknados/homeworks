package Homework_1.animals;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Animals[] animals = {
                new Cat("Pushok"),
        new Cat("Petux"),
        new Dog("Biba"),
        new Dog("Boba"),
        new Tiger("Shirkhan"),
        new Wolf("Gigachad"),
        };
        for (Animals i : animals) {
            i.run(800);
            i.swim(400);


        }
        System.out.println("Animals count " + " = " + Animals.countAnimals);
        System.out.println("Cats count " + " = " + Cat.countCats);
        System.out.println("Dogs count " + " = " + Dog.countDogs);
        System.out.println("Tigers count " + " = " + Tiger.countTigers);
        System.out.println("Wolfs count " + " = " + Wolf.countWolfs);
    }
}
