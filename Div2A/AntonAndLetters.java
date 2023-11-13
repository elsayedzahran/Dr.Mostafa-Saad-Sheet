package Div2A;
// problim link
/*
https://codeforces.com/contest/443/problem/A
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Set<Character> chars = new HashSet<>();
        String word = input.nextLine();
        for (int i = 0 ; i < word.length() ; i++){
            if (isAlphabet(word.charAt(i))){
                chars.add(word.charAt(i));
            }
        }
        System.out.println(chars.size());
    }

    private static boolean isAlphabet(char c) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0 ; i < alphabet.length() ; i++){
            if (alphabet.charAt(i) == c){
                return true;
            }
        }
        return false;
    }

}