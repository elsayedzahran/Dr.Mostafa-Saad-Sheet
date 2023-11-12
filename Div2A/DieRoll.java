package Div2A;
// problim link
/*
https://codeforces.com/contest/265/problem/A
 */

import java.util.Scanner;

public class ColorfulStonesSimplifiedEdition {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String string1 = input.next();
        String string2 = input.next();

        int idx = 0;
        for (int i = 0 ; i < string2.length() ; i++){
            if ( string1.charAt(idx) == string2.charAt(i)){
                idx++;
            }
        }
        System.out.println(idx + 1);
    }
}