import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] student = new int[n + 5];
        boolean isEnd = false;
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(br.readLine());
            if (++student[num] >= k) {
                System.out.print(num);
                isEnd = true;
                break;
            }
        }

        if (!isEnd) {
            System.out.print(-1);
        }

        
    }
}