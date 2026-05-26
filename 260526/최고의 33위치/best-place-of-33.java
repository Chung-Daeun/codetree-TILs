import java.util.Scanner;
public class Main {
    static int[][] grid;
    static int n;

    static int calcCoin(int r, int c) {
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[r + i][c + j] == 1) {
                    ans += 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int maxCoin = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCoin = Math.max(maxCoin, calcCoin(i, j));
            }
        }

        System.out.print(maxCoin);
    }
}