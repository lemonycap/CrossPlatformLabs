package lab1.utils;

public interface Convertible {

    public byte[] convertToEndian(int number);
    public int convertToInt(byte [] array);

}
