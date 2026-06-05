import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] grid = new int[2005][2005];

    static void input(int k) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + 1000;
        int y1 = Integer.parseInt(st.nextToken()) + 1000;
        int x2 = Integer.parseInt(st.nextToken()) + 1000;
        int y2 = Integer.parseInt(st.nextToken()) + 1000;

        for (int r = x1; r < x2; r++) {
            for (int c = y1; c < y2; c++) {
                grid[r][c] = k;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        for (int i = 1; i <= 2; i++) {
            input(i);
        }
        br.close();

        int x2 = -1, x1 = 2005, y2 = -1, y1 = 2005;
        for (int i = 0; i < 2005; i++) {
            for (int j = 0; j < 2005; j++) {
                if (grid[i][j] == 1) {
                    x1 = Math.min(x1, i);
                    x2 = Math.max(x2, i);
                    y1 = Math.min(y1, j);
                    y2 = Math.max(y2, j);
                }
            }
        }

        int ans = (x2 - x1 + 1) * (y2 - y1 + 1);
        if (x2 == -1 && x1 == 2005 && y2 == -1 && y1 = 2005)    ans = 0;

        System.out.print(ans);
    }
}