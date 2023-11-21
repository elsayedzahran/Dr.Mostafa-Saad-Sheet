package A;
// problim link
/*
https://codeforces.com/contest/136/problem/A
 */

import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1 ; i <= n ; i++){
            int dummy = input.nextInt();
            nums[dummy] = i;
        }
        for (int i = 1 ; i <= n ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}