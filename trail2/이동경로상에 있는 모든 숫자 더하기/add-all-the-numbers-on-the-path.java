import java.util.Scanner;

public class Main {
    static int[][] board;
    static int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int r = n / 2, c = n / 2, d = 0, sum = board[r][c];
        for (int i = 0; i < commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'L':
                    d = ((d - 1) + 4) % 4;
                    break;
                case 'R':
                    d = (d + 1) % 4;
                    break;
                case 'F':
                    int nr = r + dir[d][0];
                    int nc = c + dir[d][1];

                    if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;

                    sum += board[nr][nc];

                    r = nr;
                    c = nc;

                    break;
            }
            

            
        }
        System.out.print(sum);
    }
}