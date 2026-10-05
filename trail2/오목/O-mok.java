import java.util.Scanner;

public class Main {
    static int[][] dir = {{0, 1}, {1, 1}, {1, 0}, {1, -1}};
    static boolean isOut(int r, int c) {
        return r < 0 || r >= 19 || c < 0 || c >= 19;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        boolean isFin = false;
        for (int r = 0; r < 19; r++) {
            for (int c = 0; c < 19; c++) {
                if (arr[r][c] == 1 || arr[r][c] == 2) {
                    for (int d = 0; d < 4; d++) {
                        int cnt = 0, nr = r, nc = c;
                        while (!isOut(nr + dir[d][0], nc + dir[d][1]) && (arr[nr][nc] == arr[nr + dir[d][0]][nc + dir[d][1]])) {
                            cnt++;
                            nr += dir[d][0];
                            nc += dir[d][1];
                        }

                        if (cnt >= 4) {
                            isFin = true;
                            System.out.print(arr[r][c] + "\n" + (r + 2 * dir[d][0] + 1) + " " + (c + 2 * dir[d][1] + 1));
                        }
                    }
                }

                if (isFin)  break;
            }
            if (isFin) break;
        }

        if (!isFin) {
            System.out.print(0);
        }

    }
}