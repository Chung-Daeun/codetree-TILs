import java.util.Scanner;

public class Main {
    static int[][] map;
    static boolean isComfort(int r, int c) {
        int num = 0;
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int i = 0; i < 4; i++) {
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];

            if (nr < 0 || nr >= map.length || nc < 0 || nc >= map.length) {
                continue;
            }

            if (map[nr][nc] == 1)   num += 1;
        }

        return num == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        map = new int[n][n];
        int m = sc.nextInt();
        
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            map[points[i][0] - 1][points[i][1] - 1] = 1;
            if (isComfort(points[i][0] - 1, points[i][1] - 1)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        // Please write your code here.
        System.out.print(sb.toString());
        
    }
}