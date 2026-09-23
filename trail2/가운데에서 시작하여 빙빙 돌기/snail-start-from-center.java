import java.util.Scanner;

public class Main {
    static int[][] grid;
    static int[][] dir = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        grid = new int[n][n];
        int num = 1, r = n / 2, c = n / 2, d = -1;
        grid[r][c] = num;
        while (num < n * n) {
            int nd = (d + 1) % 4;
            int nr = r + dir[nd][0];
            int nc = c + dir[nd][1];

            if (grid[nr][nc] != 0) {
                nd = d;
                nr = r + dir[d][0];
                nc = c + dir[d][1];
            }

            grid[nr][nc] = ++num;
            r = nr;
            c = nc;
            d = nd;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}