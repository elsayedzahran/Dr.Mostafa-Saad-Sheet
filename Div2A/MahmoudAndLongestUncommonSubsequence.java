package Div2A;
// problim link
/*
https://codeforces.com/contest/766/problem/A
 */

import java.util.Scanner;

public class MahmoudAndLongestUncommonSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        if (str1.equals(str2)){
            System.out.println(-1);
        }else{
            System.out.println(Math.max(str1.length(), str2.length()));
        }
    }
}