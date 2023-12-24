package Assignment2;

public class Question8Pattern3 {
    public static void main(String[] args) {
        int numOfLines = (int)(1 + Math.random() * 10);
        for (int line = 1; line <= numOfLines; line++) {
            for (int space = 1; space <= numOfLines - line; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print(i);
            }
            for (int j = line - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
