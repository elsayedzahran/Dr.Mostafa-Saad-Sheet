package A;
// problim link
/*
https://codeforces.com/contest/405/problem/A
 */


import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfBoxes = input.nextInt();
        input.nextLine();
        int[] boxes = new int[numberOfBoxes];
        for (int i = 0 ; i < numberOfBoxes ; i++){
            boxes[i] = input.nextInt();
        }
        Arrays.sort(boxes);
        for (int column : boxes){
            System.out.print(column + " ");
        }
        System.out.println();
    }
}