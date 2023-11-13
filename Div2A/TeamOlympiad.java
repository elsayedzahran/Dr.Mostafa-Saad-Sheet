package Div2A;
// problim link
/*
https://codeforces.com/contest/490/problem/A
 */

import java.util.*;

public class TeamOlympiad {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt();

        Stack<Integer> programming = new Stack<>();
        Stack<Integer> math = new Stack<>();
        Stack<Integer> pe = new Stack<>();

        for (int i = 0 ; i < n ; i++){
            int student = input.nextInt();
            if (student == 1)
                programming.push(i + 1);
            else if (student == 2) {
                math.push(i + 1);
            }else {
                pe.push(i + 1);
            }
        }
        System.out.println(Math.min(programming.size(), Math.min(math.size(), pe.size())));

        while (Math.min(programming.size(), Math.min(math.size(), pe.size())) > 0){
            System.out.println(programming.pop() + " " + math.pop() + " " + pe.pop());
        }

    }
}