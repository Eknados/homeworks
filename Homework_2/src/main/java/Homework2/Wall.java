package Homework2;

public class Wall implements Crossable{

    private final int height;

    public Wall (int height) {
        this.height = height;
    }

    @Override
    public void cross (Athletics athlete) {
        athlete.jump(height);
    }
}

