package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

// programme to remove extra spaces from a sentence
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String input = (scanner.nextLine()).trim();

        System.out.println("Corrected sentence is " + correctedSentence(input));
    }
    public static StringBuffer correctedSentence (String sentence) {
        StringBuffer buffer = new StringBuffer(sentence);
        for (int i = 1; i < buffer.length(); i++) {
            if (buffer.charAt(i) == ' ') {
                if (buffer.charAt(i - 1) == ' ') {
                    buffer.deleteCharAt(i);
                    i -= 1;
                }
            }
        }
        return buffer;
    }
}
