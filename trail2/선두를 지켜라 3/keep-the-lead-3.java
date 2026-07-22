import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> a = new ArrayList<>();
    static List<Integer> b = new ArrayList<>();

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int currA = 0,  currB = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                currA += v;
                a.add(currA);
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                currB += v;
                b.add(currB);
            }
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        int ans = 0;
        char whoFirst = 'C';

        for (int idx = 0; idx < a.size(); idx++) {
            if (a.get(idx).intValue() == b.get(idx).intValue()) {
                if (whoFirst != 'C') {
                    ans++;
                    whoFirst = 'C';
                }
                continue;
            }

            if (a.get(idx).intValue() > b.get(idx).intValue()) {
                if (whoFirst != 'A') {
                    ans++;
                    whoFirst = 'A';
                }
                continue;
            }

            if (a.get(idx).intValue() < b.get(idx).intValue()) {
                if (whoFirst != 'B') {
                    ans++;
                    whoFirst = 'B';
                }
                continue;
            }
        }

        System.out.print(ans);
    }
}