import java.util.*;
import java.io.*;

public class Main {
    static int n, m, maxSum = 0;
    static int[][] grid;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        br.close();
    }

    static void pro() {
        checkCorner();
        checkLine();
    }

    static void checkCorner() {
        a();
        b();
        c();
        d();
    }

    static void checkLine() {
        x();
        y();
    }

    static void a() {
        for (int r = 0; r < n - 1; r++) {
            for (int c = 0; c < m - 1; c++) {
                int sum = grid[r][c] + grid[r + 1][c] + grid[r][c + 1];
                whatIsMax(sum);
            }
        }
    }

    static void b() {
        for (int r = 0; r < n - 1; r++) {
            for (int c = 1; c < m; c++) {
                int sum = grid[r][c] + grid[r + 1][c] + grid[r][c - 1];
                whatIsMax(sum);
            }
        }
    }

    static void c() {
        for (int r = 1; r < n; r++) {
            for (int c = 0; c < m - 1; c++) {
                int sum = grid[r][c] + grid[r - 1][c] + grid[r][c + 1];
                whatIsMax(sum);
            }
        }
    }

    static void d() {
        for (int r = 1; r < n; r++) {
            for (int c = 1; c < m; c++) {
                int sum = grid[r][c] + grid[r - 1][c] + grid[r][c - 1];
                whatIsMax(sum);
            }
        }
    }

    static void x() {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m - 2; c++) {
                int sum = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
                whatIsMax(sum);
            }
        }
    }

    static void y() {
        for (int r = 0; r < n - 2; r++) {
            for (int c = 0; c < m; c++) {
                int sum = grid[r][c] + grid[r + 1][c] + grid[r + 2][c];
                whatIsMax(sum);
            }
        }
    }

    static void whatIsMax(int sum) {
        maxSum = Math.max(sum, maxSum);
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
        System.out.print(maxSum);
    }
}