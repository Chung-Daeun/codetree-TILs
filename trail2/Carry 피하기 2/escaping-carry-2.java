import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int maxSum = -1;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i], b = arr[j], c = arr[k];
                    boolean isCarry = false;

                    while (a / 10 > 0 || b / 10 > 0 || c / 10 > 0) {
                        if ((a % 10) + (b % 10) + (c % 10) >= 10) {
                            isCarry = true;
                            break;
                        }

                        a /= 10;
                        b /= 10;
                        c /= 10;
                    }

                    if (!isCarry) {
                        maxSum = Math.max(maxSum, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.print(maxSum);
    }
}