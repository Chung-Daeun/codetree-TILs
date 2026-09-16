import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        int x = 0, y = 0, d = 0;
        boolean isReturn = false;
        int[][] dir = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

        for (int i = 0; i < commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'L':
                    d = (d - 1 + 4) % 4;
                    break;
                case 'R':
                    d = (d + 1) % 4;
                    break;
                case 'F':
                    x += dir[d][0];
                    y += dir[d][1];
                    break;
                default:
                    break;
            }

            if (x == 0 && y == 0) {
                isReturn = true;
                System.out.print(i + 1);
                break;
            }
        }

        if (!isReturn) {
            System.out.print(-1);
        }
    }
}