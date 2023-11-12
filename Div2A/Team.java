package Div2A;
// problim link
/*
https://codeforces.com/contest/231/problem/A
 */


import java.util.Scanner;

public class Team {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfProblems = input.nextInt();
        int result = 0;
        for (int i = 0 ; i < numberOfProblems ; i++){
            int counterOfSolutions = 0;
            for (int j = 0 ; j < 3 ; j++){
                int canSolve = input.nextInt();
                counterOfSolutions += canSolve;
            }
            result += counterOfSolutions > 1 ? 1 : 0;
            input.nextLine();
        }
        System.out.println(result);
    }
}