package Assignment2;

public class Question4 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100000);
        System.out.println("The generated number is " + num);

       int k, l, sum = 0;
       for (int i = 10000; i >= 10; i /= 10){
           k = num / i;
           l = k * i;
           num = num - l;
           sum = sum + k;
       }
       sum = sum + num;

       // much better approach
//       while (num > 0) {
//           int rem = num % 10;
//           sum += rem;
//           num = num/10;
//       }

       System.out.println("The sum of the digits of the number is " + sum);
    }
}
