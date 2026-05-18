import java.util.*;
import java.io.*;

public class Main {
    static int m1, d1, m2, d2;
    static int[] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String A;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m1 = Integer.parseInt(st.nextToken());
        d1 = Integer.parseInt(st.nextToken());
        m2 = Integer.parseInt(st.nextToken());
        d2 = Integer.parseInt(st.nextToken());

        A = br.readLine();
        br.close();
    }

    static int calc(int m, int d) {
        int ans = 0;
        for (int i = 1; i < m; i++) {
            ans += days[i];
        }
        return ans + d;
    }

    static int weekToInt(String w) {
        switch(w) {
            case "Mon":
                return 0;
            case "Tue":
                return 1;
            case "Wed":
                return 2;
            case "Thu":
                return 3;
            case "Fri":
                return 4;
            case "Sat":
                return 5;
            case "Sun":
                return 6;
        }

        return -1;
    }

    static void pro() {
        int date = calc(m2, d2) - calc(m1, d1);

        if ((date % 7) >= weekToInt(A)) {
            System.out.print(date / 7 + 1);
        } else {
            System.out.print(date / 7);
        }
        
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
    }
}