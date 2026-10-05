import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int maxCoin = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n - 2; b++) {
                for (int c = a; c < n; c++) {
                    for (int d = 0; d < n - 2; d++) {
                        if (c == a && d < b + 3)    continue;
                        int coin = arr[a][b] + arr[a][b + 1] + arr[a][b + 2] + arr[c][d] + arr[c][d + 1] + arr[c][d + 2];
                        maxCoin = Math.max(maxCoin, coin);
                    }
                }
            }
        }
        System.out.print(maxCoin);
    }
}