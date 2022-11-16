package Homework_1.animals;

public class Wolf extends Animals{
    public static int countWolfs = 0;

    public Wolf (String name) {
        super(name);
        countWolfs++;
        this.animal = "Wolf";
        this.runCapacity = 1500;
        this.swimCapacity = 30;

    }
    @Override
    public void animalInfo () {
        System.out.println("Wolf is weaker than the lion and the tiger but it doesnt perform in the circus");
    }

}
