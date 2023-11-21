package A;
// problim link
/*
https://codeforces.com/contest/677/problem/A
 */
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfFriends, maxHeight, minimumWidth = 0;
        numberOfFriends = input.nextInt();
        maxHeight = input.nextInt();
        for (int i = 0 ; i < numberOfFriends ; i++){
            int friendsHeight = input.nextInt();
            minimumWidth += friendsHeight > maxHeight ? 2 : 1;
        }
        System.out.println(minimumWidth);

    }

}
