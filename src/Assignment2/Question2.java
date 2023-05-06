package Assignment2;

public class Question2 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.println("Generated number are " + num1 + " and " + num2);

        int result = 1;
        for (int i = 1; i <= num2; i++){
            result = result * num1;
        }

        System.out.println("The first number raised to the second number is " + result);
    }
}
