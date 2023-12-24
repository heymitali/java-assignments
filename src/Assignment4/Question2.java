package Assignment4;
import java.lang.Character;

//to count no of words in a sentence

import java.io.InputStreamReader;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String inputSentence = scanner.nextLine();

        boolean isSpace = true;
        int wordCount = 0;
        for (int i = 0; i < inputSentence.length(); i++) {
            char ch = inputSentence.charAt(i);
            if (Character.isWhitespace(ch)) {
                isSpace = true;
            } else if (Character.isAlphabetic(ch) && isSpace){
               wordCount++;
               isSpace = false;
            }
        }
        System.out.println("No. of words in the sentence are " + wordCount);
    }
}
