import java.util.*;
import java.io.*;

public class Main {
    static int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    static int[][] net;
    static int n;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        net = new int[n][n];

        for (int i = 0; i < n; i++) {
            net[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        br.close();
    }

    static void pro() {
        int cnt = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (checkOne(r, c) >= 3) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
    
    static int checkOne(int r, int c) {
        int ans = 0;

        for (int i = 0; i < 4; i++) {
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];

            if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

            if (net[nr][nc] == 1)   ans++;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
    }
}