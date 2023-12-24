package Assignment3;

import java.util.Scanner;

// rename loop variables
public class Array2dQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3, columns = 3;

        System.out.println("Enter 9 values to form first 3x3 matrix");
        int[][] matrix1 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter 9 values to form second 3x3 matrix");
        int[][] matrix2 = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        int[][] productMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int productSum = 0;
                for (int k = 0; k < columns; k++) {
                    productSum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = productSum;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               System.out.print(productMatrix[i][j] + " ");
            }
            System.out.print("\n");
       }
    }
}
