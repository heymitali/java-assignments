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

    //  use better approach
    public static boolean ifArmstrongNum(int num) {
        int cubeSum = 0;
        int lastNum;
        int temp = num;

        if (num < 10){
           lastNum = 1;
        }
        else if (num < 100){
            lastNum = 10;
        }
        else if (num < 1000){
            lastNum = 100;
        }
        else lastNum = 1000;
        
        for (int i = lastNum; i >= 1; i /= 10){
            int digit = num / i;
            num = num - (digit * i);
            int cube = digit * digit * digit;
            cubeSum = cubeSum + cube;
        }
        if (cubeSum == temp){
            return true;
        }
        return false;
    }
}
