package lab1.model;

public class Number {
    private final int MIN_NUMBER = 500;
    private final int MAX_NUMBER = 10000;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number is " + getNumber();
    }

    public int generateRandomNumber () {
        return (MIN_NUMBER + (int) (Math.random() * MAX_NUMBER));
    }

}
