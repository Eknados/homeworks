package Homework_1.animals;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Pushok");
        Cat cat2 = new Cat("Petux");

        Dog dog1 =  new Dog("Biba");
        Dog dog2 = new Dog("Boba");

        Tiger tiger1 =  new Tiger("Shirkhan");

        Wolf wolf1 = new Wolf("Gigachad");

        System.out.println("Cat info:");
        cat1.animalInfo();
        cat2.animalInfo();


        System.out.println("Dog info:");
        dog1.animalInfo();
        dog2.animalInfo();

        System.out.println("Tiger info");
        tiger1.animalInfo();

        System.out.println("Wolf info");
        wolf1.animalInfo();

        System.out.println(" Cat trials");
        cat1.run(500);
        cat2.run(100);
        cat1.swim(1);
        cat2.swim(50);

        System.out.println("Dog trials");
        dog1.run(500);
        dog2.run(200);
        dog1.swim(10);
        dog2.swim(15);

        System.out.println("Tiger trials");
        tiger1.run(1000);
        tiger1.swim(500);

        System.out.println("Wolf trials");
        wolf1.run(1500);
        wolf1.swim(250);
    }
}
