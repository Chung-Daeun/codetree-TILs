import java.util.*;
import java.io.*;

public class Main {
    static int n, t, r, c, d;
    static int[][] dir = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = getDir(st.nextToken());
        br.close(); 
    }

    static int getDir(String str) {
        switch(str) {
            case "U":
                return 0;
            case "D":
                return 3;
            case "R":
                return 1;
            case "L":
                return 2;
            default:
                return -1;
        }
    }

    static void pro() {
        r += dir[d][0];
        c += dir[d][1];

        if (r < 1 || c < 1 || r > n || c > n) {
            d = 3 - d;
            r += dir[d][0];
            c += dir[d][1];
        }
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        for (int i = 0; i < t; i++) {
            pro();
        }

        System.out.print(r + " " + c);
    }
}