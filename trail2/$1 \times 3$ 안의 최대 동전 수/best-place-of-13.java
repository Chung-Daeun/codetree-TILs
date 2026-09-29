import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int maxCnt = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n - 2; c++) {
                int cnt = 0;
                for (int i = 0; i < 3; i++) {
                    if (grid[r][c + i] == 1) {
                        cnt++;
                    }
                }
                maxCnt = Math.max(maxCnt, cnt);
            }
        }

        System.out.print(maxCnt);
    }
}