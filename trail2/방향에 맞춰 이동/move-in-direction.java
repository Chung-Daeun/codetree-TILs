import java.util.*;
import java.io.*;

public class Main {
    static int x = 0, y = 0;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            move(changeCtoI(dir), s);
        }
        br.close();
    }

    static void move(int idx, int s) {
        x += dx[idx] * s;
        y += dy[idx] * s;
    }

    static int changeCtoI(String dir) {
        switch(dir) {
            case "W":
                return 0;
            case "S":
                return 1;
            case "N":
                return 2;
            case "E":
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        System.out.print(x + " " + y);
    }
}