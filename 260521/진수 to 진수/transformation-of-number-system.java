import java.io.*;
import java.util.*;

public class Main {
    static int A, B;
    static String N;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = br.readLine();

        br.close();
    }

    static int ATo10() {
        int num = 0;
        for (int i = 0; i < N.length(); i++) {
            num = num * A + (N.charAt(i) - '0');
        }
        return num;
    }

    static void tenToB(int n) {
        List<Integer> digits = new ArrayList<>();

        while (n >= B) {
            digits.add(n % B);
            n /= B;
        }
        digits.add(n);

        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }

        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        tenToB(ATo10());
    }
}