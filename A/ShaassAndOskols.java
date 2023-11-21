package A;
// problim link
/*
https://codeforces.com/contest/294/problem/A
 */

import java.util.Scanner;

public class ShaassAndOskols {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int wires = input.nextInt();
        int[] wire = new int[wires+2];
        for (int i = 1 ; i <= wires ; i++){
            wire[i] = input.nextInt();
        }

        int shoots = input.nextInt();
        while (shoots-- > 0){
            int wireNumber = input.nextInt();
            int bird = input.nextInt();

            wire[wireNumber - 1] += bird-1;
            wire[wireNumber + 1] += (wire[wireNumber] - bird);
            wire[wireNumber] = 0;
        }
        for (int i = 1 ; i <= wires ; i++){
            System.out.println(wire[i]);
        }

    }
}