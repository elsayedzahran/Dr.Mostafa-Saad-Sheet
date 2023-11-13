package Div2A;
// problim link
/*
https://codeforces.com/contest/770/problem/A
 */

import java.util.Scanner;
import java.util.Stack;

public class NewPassword {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int idx = 0;
        m--;
        String result = "";
        for (int i = 0 ; i < n ; i++){
            if (idx > m){
                idx = 0;
            }
            result += alphabet.charAt(idx++);
        }
        System.out.println(result);
    }
}