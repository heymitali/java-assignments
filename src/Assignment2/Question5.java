package Assignment2;

public class Question5 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100000);
        System.out.println("The generated five digit number is " + num1);
        int num2 = (int) (Math.random() * 10);
        System.out.println("The generated single digit number is " + num2);

        // combine same type declarations
        int k;
        int l;
        int sum = 0; // rename it to count
        for (int i = 10000; i >= 10; i /= 10) {
            k = num1 / i;
            l = k * i;
            num1 = num1 - l;
            if (k == num2) {
                sum = sum + 1;
            }
            if (num1 < 10) { // this should not be needed here
                if (num1 == num2) {
                    sum = sum + 1;
                }
            }
        }

        System.out.println("The number of times the single digit number appears in the multiple digit number is " + sum);
    }
}
