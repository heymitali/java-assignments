package Assignment2;

// factorial
public class Question1 {
    public static void main(String[] args) {
            int num = (int) (Math.random() * 10 + 1);
            System.out.println("The generated number is " + num + ". ");
            int c = 1;
            for (int i = 0; i < num; i++) {
                c = c * (num - i);
            }
//            while (num>0) {
//                c *= num;
//                num--;
//            }
            System.out.println("And its factorial is " + c);
    }
}
