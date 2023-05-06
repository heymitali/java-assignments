package Assignment2;

public class Question8Pattern3 {
    public static void main(String[] args) {
        // simplify this solution

        int numOfLines = (int)(1 + Math.random() * 10);
        for (int line = 1; line <= numOfLines; line++){
            for (int val = 1; val <= line; val++){
                if (val == 1){
                    for (int space = numOfLines - line; space > 0; space--){
                        System.out.print(" ");
                    }
                }
                System.out.print(val);
            }
            if (line >= 2){ // condition not required
                for (int num = line - 1; num >= 1; num --){
                    System.out.print(num);
                }
            }
            System.out.println();
        }
    }
}
