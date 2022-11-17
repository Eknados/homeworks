package Homework2;

public class Human implements Athletics {

    private final int maxLength;
    private final int maxHeight;
    boolean isActive;

    protected Human(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;

    }

    @Override
    public void run(int length) {
        if (this.maxLength >= length)
        System.out.println("Human runs " + length + " m ");

        else System.out.printf ("Human cant run that far ");
    }



        @Override
        public void jump ( int height){
            if (this.maxHeight >= height)
                System.out.println("Human jumps " + height + " m ");

            else System.out.println ("Human cant jump that far ");



        }
    }

