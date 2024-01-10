package Assignment3;
import java.io.InputStreamReader;
import java.util.Scanner;

// circular left shift an array by 1 position
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
           array[i] = scanner.nextInt();
        }

        int temp = array[0];
        // refactor this
        for (int i = 0; i < array.length; i++){
            if (i == (array.length - 1)){
                array[i] = temp;
                break;
            }
            array[i] = array[i+1];
        }

        for (int num:array) {
            System.out.print(num + " ");
        }
    }
}
