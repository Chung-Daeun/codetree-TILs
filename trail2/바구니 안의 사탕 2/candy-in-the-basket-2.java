import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxCnt = 0;
        for (int c = 0; c <= 100; c++) {
            int cnt = 0;
            for (int i = c - k; i <= c + k; i++) {
                for (int j = 0; j < n; j++) {
                    if (positions[j] == i) {
                        cnt += candies[j];
                    }
                }
            }

            maxCnt = Math.max(maxCnt, cnt);
        }

        System.out.print(maxCnt);
    }
}