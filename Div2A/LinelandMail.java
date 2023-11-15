package Div2A;
// problim link
/*
https://codeforces.com/contest/567/problem/A
 */

import java.util.Scanner;

public class LinelandMail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0 ; i < n ; i++){
            nums[i] = input.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (i == 0){
                if (nums[1] - nums[i] < nums[n - 1] - nums[i]){
                    System.out.println((nums[1] - nums[i]) + " " + (nums[n - 1] - nums[i]));
                }else{
                    System.out.println((nums[n - 1] - nums[i]) + " " + (nums[1] - nums[i]));
                }
            }else if (i == n - 1){
                if (nums[i] - nums[0] < nums[i] - nums[n - 2]){
                    System.out.println((nums[i] - nums[0]) + " " + (nums[i] - nums[n - 2]));
                }else{
                    System.out.println((nums[i] - nums[n - 2]) + " " + (nums[i] - nums[0]));
                }
            }else {
                if (nums[i] - nums[0] < nums[n - 1] - nums[i]){
                    System.out.println(Math.min(nums[i] - nums[i - 1], nums[i + 1] - nums[i]) + " " + (nums[n - 1] - nums[i]));
                }else{
                    System.out.println(Math.min(nums[i] - nums[i - 1], nums[i + 1] - nums[i]) + " " + (nums[i] - nums[0]));
                }
            }
        }
    }
}