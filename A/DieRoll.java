package A;
// problim link
/*
https://codeforces.com/contest/9/problem/A
 */

import java.util.Scanner;

public class DieRoll {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int ret = 6 - Integer.max(number1, number2) + 1;

        int gcd = findGCD(6, ret);

        System.out.println((ret/gcd) + "/" + (6/gcd));

    }
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}