package A;
// problim link
/*
https://codeforces.com/contest/59/problem/A
 */

import java.util.Scanner;

public class Word {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String name = input.nextLine();
        int upperCounter = 0;
        for (int i = 0 ; i < name.length() ; i++){
            if (Character.isUpperCase(name.charAt(i))){
                upperCounter++;
            }
        }
        if (name.length() - upperCounter >= upperCounter){
            System.out.println(name.toLowerCase());
        }else{
            System.out.println(name.toUpperCase());
        }
    }
}

