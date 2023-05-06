package Assignment2;

public class Question7 {
    public static void main(String[] args) {
        int value;
        int max = 0;
        int freq = 0;

        System.out.print("The generated numbers are ");
        for (int i = 1; i <= 10; i++){
            value = (int)(Math.random() * 10);
            System.out.print(value + " ");
            if (value > max) {
                max = value;
                freq = 1;
            } else if (value == max) {
                freq = freq + 1;
            }
        }
        System.out.println("\nThe maximum value is " + max + " and it is repeated " + freq + " no. of times.");
    }
}
