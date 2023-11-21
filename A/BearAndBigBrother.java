package A;
// problim link
/*
https://codeforces.com/contest/791/problem/A
 */


import java.util.Scanner;

public class BearAndBigBrother {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int bear, limak, years = 0;
        bear = input.nextInt();
        limak = input.nextInt();
        while (bear <= limak){
            years++;
            bear *= 3;
            limak *= 2;
        }
        System.out.println(years);
    }
}
