import java.io.*;
import java.util.*;

public class Main {
    static int N, B;
    static List<Integer> digits = new ArrayList<>();

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        br.close();
    }

    static void changeDigit() {
        while (N >= B) {
            digits.add(N % B);
            N /= B;
        }
        digits.add(N);
    }

    static void printDigit() {
        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        input();
        changeDigit();
        printDigit();
    }
}