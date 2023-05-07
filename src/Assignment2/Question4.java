package Assignment2;

public class Question4 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100000);
        System.out.println("The generated number is " + num);

       int sum = 0;
       while (num > 0) {
           int rem = num % 10;
           sum += rem;
           num = num / 10;
       }

       System.out.println("The sum of the digits of the number is " + sum);
    }
}
