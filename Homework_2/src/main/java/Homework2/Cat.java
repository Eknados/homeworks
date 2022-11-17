package Homework2;

public class Cat implements Athletics {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    public Cat (int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;


    }

    @Override
    public void run(int length) {
        if (this.maxLength >= length)
            System.out.println("Cat runs " + length + " m ");

        else System.out.println ("Cat cant run that far ");


    }

    @Override
    public void jump (int height) {
        if (this.maxHeight >= height)
            System.out.println("Cat jumps " + height + " m ");

        else System.out.println ("Cat cant jump that far ");

        }
    }


