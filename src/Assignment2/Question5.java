package Assignment2;

public class Question5 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10000);
        System.out.println("The generated five digit number is " + num1);
        int num2 = (int) (Math.random() * 10);
        System.out.println("The generated single digit number is " + num2);

        int count = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            if (rem == num2) {
                count += 1;
            }
            num1 /= 10;
        }

        System.out.println("The number of times the single digit number appears in the multiple digit number is " + count);
    }
}
