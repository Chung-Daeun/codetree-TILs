import java.util.*;
import java.io.*;

public class Main {
    static int x = 0, y = 0, time = 0;

    static void move(char dir) {
        switch(dir) {
            case 'W':
                x += -1;
                break;
            case 'S':
                y += -1;
                break;
            case 'N':
                y += 1;
                break;
            case 'E':
                x += 1;
                break;
            default:
                break;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        // Please write your code here.
        boolean isReturn = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < dist[i]; j++) {
                move(dir[i]);
                time++;

                if (x == 0 && y == 0) {
                    isReturn = true;
                    break;
                }
            }
            if (isReturn) {
                break;
            }
        }

        if (isReturn) {
            System.out.print(time);
        } else {
            System.out.print(-1);
        }
    }
}