package lab1.view;

public class View {

    public static final String BIG_ENDIAN_FORMAT = "Number in Big Endian format: ";
    public static final String LITTLE_ENDIAN_FORMAT = "Number in Little Endian format: ";
    public static final String BACK_CONVERTION_FROM_BIG_ENDIAN = "Number, converted back from Big Endian format: ";
    public static final String BACK_CONVERTION_FROM_LITTLE_ENDIAN = "Number, converted back from Little Endian format: ";


    public void printMessage (String message) {
        System.out.println(message);
    }

    public void printArray(byte [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
