import java.util.Scanner;

public class Main {
    static char[][] grid;
    static int[][] dir = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    static int cnt = 0;

    // 반사 방향 찾기
    static int fineNewD(char ch, int d) {
        // 하 <-> 좌, 우 <-> 상 :/
        if (ch == '/') {
            switch (d) {
                case 0:
                    return 1;

                case 1:
                    return 0;
                    
                case 2:
                    return 3;
                    
                case 3:
                    return 2;
                       
            }
        }

        // 좌 <-> 상, 하 <-> 우 :\\
        if (ch == '\\') {
            switch (d) {
                case 0:
                    return 3;
                    
                case 1:
                    return 2;
                    
                case 2:
                    return 1;
                    
                case 3:
                    return 0;
                    
            }
        }

        return -1;
    }

    static void ref(int r, int c, int d) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid.length) return;

        int nd = fineNewD(grid[r][c], d);
        int nr = r + dir[nd][0];
        int nc = c + dir[nd][1];

        cnt++;

        ref(nr, nc, nd);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        grid =  new char[n][n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        // Please write your code here.
        int r = -1, c = -1, q = (startNum - 1) / n, re = (startNum - 1) % n;

        switch (q) {
            case 0:
                r = 0;
                c = re;
                break;
            case 1:
                r = re;
                c = n - 1;
                break;
            case 2:
                r = n - 1;
                c = (n - 1) - re;
                break;
            case 3:
                r = (n - 1) - re;
                c = 0;
                break;
        }

        ref(r, c, q);
        System.out.print(cnt);
    }
}