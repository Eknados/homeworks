package Homework_1.animals;

public class Dog extends  Animals {
    public static int countDogs = 0;
    public Dog (String name) {
        super(name);
        countDogs++;
        this.animal = "Dog";
        this.runCapacity = 500;
        this.swimCapacity = 10;
    }
}
