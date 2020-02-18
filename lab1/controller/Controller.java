package lab1.controller;

import lab1.model.Number;
import lab1.utils.ConvertToBigEndian;
import lab1.utils.ConvertToLittleEndian;
import lab1.view.View;


public class Controller {
    private final int amountOfNumbers = 10;

    private Number number;
    private View view;
    private byte [] bigEndianArray;
    private byte [] littleEndianArray;
    private ConvertToBigEndian bigEndian = new ConvertToBigEndian();
    private ConvertToLittleEndian littleEndian = new ConvertToLittleEndian();

    public Controller (Number number, View view) {
        this.number = number;
        this.view = view;
    }

    public void processConversion() {
        for (int i = 0; i < amountOfNumbers; i++) {
            view.printMessage((i + 1) + " iteration: ");
            number.setNumber(number.generateRandomNumber());
            view.printMessage(number.toString());

            endianConversion();
            intConversion();
        }
    }

    public void endianConversion() {

         bigEndianArray = bigEndian.convertToEndian(number.getNumber());
         view.printMessage(view.BIG_ENDIAN_FORMAT);
         view.printArray(bigEndianArray);

         littleEndianArray = littleEndian.convertToEndian(number.getNumber());
         view.printMessage(view.LITTLE_ENDIAN_FORMAT);
         view.printArray(littleEndianArray);

    }

    public void intConversion() {
        int backConvertedFromBigEndian = bigEndian.convertToInt(bigEndianArray);
        view.printMessage(View.BACK_CONVERTION_FROM_BIG_ENDIAN + backConvertedFromBigEndian);

        int backConvertedFromLittleEndian = littleEndian.convertToInt(littleEndianArray);
        view.printMessage(View.BACK_CONVERTION_FROM_LITTLE_ENDIAN + backConvertedFromLittleEndian);
    }
}
