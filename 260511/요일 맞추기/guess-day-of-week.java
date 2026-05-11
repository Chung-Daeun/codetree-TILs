import java.util.*;
import java.io.*;

public class Main {
    static String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int m1, d1, m2, d2;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m1 = Integer.parseInt(st.nextToken());
        d1 = Integer.parseInt(st.nextToken());
        m2 = Integer.parseInt(st.nextToken());
        d2 = Integer.parseInt(st.nextToken());

        br.close();
    }

    static int calcDay(int m, int d) {
        int ans = 0;

        for (int i = 1; i < m; i++) {
            ans += day[i];
        }

        return ans + d;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        int date = calcDay(m2, d2) - calcDay(m1, d1);

        date %= 7;

        if (date < 0)   date += 7;

        System.out.println(week[date]);
    }
}