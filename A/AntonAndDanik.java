package A;
// problim link
/*
https://codeforces.com/contest/734/problem/A
 */


import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        int stringLength;
        String winner;
        Scanner input = new Scanner(System.in);
        stringLength = input.nextInt();
        input.nextLine();
        winner = input.nextLine();
        int antonWinner = 0;
        for (int i = 0 ; i < winner.length() ; i++){
            antonWinner += winner.charAt(i) == 'A' ? 1 : -1;
        }
        if (antonWinner > 0){
            System.out.println("Anton");
        }else if (antonWinner < 0){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
