import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr = new int[200005];
    static int curr = 100000;

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        String dir = st.nextToken();

        switch(dir) {
            case "L" :
                moveLeft(x);
                break;
            case "R" :
                moveRight(x);
                break;
        }
    }

    static void moveLeft(int n) {
        for (int i = 0; i < n; i++) {
            arr[curr] = 1;
            if (i != n - 1) curr--;
        }
    }

    static void moveRight(int n) {
        for (int i = 0; i < n; i++) {
            arr[curr] = 2;
            if (i != n - 1) curr++;
        }
    }

    static void calc() {
        int w = 0, bl = 0;
        for (int color : arr) {
            if (color == 1) w++;
            if (color == 2) bl++;
        }

        System.out.print(w + " " + bl);
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            input();
        }
        br.close();

        calc();
    }
}