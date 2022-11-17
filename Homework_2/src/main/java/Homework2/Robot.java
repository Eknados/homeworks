package Homework2;

public class Robot implements Athletics{

    private final int maxLength;
    private final int maxHeight;



    public Robot (int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;


    }

    @Override
    public void run(int length) {
        if (this.maxLength >= length)
            System.out.println("Robot runs " + length + " m ");

        else System.out.printf ("Robot cant run that far ");


    }

    @Override
    public void jump (int height) {
        if (this.maxHeight >= height)
            System.out.println("Human jumps " + height + " m ");

        else System.out.println ("Robot cant jump that far ");


        }
    }

