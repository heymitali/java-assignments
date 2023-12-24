package Assignment2;

public class Question8Pattern2 {
    public static void main(String[] args) {
        int lines = 16;
        for (int i = 1; i <= lines; i++) {
            for (int k = lines - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
