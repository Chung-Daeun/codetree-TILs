import java.util.Scanner;
public class Main {
    static char[] people = new char[10005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            people[pos] = c;
        }
        // Please write your code here.
        int maxScore = 0;
        for (int i = 1; i <= 10000 - k + 1; i++) {
            int score = 0;
            for (int j = 0; j <= k; j++) {
                if (i + j > 10000)  break;
                if (people[i + j] == 'G')   score += 1;
                if (people[i + j] == 'H')   score += 2;
            }
            maxScore = Math.max(score, maxScore);
        }

        System.out.print(maxScore);

    }
}