package A;
// problim link
/*
https://codeforces.com/contest/268/problem/A
 */


import java.util.Scanner;

public class Games {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int teamNumber = input.nextInt();
        int[] team = new int[teamNumber];
        int[] uniform = new int[101];
        int result = 0;
        for (int i = 0 ; i < teamNumber ; i++){
            team[i] = input.nextInt();
            int awayShirt = input.nextInt();
            uniform[awayShirt]++;
        }
        for (int i = 0; i < teamNumber ; i++){
            result += uniform[team[i]];
        }
        System.out.println(result);
    }
}