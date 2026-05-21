import java.util.*;
import java.io.*;

public class Main {
    static int[] line = new int[105];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());

        drawLine(x1, x2);
    }

    static void drawLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            line[i]++;
        }
    }

    static int searchMax() {
        int maxNum = 0;
        for (int num : line) {
            maxNum = Math.max(num, maxNum);
        }
        return maxNum;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
       int N = Integer.parseInt(br.readLine());
       for (int i = 0; i < N; i++) {
          input();
       }

        System.out.print(searchMax());
    }
}