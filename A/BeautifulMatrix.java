package A;
// problim link
/*
https://codeforces.com/contest/263/problem/A
 */


import java.util.Scanner;

public class BeautifulMatrix {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int row = 0, column = 0;
        int result = 0;
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= 5 ; j++){
                int point = input.nextInt();
                if (point == 1){
                    row = i;
                    column = j;
                }
            }
            input.nextLine();
        }
        result += row >= 3 ? row - 3 : 3 - row;
        result += column >= 3 ? column - 3 : 3 - column;
        System.out.println(result);
    }
}
