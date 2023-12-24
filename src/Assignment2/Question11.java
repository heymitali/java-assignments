package Assignment2;

public class Question11 {
    public static void main(String[] args) {
        int maxValue = 1000;
        System.out.println("The armstrong numbers between 1 and " + maxValue + " are ");

        for (int num = 1; num <= maxValue; num++){
           if (ifArmstrongNum(num)){
               System.out.print(num + " ");
           }
        }

    }

    public static boolean ifArmstrongNum(int num) {
        int cubeSum = 0;
        int temp = num;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            cubeSum = cubeSum + (digit * digit * digit);
        }
        if (cubeSum == temp){
            return true;
        }
        return false;
    }
}
