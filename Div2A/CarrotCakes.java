package Div2A;
// problim link
/*
https://codeforces.com/contest/799/problem/A
 */

import java.util.Scanner;

public class CarrotCakes {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int t = input.nextInt();
        int k = input.nextInt();
        int d = input.nextInt();

        int count = (t + d)/t;

        if (count * k < n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}