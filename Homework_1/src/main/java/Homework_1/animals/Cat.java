package Homework_1.animals;

class Cat extends Animals {
    public static int countCats = 0;
    public Cat (String name) {
        super(name);
        countCats++;
        this.animal = "Cat";
        this.runCapacity = 200;

    }
    @Override
    public void swim (int dist) {
        System.out.println(this.name + " Doesnt swim ");
    }
}
