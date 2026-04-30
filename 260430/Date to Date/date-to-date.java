import java.util.*;
import java.io.*;

public class Main {
    static int m1, d1, m2, d2;
    static int[] totalDates = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m1 = Integer.parseInt(st.nextToken());
        d1 = Integer.parseInt(st.nextToken());
        m2 = Integer.parseInt(st.nextToken());
        d2 = Integer.parseInt(st.nextToken());
        br.close();
    }

    static int calcDay(int month, int date) {
        int ans = 0;

        for (int i = 0; i < month - 1; i++) {
            ans += totalDates[i];
        }

        return ans + date;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        System.out.print(calcDay(m2, d2) - calcDay(m1, d1) + 1);

    }
}