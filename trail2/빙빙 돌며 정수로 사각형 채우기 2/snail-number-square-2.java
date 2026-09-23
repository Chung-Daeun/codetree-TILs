import java.util.Scanner;
public class Main {
    static int[][] grid;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        grid = new int[n][m];

        int num = 1, r = -1, c = 0, d = 0;
        while (num <= n * m) {
            int nr = r + dir[d][0];
            int nc = c + dir[d][1];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m || grid[nr][nc] != 0) {
                d = (d + 1) % 4;
                continue;
            }

            grid[nr][nc] = num;
            r = nr;
            c = nc;
            num++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}