import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1, maxCnt = 1, prev = Integer.parseInt(br.readLine());
        for (int i = 1; i < N; i++) {
            int curr = Integer.parseInt(br.readLine());

            if (prev * curr > 0) {
                cnt++;
            } else {
                cnt = 1;
            }

            maxCnt = Math.max(cnt, maxCnt);
            prev = curr;
        }

        System.out.print(maxCnt);
    }
}