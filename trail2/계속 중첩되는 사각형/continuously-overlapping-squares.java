import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] grid = new int[205][205];

    static void input(int k) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + 100;
        int y1 = Integer.parseInt(st.nextToken()) + 100;
        int x2 = Integer.parseInt(st.nextToken()) + 100;
        int y2 = Integer.parseInt(st.nextToken()) + 100;

        for (int r = x1; r < x2; r++) {
            for (int c = y1; c < y2; c++) {
                grid[r][c] = k % 2 + 1;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            input(i);
        }

        int area = 0;
        for (int r = 0; r < 205; r++) {
            for (int c = 0; c < 205; c++) {
                if (grid[r][c] == 2) area++;
            }
        }

        System.out.print(area);
    }
}