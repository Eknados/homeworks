package Homework_1.animals;

public class Tiger extends Animals{
    public static int countTigers = 0;
    public Tiger (String name) {
        super(name);
        countTigers++;
        this.animal = "Tiger";
        this.runCapacity = 700;
        this.swimCapacity = 20;
    }
}
