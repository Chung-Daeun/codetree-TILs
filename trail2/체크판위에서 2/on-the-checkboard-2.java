import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.
        int cnt = 0;

        if (grid[0][0] == 'W') {
            for (int r = 1; r < R - 1; r++) {
                for (int c = 1; c < C - 1; c++) {

                    if (grid[r][c] == 'B') {

                        for (int i = r + 1; i < R - 1; i++) {
                            for (int j = c + 1; j < C - 1; j++) {
                                if (grid[i][j] == 'W')  cnt++;
                            }

                        }
                    }
                }
            }
        }

        if (grid[0][0] == 'B') {
            for (int r = 1; r < R - 1; r++) {
                for (int c = 1; c < C - 1; c++) {

                    if (grid[r][c] == 'W') {

                        for (int i = r + 1; i < R - 1; i++) {
                            for (int j = c + 1; j < C - 1; j++) {
                                if (grid[i][j] == 'B')  cnt++;
                            }

                        }
                    }
                }
            }
        }


        System.out.print(cnt);
    }
}