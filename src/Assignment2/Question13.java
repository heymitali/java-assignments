package Assignment2;

public class Question13 {
    public static void main(String[] args) {
        int length = 0;
        int maxLength = 0;
        int previousVal = 0;

        for (int i = 1; i <= 10; i++) {
            int value = (int)(Math.random() * 100);
            System.out.print(value + " ");

            if (value >= previousVal){
                length++;
            } else {
                length = 1;
            }
            maxLength = Math.max(length, maxLength);
            previousVal = value;
        }
        System.out.print("\nHighest length of an increasing series is " + maxLength);
    }
}
