package Assignment3;

import java.util.Scanner;

public class Array2dQuestion1 {
    public static void main(String[] args) {
        int rows = 3, columns = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 9 values to form a 3x3 matrix");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                transpose[i][j] = matrix[j][i];
            }
        }

       for (int i = 0; i < rows; i++){
           for (int j = 0; j < columns; j++){
               System.out.print(transpose[i][j] + " ");
           }
           System.out.print("\n");
       }
    }
}
