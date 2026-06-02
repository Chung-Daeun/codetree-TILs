import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] grid = new int[205][205];
    static int area = 0;

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        checkArea(x1+100, y1+100, x2+100, y2+100);
    }

    static void checkArea(int x1, int y1, int x2, int y2) {
        for (int r = x1; r < x2; r++) {
            for (int c = y1; c < y2; c++) {
                grid[r][c] = 1;
            }
        }
    }

    static void calcArea() {
        for (int i = 0; i < 205; i++) {
            for (int j = 0; j < 205; j++) {
                if (grid[i][j] == 1)    area++;
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

        calcArea();
        System.out.print(area);
    }
}