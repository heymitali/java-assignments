package Assignment3;

    //shift the array elements in circular motion by "n" positions

import java.io.InputStreamReader;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value by which positions you want to shift the array elements in circular motion");
        int n = scanner.nextInt();

        int[] circulatedArray = new int[array.length];
        int j = 0;
         n = n % array.length;

        for (int i = 0; i < array.length; i++) {
            if (n < array.length) {
                circulatedArray[i] = array[n];
                n++;
            }
            else if (n == array.length) {
                circulatedArray[i] = array[j];
                j++;
            }
        }

        for (int num:circulatedArray) {
            System.out.print(num + " ");
        }
    }
}
