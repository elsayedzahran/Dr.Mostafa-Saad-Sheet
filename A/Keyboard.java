package A;
// problim link
/*
https://codeforces.com/contest/474/problem/A
 */

import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pos = input.next();
        char[] word = input.next().toCharArray();
        int rem = pos.charAt(0) == 'R' ? -1 : 1;
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        for (int i = 0 ; i < word.length ; i++){
            for (int j = 0 ; j < keyboard.length() ; j++){
                if (keyboard.charAt(j) == word[i]){
                    word[i] = keyboard.charAt(j + rem);
                    break;
                }
            }
        }

        System.out.println(String.valueOf(word));
    }
}