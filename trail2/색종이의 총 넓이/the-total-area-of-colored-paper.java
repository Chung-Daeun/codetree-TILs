import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] grid = new int[205][205];

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken()) + 100;
        int y = Integer.parseInt(st.nextToken()) + 100;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                grid[x + i][y + j] = 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            input();
        }
        br.close();

        int ans = 0;
        for (int i = 0; i < 205; i++) {
            for (int j = 0; j < 205; j++) {
                if (grid[i][j] == 1)    ans += 1;
            }
        }
        System.out.print(ans);
    }
}