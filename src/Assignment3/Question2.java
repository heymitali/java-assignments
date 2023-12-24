package Assignment3;
import java.io.InputStreamReader;
import java.util.Scanner;

//TODO FIX IT
// left shift array elements by 1 position
// remove extra array used here
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        int[] array = new int[5];
        int[] leftShiftedArray = new int[array.length];

        System.out.println("Enter 5 values");
        for (int k = 0; k < array.length; k++) {
            array[k] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            // no condition needed here
            if (i == array.length - 1) {
                leftShiftedArray[i] = 0;
            } else leftShiftedArray[i] = array[i + 1];
        }
        System.out.print("The shifted array elements are ");

        for (int j = 0; j < leftShiftedArray.length; j++) {
            System.out.print(leftShiftedArray[j] + " ");
        }
    }
}
