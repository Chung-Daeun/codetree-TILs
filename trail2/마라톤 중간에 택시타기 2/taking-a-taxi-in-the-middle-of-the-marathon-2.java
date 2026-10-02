import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int dist = 0;
            int x1 = x[0], y1 = y[0], x2, y2;
            for (int j = 1; j < n; j++) {
                if (i == j) continue;

                x2 = x[j];
                y2 = y[j];

                dist += Math.abs(x1 - x2) + Math.abs(y1 - y2);

                x1 = x2;
                y1 = y2;
            }

            minDist = Math.min(minDist, dist);
        }

        System.out.print(minDist);
    }
}