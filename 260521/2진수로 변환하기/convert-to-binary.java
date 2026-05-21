import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static List<Integer> digits = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();

        while (N > 1) {
            digits.add(N % 2);
            N /= 2;
        }
        digits.add(N);

        StringBuilder sb = new StringBuilder();
        for (int i = digits.size() - 1; i >= 0; i--) {
            sb.append(digits.get(i));
        }
        System.out.print(sb.toString());
    }
}