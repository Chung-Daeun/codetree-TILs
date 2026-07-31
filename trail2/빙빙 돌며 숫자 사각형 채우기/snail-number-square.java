import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static int n, m;
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        br.close();
    }

    static void pro() {
        int r = 0, c = 0, d = 0;
        map[r][c] = 1;

        for (int i = 2; i <= n * m; i++) {
            int nr = r + dir[d][0];
            int nc = c + dir[d][1];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m || map[nr][nc] != 0) {
                d = (d + 1) % 4;
            }

            r += dir[d][0];
            c += dir[d][1];

            map[r][c] = i;

        }

    }

    static void printAns() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
        printAns();
    }
}