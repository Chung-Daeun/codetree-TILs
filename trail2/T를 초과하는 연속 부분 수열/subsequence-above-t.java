import java.io.*;
import java.util.*;

public class Main {
    static int T;
    static int[] arr;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        br.close();
    }

    static int pro() {
        int cnt = 0, maxCnt = 0;
        for (int num : arr) {
            if (num > T) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxCnt = Math.max(cnt, maxCnt);
        }

        return maxCnt;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        System.out.print(pro());

    }
}