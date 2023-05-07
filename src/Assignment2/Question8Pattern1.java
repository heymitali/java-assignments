package Assignment2;

/*
    0
    12
    345
    6789
    01234
 */
public class Question8Pattern1 {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= j; k++) {
                if (i > 9) {
                    i = 0;
                }
                System.out.print(i);
                i++;
            }
            System.out.println();
        }
    }
}
