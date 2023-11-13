package Div2A;
// problim link
/*
https://codeforces.com/contest/228/problem/A
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseshoeOnTheOtherHoof {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Set<Integer> shoes = new HashSet<>();
        for (int i = 0 ; i < 4 ; i++){
            int shoe = input.nextInt();
            shoes.add(shoe);
        }
        System.out.println(4-shoes.size());

    }
}