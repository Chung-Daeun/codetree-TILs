import java.io.*;
import java.util.*;

public class Main {
    static int[] line = new int[205];
    static int N;

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) + 100;
            int end = Integer.parseInt(st.nextToken()) + 100;

            for (int j = start; j < end; j++) {
                line[j]++;
            }
        }
        br.close();

        int maxNum = 0;
        for (int num : line) {
            maxNum = Math.max(maxNum, num);
        }

        System.out.print(maxNum);
    }
}