package Homework2;

public class Treadmill implements Crossable{

    private final int length;

    public Treadmill (int length) {
        this.length = length;
    }

    @Override
    public void cross(Athletics athlete) {
        athlete.run(length);
    }
}
