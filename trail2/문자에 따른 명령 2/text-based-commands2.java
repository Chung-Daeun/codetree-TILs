import java.util.*;
import java.io.*;

public class Main {
    static String str;
    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static int[] curr = {0, 0};
    static int d = 0;


    static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        br.close(); 
    }

    static void move() {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'L' :
                    left();
                    break;
                case 'R' :
                    right();
                    break;
                case 'F' :
                    go();
                    break;
            }
        }
    }

    static void left() {
        d = (d - 1 + 4) % 4;
    }

    static void right() {
        d = (d + 1) % 4;
    }

    static void go() {
        curr[0] += dir[d][0];
        curr[1] += dir[d][1];
    }

    public static void main(String[] args) throws Exception{
        // Please write your code here.
        input();
        move();
        System.out.print(curr[0] + " " + curr[1]);
    }
}