package Div2A;
// problim link
/*
https://codeforces.com/contest/731/problem/A
 */



import java.util.Scanner;

public class NightAtTheMuseum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String word = input.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int steps = 0;
        int start = 0;
        for (int i = 0; i < word.length(); i++) {
            int distance = Math.abs(alphabet.indexOf(word.charAt(i)) - start);
            steps += Math.min(distance, 26 - distance);
            start = alphabet.indexOf(word.charAt(i));
        }
        System.out.println(steps);
    }
}