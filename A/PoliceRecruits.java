package A;
// problim link
/*
https://codeforces.com/contest/427/problem/A
 */


import java.util.Scanner;

public class PoliceRecruits {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int eventNumber = input.nextInt();
        input.nextLine();
        int[] events = new int[eventNumber];
        int result = 0, counter = 0;
        for (int i = 0 ; i < eventNumber ; i++){
            events[i] = input.nextInt();
            if (events[i] == -1 && counter == 0){
                result++;
            } else if (events[i] == -1 && counter > 0) {
                counter--;
            }else{
                counter += events[i];
            }
        }
        System.out.println(result);
    }
}