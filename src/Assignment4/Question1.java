package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

//to check if a word is a palindrome

// use better algorithm
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter your word");

        StringBuffer inputBuffer = new StringBuffer(scanner.next());
        String inputString = inputBuffer.toString();

        StringBuffer reverseBuffer = inputBuffer.reverse();
        String reverseWord = reverseBuffer.toString();

        if (inputString.equals(reverseWord)){
            System.out.println( inputString + " is a palindrome.");
        }
        else System.out.println( inputString + " is not a palindrome.");
    }
}
