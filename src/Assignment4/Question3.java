package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

//programme to count no of vowels and consonants
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String inputSentence = scanner.nextLine();

        int consonants = 0, vowels = 0;
        for (int i = 0; i < inputSentence.length(); i++) {
            char ch = inputSentence.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u':
                    vowels += 1;
                case ' ' :
                    continue;
                default:
                    consonants += 1;
            }
        }
        System.out.println("No. of consonants in the above sentence are " + consonants);
        System.out.println("No. of vowels in the above sentence are " + vowels);
    }

}
