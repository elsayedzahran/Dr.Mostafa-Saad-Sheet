package A;
// problim link
/*
https://codeforces.com/contest/339/problem/A
 */

import java.util.Scanner;

public class HelpfulMaths {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[4];
        String equation = input.next();
        for (int i = 0 ; i < equation.length() ; i++){
            if (equation.charAt(i) != '+'){
                int x = equation.charAt(i) - '0';
                array[x]++;
            }
        }
        String prev = "";

        for (int i = 1 ; i <= 3 ; i++){
            while (array[i]-- > 0){
                prev += String.valueOf(i);
                prev += '+';
            }
        }
        System.out.println(prev.substring(0, prev.length() - 1));

    }
}