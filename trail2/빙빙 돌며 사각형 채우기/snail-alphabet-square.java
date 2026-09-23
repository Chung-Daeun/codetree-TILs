import java.util.Scanner;
public class Main {
    static char[][] grid;
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        grid = new char[n][m];
        
        int num = 0, r = 0, c = -1, d = 0;
        char ch = 'A';
        while (num < n * m) {
            int nr = r + dir[d][0];
            int nc = c + dir[d][1];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m || grid[nr][nc] != '\u0000') {
                d = (d + 1) % 4;
                continue;
            }

            grid[nr][nc] = ch++;
            if (ch < 'A' || ch > 'Z') {
                ch = 'A';
            }
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