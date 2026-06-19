import java.util.*;
import java.io.*;

public class Main {
    static int currA = 0, currB = 0;
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A.add(currA);
        B.add(currB);
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            for (int j = 0; j < time; j++) {
                if (dir.equals("L")) {
                    A.add(--currA);
                }
                if (dir.equals("R")) {
                    A.add(++currA);
                }
            }
        }

        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();
            for (int j = 0; j < time; j++) {
                if (dir.equals("L")) {
                    B.add(--currB);
                }
                if (dir.equals("R")) {
                    B.add(++currB);
                }
            }
        }

        br.close();

        int ans = 0, preA = A.get(0).intValue(), preB = B.get(0).intValue(), nowA, nowB;
        for (int i = 1; i < Math.max(A.size(), B.size()); i++) {
            if (i >= A.size()) {
                nowA = A.get(A.size() - 1).intValue();
            } else {
                nowA = A.get(i).intValue();
            }

            if (i >= B.size()) {
                nowB = B.get(B.size() - 1).intValue();
            } else {
                nowB = B.get(i).intValue();
            }

            if ((nowA == nowB) && (preA != preB)) {
                ans++;
            }

            preA = nowA;
            preB = nowB;
        }

        System.out.print(ans);
    }
}