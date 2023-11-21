package A;
// problim link
/*
https://codeforces.com/contest/381/problem/A
 */


import java.util.Scanner;

public class SerejaAndDima {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int cardNumber = input.nextInt();
        input.nextLine();
        int[] card = new int[cardNumber];
        int left = 0, right = cardNumber - 1;
        int sereja = 0, dima = 0, total = 0;
        for (int i = 0 ; i < cardNumber ; i++){
            card[i] = input.nextInt();
            total += card[i];
        }
        boolean turn = false;
        while (left <= right){
            if (!turn){
                if (card[left] > card[right]){
                    sereja += card[left++];
                }
                else{
                    sereja += card[right--];
                }
            }else{
                if (card[left] > card[right]){
                    dima += card[left++];
                }
                else{
                    dima += card[right--];
                }
            }
            turn = !turn;
        }
        System.out.println(sereja + " " + dima);
    }
}