package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-10110
 */

import java.util.Scanner;

public class LightMoreLight {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            long n = input.nextLong();
            if (n == 0)
                break;
            long sqrt = (long) Math.sqrt(n);
            if (sqrt * sqrt == n){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }
}