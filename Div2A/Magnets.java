package Div2A;
// problim link
/*
https://codeforces.com/contest/344/problem/A
 */


import java.util.Scanner;

public class Magnets {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int magnets = input.nextInt();
        input.nextLine();
        int counter = 1;
        String prev = input.nextLine();
        for (int i = 1 ; i < magnets ; i++){
            String magnet = input.nextLine();
            if (!magnet.equals(prev)){
                counter++;
            }
            prev = magnet;
        }
        System.out.println(counter);
    }
}