import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1, maxCnt = 0, prev = -1;
        for (int i = 0; i < N; i++) {
            int curr = Integer.parseInt(br.readLine());

            if (curr == prev) {
                cnt++;
            } else {
                maxCnt = Math.max(cnt, maxCnt);
                cnt = 1;
            }

            prev = curr;
        }
        maxCnt = Math.max(cnt, maxCnt);
        br.close();

        System.out.print(maxCnt);
    }
}