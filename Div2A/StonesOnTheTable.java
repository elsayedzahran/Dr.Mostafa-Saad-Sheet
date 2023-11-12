package Div2A;
// problim link
/*
https://codeforces.com/contest/266/problem/A
 */


import java.util.Scanner;

public class StonesOnTheTable {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int stoneNumber = input.nextInt();
        input.nextLine();
        char[] stones = input.nextLine().toCharArray();
        int result = 0;
        for (int i = 1 ; i < stoneNumber ; i++){
            if (stones[i] == stones[i-1]){
                result++;
            }
        }
        System.out.println(result);
    }
}