package Assignment2;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Palindromes between 1 to 100 are ");

        for (int i = 1; i <= 100; i++){
            if (isPalindrome(i,i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int reverse (int num) {
        int reverseNum = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNum = (reverseNum * 10) + digit;
            num /= 10;
        }
        return reverseNum;
    }

    public static boolean isPalindrome (int num1, int num2) {
        int reverseNum1 = reverse(num1);
        if (num2 == reverseNum1) {
            return true;
        }
        return false;
    }
}
