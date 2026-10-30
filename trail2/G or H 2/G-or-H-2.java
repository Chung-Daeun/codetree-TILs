import java.util.Scanner;
public class Main {
    static char[] line = new char[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);
            line[position] = ch;
        }
        // Please write your code here.
        int maxDist = -1;
        for (int i = 0; i <= 100; i++) {
            if (line[i] != 'H' && line[i] != 'G')   continue;

            int hCnt = 0;
            int gCnt = 0;

            for (int j = i; j <= 100; j++) {
                if (line[j] != 'H' && line[j] != 'G')   continue;

                if (line[j] == 'H') hCnt++;
                if (line[j] == 'G') gCnt++;

                if (hCnt == 0 || gCnt == 0 || hCnt == gCnt) {
                    maxDist = Math.max(maxDist, j - i);
                }
            }
        } 

        System.out.print(maxDist);
    }
}