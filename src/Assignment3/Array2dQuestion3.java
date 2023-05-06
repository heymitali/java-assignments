package Assignment3;

import java.util.Scanner;

public class Array2dQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int columns = 3;

        System.out.println("Enter 9 values to form a 3x3 matrix");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i <= (rows - 1); i++){
            for (int j = 0; j <= (columns - 1); j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        // sum should be inside loop
        int sum = 0;
        int[] sumMatrix = new int[rows];
        for (int i = 0; i <= (rows - 1); i++){
           for (int j = 0; j <= (columns - 1); j++){
               sum += matrix[i][j];
           }
           sumMatrix[i] = sum;
           sum = 0;
       }

        for (int i = 0; i < sumMatrix.length; i++){
            System.out.println(sumMatrix[i]);
        }
    }
}
