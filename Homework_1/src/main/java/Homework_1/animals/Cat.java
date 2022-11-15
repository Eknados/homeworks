package Homework_1.animals;

class Cat extends Animals {
    public Cat (String name) {
        super(name);
        this.animal = "Cat";
        this.runCapacity = 200;

    }
    @Override
    public void swim (int dist) {
        System.out.println(this.name + " Doesnt swim ");
    }
}
