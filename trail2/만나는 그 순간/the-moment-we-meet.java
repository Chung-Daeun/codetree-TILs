import java.io.*;
import java.util.*;

public class Main {
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();
    static int N, M, currA = 0, currB = 0;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            saveSpot(st.nextToken(), Integer.parseInt(st.nextToken()), 'A');
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            saveSpot(st.nextToken(), Integer.parseInt(st.nextToken()), 'B');
        }
    }

    static void saveSpot(String dir, int time, char who) {
        if (who == 'A') {
            if (dir.equals("L")) {
                for (int i = 0; i < time; i++) {
                    A.add(--currA);
                }
            }

            if (dir.equals("R")) {
                for (int i = 0; i < time; i++) {
                    A.add(++currA);
                }
            }
        }

        if (who == 'B') {
            if (dir.equals("L")) {
                for (int i = 0; i < time; i++) {
                    B.add(--currB);
                }
            }

            if (dir.equals("R")) {
                for (int i = 0; i < time; i++) {
                    B.add(++currB);
                }
            }
        }
    }

    static int pro() {
        int ans = -2;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).intValue() == B.get(i).intValue()) {
                ans = i;
                break;
            }
        }

        return ans + 1;
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        System.out.print(pro());
    }
}