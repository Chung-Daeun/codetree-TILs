import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int currA = 0, currB = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                currA += v;
                A.add(currA);
            }
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for (int j = 0; j < t; j++) {
                currB += v;
                B.add(currB);
            }
        }


        boolean isA = false;
        boolean isB = false;
        int cnt = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).intValue() > B.get(i).intValue()){
                isA = true;
                if (isB) {
                    cnt++;
                    isB = false;
                }    
            }

            if (A.get(i).intValue() < B.get(i).intValue()){
                isB = true;
                if (isA) {
                    cnt++;
                    isA = false;
                }
            }
        }

        System.out.print(cnt);
    }
}