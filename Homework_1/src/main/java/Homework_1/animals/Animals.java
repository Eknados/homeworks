package Homework_1.animals;

abstract class Animals {
    public String name;
    protected String animal;
    protected int runCapacity;
    protected int swimCapacity;



    public Animals(String name){
        this.name = name;
    }

    public void run (int dist) {
        if (this.runCapacity >= dist)
            System.out.println(this.animal + " " + this.name + " runs " + dist + " m ");
        else System.out.println(this.animal + " " + this.name + " cant run that far ");

    }
    public void swim ( int dist) {
        if (this.swimCapacity >= dist)
            System.out.println(this.animal + " " + this.name + " swims " + dist + " m ");
        else System.out.println(this.animal + " " + this.name + " cant swim that far ");
    }

    public void animalInfo() {
        System.out.println(this.animal + " " + this.name + " can run " + runCapacity + " m., can swim " + swimCapacity);
    }


}

