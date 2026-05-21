import java.util.Scanner;
public class Main {
    static int[] block;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        block = new int[N + 5];

        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int j = A; j <= B; j++) {
                block[j]++;
            }
        }
        // Please write your code here.
        int maxNum = 0;
        for (int idx = 1; idx <= N; idx++) {
            maxNum = Math.max(maxNum, block[idx]);
        }
        System.out.print(maxNum);
    }
}