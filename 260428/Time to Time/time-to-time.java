import java.util.*;
import java.io.*;

public class Main {
    static int a, b, c, d;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        System.out.print((c * 60 + d) - (a * 60 + b));
    }
}