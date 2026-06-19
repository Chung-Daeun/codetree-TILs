import java.util.*;
import java.io.*;

public class Main {
    static int N, K, P, T;
    static int[] people;
    static Shake[] arr;

    static class Shake implements Comparable<Shake> {
        int t, x, y;

        Shake(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Shake other) {
            return t - other.t;
        }
    }

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        people = new int[N + 5];
        arr = new Shake[T];
        people[P] = 1;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Shake(t, x, y);
        }

        Arrays.sort(arr);

        br.close();
    }

    static void pro() {
        for (Shake sh : arr) {
            if (K == 0) break;
            if (people[sh.x] == 1 || people[sh.y] == 1) {
                people[sh.x] = 1;
                people[sh.y] = 1;
                K--;
            }
        }
    }

    static void printAns() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(people[i]);
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        pro();
        printAns();
    }
}