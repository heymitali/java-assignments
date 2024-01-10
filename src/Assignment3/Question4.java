package Assignment3;

import java.io.InputStreamReader;
import java.util.Scanner;

// left shift by the array by "n" positions
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value by which positions you want to shift the array elements");
        int n = scanner.nextInt();

       for (int i = 0; i < array.length; i++){
           if ((i + n) <= (array.length - 1)){
               array[i] = array[n+i];
               continue;
           }
           array[i] = 0;
       }

        for (int num:array) {
            System.out.print(num + " ");
        }
    }
}
