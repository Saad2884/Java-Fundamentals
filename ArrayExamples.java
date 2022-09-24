import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] stringArray = new String[] { "Muhammad", "S", "Memon" };
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();
        int[] integerArray;
        integerArray = new int[5];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = 2 * i;
            System.out.print(integerArray[i] + " ");
        }
        System.out.println();
        int[] secondIntegerArray = integerArray;
        int[] thirdIntegerArray = Arrays.copyOf(integerArray, integerArray.length);
        integerArray[0] = 100;
        for (int element : secondIntegerArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element : thirdIntegerArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}