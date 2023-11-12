package Div2A;
// problim link
/*
https://codeforces.com/contest/112/problem/A
 */


import java.util.Arrays;
import java.util.Scanner;

public class PetyaAndStrings {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        int result = 0;
        for (int i = 0 ; i < string1.length() ; i++){
            if (string1.charAt(i) > string2.charAt(i)){
                result = 1;
                break;
            } else if (string1.charAt(i) < string2.charAt(i)) {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }
}