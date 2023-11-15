package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-11231
 */

import java.math.BigInteger;
import java.util.Scanner;

public class BlackAndWhitePainting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int n = input.nextInt();
            int m = input.nextInt();
            int c = input.nextInt();
            if (c == m && m == n && n == 0) {
                break;
            }
            int rem = (c == 1) ? 1 : 0;
            System.out.println(((n - 7) * (m - 7) + rem)/2);
        }
    }
}