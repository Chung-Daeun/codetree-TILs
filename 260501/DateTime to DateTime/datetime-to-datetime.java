import java.util.*;
import java.io.*;

public class Main {
    static int a, b, c;

    static int calcMin(int d, int h, int m) {
        return (d * 24 * 60) + (h * 60) + m;
    }

    public static void main(String[] args) throws Exception {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        br.close();

        // Please write your code here.
        int ans = calcMin(a, b, c) - calcMin(11, 11, 11);
        System.out.print(ans < 0 ? "-1" : ans);
    }
}