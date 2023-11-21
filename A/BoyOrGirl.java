package A;
// problim link
/*
https://codeforces.com/contest/236/problem/A
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoyOrGirl {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char[] name = input.nextLine().toCharArray();
        Map<Character, Integer> counter = new HashMap<>();
        for (char ch : name){
            counter.put(ch, counter.getOrDefault(ch,0)+1);
        }
        System.out.println(counter.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}