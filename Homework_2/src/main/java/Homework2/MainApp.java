package Homework2;

public class MainApp {
    public static void main(String[] args) {
        Athletics[] athletes = {
                new Human(800,150),
                new Cat(500,300),
                new Robot(900,800),

        };

        Crossable [] equip = {
                new Treadmill(50),
                new Wall(8000),
        };

        for (Athletics athlete : athletes) {
            for (Crossable equips : equip) {
                equips.cross(athlete);
            }
        }
    }
}
