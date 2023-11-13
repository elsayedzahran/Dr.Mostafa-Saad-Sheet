package Div2A;
// problim link
/*
https://codeforces.com/contest/709/problem/A
 */

import java.util.Scanner;

public class Juicer {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int oranges = input.nextInt();
        int maxSize = input.nextInt();
        int capacity = input.nextInt();
        int[] orange = new int[oranges];
        int fill = 0, counter = 0;
        for (int i = 0 ; i < oranges ; i++){
            orange[i] = input.nextInt();
            if (orange[i] <= maxSize){
                fill += orange[i];
            }
            if (fill > capacity){
                counter++;
                fill = 0;
            }
        }
        System.out.println(counter);

    }
}