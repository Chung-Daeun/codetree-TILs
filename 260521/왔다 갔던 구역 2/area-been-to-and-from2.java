import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] line = new int[2005];
    static int current = 1000;

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        String dir = st.nextToken();
        
        switch(dir) {
            case "L":
                moveLeft(x);
                break;
            case "R":
                moveRight(x);
                break;
        }
    }

    static void moveLeft(int n) {
        for (int i = 0; i < n; i++) {
            line[--current]++;
        }
    }

    static void moveRight(int n) {
        for (int i = 0; i < n; i++) {
            line[current++]++;
        }
    }

    static int findArea() {
        int ans = 0;
        for (int spot : line) {
            if (spot >= 2) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            input();
        }
        br.close();

        System.out.print(findArea());
    }
}