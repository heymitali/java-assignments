package Assignment4;

import java.io.InputStreamReader;
import java.util.Scanner;

// programme to remove extra spaces from a sentence

// Fix Logic - write this using better logic
// not working for this input: "  pop e     qoqoqo eezc ajkjo ppop   poqrw  "
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter your sentence");
        String inputSentence = (scanner.nextLine()).trim();

        char[] chars = new char[inputSentence.length()];
        chars[0] = inputSentence.charAt(0);
        int k;
        int i;
        int j;

        for (k = 1; k < inputSentence.length(); k++){
            for (i = 1; i < inputSentence.length()-1; i++){
                if(Character.isWhitespace(inputSentence.charAt(i))){
                    chars[k] = inputSentence.charAt(i);
                    k++;
                    for (j = i+1; j <inputSentence.length(); j++){
                        if (!(Character.isWhitespace(inputSentence.charAt(j)))){
                            chars[k] = inputSentence.charAt(j);
                            i = j+1;
                            break;
                        }
                    }
                }
            }
        }
        String correctedSentence = "";
        correctedSentence = correctedSentence.copyValueOf(chars);

        System.out.println("Corrected sentence is " + correctedSentence);
    }
}
