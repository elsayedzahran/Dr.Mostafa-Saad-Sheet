package A;
// problim link
/*
https://codeforces.com/contest/431/problem/A
 */


import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grid = new int[5];
        int result = 0;
        for (int i = 1 ; i < 5 ; i++){
            grid[i] = input.nextInt();
        }
        String event = input.next();
        for (int i = 0 ; i < event.length() ; i++){
            result += grid[Integer.parseInt(event.charAt(i) + "")];
        }
        System.out.println(result);
    }
}