package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Other1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String inputSentence = scanner.nextLine();

        String[] wordsOfSentence = inputSentence.split(" ");

        for (int i = 0; i < wordsOfSentence.length; i++){
           String result = isVowelOrConsonant(wordsOfSentence[i]);
            System.out.println(wordsOfSentence[i] + result );
        }
    }

    public static String isVowelOrConsonant(String word){
        char ch = word.charAt(0);

        switch (ch){
            case 'a', 'e', 'i', 'o', 'u':
                return  " is a vowel";
            default:
                return " is a consonant";
        }
    }

}
