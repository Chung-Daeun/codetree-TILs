import java.io.*;
import java.util.*;

public class Main {
    static String binary;

    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        binary = br.readLine();
        br.close();
    }

    static int binaryToDecimal() {
        int num = 0;
        for (int i = 0; i < binary.length(); i++) {
            num = num * 2 + (binary.charAt(i) - '0');
        }
        return num;
    }

    static void decimalToBinary(int n) {
        List<Integer> digits = new ArrayList<>();

        while (n > 1) {
            digits.add(n % 2);
            n /= 2;
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
        decimalToBinary(binaryToDecimal() * 17);
    }
}