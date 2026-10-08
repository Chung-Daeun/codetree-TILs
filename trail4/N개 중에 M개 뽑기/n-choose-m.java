import java.util.Scanner;

public class Main {
    static int[] ans;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    static void chooseNum(int num, int idx) {
        if (idx == m) {
            saveNums();
            return;
        }

        if (num > n) return;

        ans[idx] = num;
        chooseNum(num + 1, idx + 1);

        ans[idx] = 0;
        chooseNum(num + 1, idx);

    }

    static void saveNums() {
        for (int i = 0; i < m; i++) {
            sb.append(ans[i]).append(" ");
        }
        sb.append("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        ans = new int[m];
        chooseNum(1, 0);
        System.out.print(sb.toString());

    }
}
