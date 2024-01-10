package Assignment3;
import java.io.InputStreamReader;
import java.util.Scanner;

// to sort an array
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers");
        int[] inputs = new int[5];
        for (int i = 0; i < inputs.length; i++){
            inputs[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputs.length - 1; i++){
            for (int j = i+1; j < inputs.length; j++){
                if (inputs[i] > inputs[j]){
                    int temp = inputs[i];
                    inputs[i] = inputs[j];
                    inputs[j] = temp;
                }
            }
        }
        for (int i = 0; i < inputs.length; i++){
            System.out.println(inputs[i] + " ");
        }
    }
}
