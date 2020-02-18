package lab1.utils;

import lab1.utils.Convertible;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ConvertToLittleEndian implements Convertible {

    public byte[] convertToEndian(int number) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);

        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(number);
        return byteBuffer.array();
    }

    public int convertToInt(byte [] array) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);

        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(array);
        return byteBuffer.getInt(0);
    }
}
