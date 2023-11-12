package Div2A;
// problim link
/*
https://codeforces.com/contest/732/problem/A
 */

import java.util.Scanner;

public class BuyAShovel {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int k = input.nextInt();
        int r = input.nextInt();

        int mod = k % 10;   
        int i = 1;
        for ( ; i <= 9 ; i++){
            if ((mod * i)%10 - r == 0 || (mod * i)%10 == 0){
                break;
            }
        }
        System.out.println(i);
    }
}