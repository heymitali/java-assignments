package Assignment2;

public class Question12 {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 2 and 50 are ");

        for (int num = 2; num <= 50; num++) {
            if (isPrimeNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
