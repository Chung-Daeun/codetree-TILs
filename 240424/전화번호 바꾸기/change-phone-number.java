import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        String temp = sc.next();
        String x = sc.next();
        String y = sc.next();

        System.out.printf("%s-%s-%s", temp, y, x);
    }
}