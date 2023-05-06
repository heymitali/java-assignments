package Assignment4;

//to count no of words in a sentence

import java.io.InputStreamReader;
import java.util.Scanner;

// do it without split method
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String inputSentence = scanner.nextLine();

        String[] wordsInSentence = inputSentence.split(" ");
        int noOfWords = wordsInSentence.length;

        System.out.println("Number of words in your sentence are " + noOfWords);
    }
}
