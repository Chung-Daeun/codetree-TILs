import java.util.Scanner;
public class Main {
    static int N, M;
    static int[][] dir = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    static boolean isOut(int r, int c) {
        return r < 0 || r >= N || c < 0 || c >= M;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i].charAt(j) == 'L') {
                    for (int k = 0; k < 8; k++) {
                        if (!isOut(i + dir[k][0], j + dir[k][1]) && !isOut(i + 2 * dir[k][0], j + 2 * dir[k][1]) && arr[i + dir[k][0]].charAt(j + dir[k][1]) == 'E' && arr[i + 2 * dir[k][0]].charAt(j + 2 * dir[k][1]) == 'E'){
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}