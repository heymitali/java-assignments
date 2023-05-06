package Assignment2;

// TODO: do this using methods and by reversing integer
public class Question9 {
    public static void main(String[] args) {
        System.out.println("Palindromes between 1 to 100 are ");

        for (int i = 1; i <= 100; i++) {
            if (i < 10){
                System.out.print(i + " ");
            }
            else {
                int tens = i / 10;
                int ones = i - ((i / 10) * 10);
                if (tens == ones){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
