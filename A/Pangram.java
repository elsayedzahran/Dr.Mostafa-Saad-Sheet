package A;
// problim link
/*
https://codeforces.com/contest/520/problem/A
 */

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String pangram = input.next();
        pangram = pangram.toLowerCase();
        int[] freq = new int[1000];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i < n ; i++){
            freq[pangram.charAt(i)]++;
        }
        for (int i = 0 ; i < 26 ; i++){
            if (freq[alphabet.charAt(i)] == 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("YES");
    }
}