import java.util.*;
import java.io.*;

public class Main {
    static int n, m, maxGold;
    static int[][] map;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        br.close();
    }

    static void pro() {
        for (int i = 0; i < n; i++) {
            findGold(i);
        }
    }

    static void findGold(int k) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int gold = calcGold(r, c, k);

                if (gold * m > k * k + (k+1) * (k+1)) {
                    maxGold = Math.max(maxGold, gold);
                }
            }
        }
    }

    static int calcGold(int r, int c, int k) {
        int ans = 0;
        for (int i = -k; i <= k; i++) {
            int nr = r + i;
            for (int j = -k + Math.abs(i); j <= k - Math.abs(i); j++) {
                int nc = c + j;

                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

                if (map[nr][nc] == 1)   ans += 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
        System.out.print(maxGold);
    }
}