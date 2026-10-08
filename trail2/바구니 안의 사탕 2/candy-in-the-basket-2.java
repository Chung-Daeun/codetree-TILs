import java.util.Scanner;
public class Main {
    static int[] candies = new int[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int candy = sc.nextInt();
            int positions = sc.nextInt();
            candies[positions] = candy;
        }
        // Please write your code here.
        int maxCnt = 0;
        for (int c = 0; c <= 100; c++) {
            int cnt = 0;
            for (int i = c - k; i <= c + k; i++) {
                if (i < 0 || i > 100)   continue;
                cnt += candies[i];
            }

            maxCnt = Math.max(cnt, maxCnt);
        }
        System.out.print(maxCnt);
    }
}