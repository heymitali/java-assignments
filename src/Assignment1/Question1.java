package Assignment1;

// TODO: handle remaining cases

public class Question1 {
    public static void main(String[] args) {
        int num = (int)(10000 * Math.random());
        System.out.println("Generated number is " + num);

        int i = num / 1000;
        int j = (num - (i * 1000)) / 100;
        int k = (num - (i * 1000) - (j * 100)) / 10;
        int l = (num - (i * 1000) - (j * 100) - (k * 10));

        System.out.println(numInWord(i) + " thousand " + numInWord(j) + " hundred " + numInWord(k) + " " + numInWord(l));
    }

    public static String numInWord(int value) {
        String word = "";
        switch (value) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                word = "";
        }
        return word;
    }
}
