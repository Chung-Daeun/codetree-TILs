import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print(num1 + "" + num2);
    }
}