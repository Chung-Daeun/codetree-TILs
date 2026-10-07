import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0, num = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                num++;
                for (int k = 0; k < num; k++) {
                    if ((double)sum / num == arr[i + k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}