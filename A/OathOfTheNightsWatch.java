package A;
// problim link
/*
https://codeforces.com/contest/768/problem/A
 */

import java.util.Arrays;
import java.util.Scanner;

public class OathOfTheNightsWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int counter = 0;
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n-1];
        for (int i = 0 ; i < n ; i++){
            if (arr[i] > min && arr[i] < max){
                counter++;
            }
        }
        System.out.println(counter);
    }
}