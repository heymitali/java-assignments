package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

    // print the pattern

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter the word");
        String word = scanner.next();

        for (int i = 1; i <= word.length(); i++){
            StringBuilder shuffles = new StringBuilder();
            for (int j = 0; j < i; j++) {
                shuffles.append(word.charAt(j));
            }
            System.out.println(word.substring(i) + shuffles);
        }
    }
}
