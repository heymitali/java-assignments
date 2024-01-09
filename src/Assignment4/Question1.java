package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

// check if a word is a palindrome
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Enter your word");
        if (isPalindrome(scanner.next())) {
            System.out.println("it's a palindrome");
        } else {
            System.out.println("it's not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        int i = 0, j = length - 1;
        while (i < j) {
            if (word.charAt(i) == word.charAt(j)) {
                i++; j--;
            } else return false;
        }
        return true;
    }
}