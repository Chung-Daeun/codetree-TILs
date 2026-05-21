import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int current = 100000;
    static int[] line = new int[200005];
    static int[] w = new int[200005];
    static int[] b = new int[200005];

    static void input() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        String dir = st.nextToken();

        switch(dir) {
            case "L":
                white(x);
                break;
            case "R":
                black(x);
                break;
        }
    }

    static void white(int n) {
        for (int i = 0; i < n; i++) {
            if (line[current] != 3) {
                w[current]++;
                line[current] = 1;
                checkGrey(current);
            }
            
            if (i != n - 1) current--;
        }
    }

    static void black(int n) {
        for (int i = 0; i < n; i++) {
            if (line[current] != 3) {
                b[current]++;
                line[current] = 2;
                checkGrey(current);
            }
            
            if (i != n - 1) current++;
        }   
    }

    static void checkGrey(int x) {
        if (w[x] >= 2 && b[x] >= 2) {
            line[x] = 3;
        }
    }

    static void calcColor() {
        int wh = 0, bl = 0, g = 0;
        for (int color : line) {
            switch(color) {
                case 1:
                    wh++;
                    break;
                case 2:
                    bl++;
                    break;
                case 3:
                    g++;
                    break;
            }
        }

        System.out.print(wh + " " + bl + " " + g);
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            input();
        }
        br.close();

        calcColor();
    }
}