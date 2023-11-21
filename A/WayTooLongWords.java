package A;
// problim link
/*
https://codeforces.com/contest/71/problem/A
 */

import java.util.Scanner;

public class WayTooLongWords {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int words = input.nextInt();
        String[] word = new String[words];
        for (int i = 0 ; i < words ; i++){
            word[i] = input.next();
            if (word[i].length() > 10){
                String newWord = makeAbbreviation(word[i]);
                word[i] = newWord;
            }
        }
        for (int i = 0 ; i < words ; i++){
            System.out.println(word[i]);
        }
    }

    private static String makeAbbreviation(String s) {
        int length = s.length() - 2;
        return s.charAt(0) + String.valueOf(length) + s.charAt(length+1);
    }

}