package Homework3;

public class MyArrayDataException extends Exception{
    protected int i;
    protected int j;

    MyArrayDataException (int i, int j) {
        this.i = i;
        this.j = j;
    }
}
