import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(B);
        int[] T = new int[M];
        int cnt = 0;
        for (int i = 0; i < N - M + 1; i++) {
            boolean isSame = true;

            for (int j = 0; j < M; j++) {
                T[j] = A[i + j];
            }
            Arrays.sort(T);
            for (int j = 0; j < M; j++) {
                if (T[j] != B[j])   isSame = false;
            }

            if (isSame) cnt++;
        }
        System.out.print(cnt);
    }
}