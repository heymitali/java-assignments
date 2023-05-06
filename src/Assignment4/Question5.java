package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

    //sort names

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter 5 names");
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++){
            names[i] = scanner.next();
        }

        for (int j = 0; j < names.length; j++){
            for (int k = j+1; k < names.length; k++){
                int compareResult = names[j].compareTo(names[k]);
                if (compareResult > 0){
                    String temp = names[j];
                    names[j] = names[k];
                    names[k] = temp;
                }
            }
        }

        for (String name: names) {
            System.out.print(name + " ");
        }
    }
}
