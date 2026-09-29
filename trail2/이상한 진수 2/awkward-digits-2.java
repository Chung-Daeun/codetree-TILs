import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        int maxNum = -1;
        for (int i = a.length() - 1; i >= 0; i--) {
            int num = 0;
            for (int j = a.length() - 1; j >= 0; j--) {
                if (i == j) {
                    if (a.charAt(a.length() - 1 - i) == '0') {
                        num += (int)Math.pow(2, j);
                    }
                } else {
                    if (a.charAt(a.length() - 1 - j) == '1') {
                        num += (int)Math.pow(2, j);
                    }
                }
            }

            maxNum = Math.max(num, maxNum);
        }

        System.out.print(maxNum);
    }
}