package A;
// problim link
/*
https://codeforces.com/contest/160/problem/A
 */

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0, sum = 0;
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int yourSum = 0;
        for (int i = n - 1 ; i >= 0 ; i--){
            yourSum += arr[i];
            counter++;
            if (sum - yourSum < yourSum){
                System.out.println(counter);
                return;
            }

        }
    }
}