package Assignment2;

public class Question8Pattern2 {
    public static void main(String[] args) {
       int num = 4;

       for (int i = 1; i <= 5; i++){
           for (int j = 1; j <= i; j++){
               if (j == 1) {
                   for (int k = 5 - i; k > 0; k--) {
                       System.out.print(" ");
                   }
               }
               System.out.print("*");
           }
           if (num == 0){
               System.out.print(" ");
           }
           else System.out.println(num);
           num--;
       }

       // better approach
//        int lines = 6;
//        for (int i = 1; i <= lines; i++) {
//            for (int k = lines - i; k > 0; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
