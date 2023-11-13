package Div2A;
// problim link
/*
https://codeforces.com/contest/686/problem/A
 */

import java.util.Scanner;

public class FreeIceCream {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();
        long x = input.nextLong();
        int distress = 0;
        for (int i = 0 ; i < n ; i++){
            String oper = input.next();
            int number = input.nextInt();

            if (oper.charAt(0) == '+'){
                x += number;
            }else{
                if (x >= number){
                    x -= number;
                }else {
                    distress++;
                }
            }
        }

        System.out.println(x + " " + distress);
    }
}