package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-10106
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // usingBigInteger();
         usingLongMultiplication();
    }

    public static void usingLongMultiplication() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String num1 = input.nextLine();
            String num2 = input.nextLine();

            int num1l = num1.length() - 1 ;
            int num2l = num2.length() - 1;


            int[] result = new int[600];
            for (int i = 0 ; i < num1.length() ; i++){
                for (int j = 0 ; j < num2.length() ; j++){
                    result[i+j] += (num1.charAt(num1l - i) - '0') * (num2.charAt(num2l - j) - '0');
                }
            }

            for (int i = 0 ; i < result.length - 2 ; i++){
                result[i + 1] += result[i] / 10;
                result[i] %= 10;
            }

            int idx = 0;
            for (int i = 1 ; i < result.length - 1 ; i++){
                if (result[result.length - i] != 0){
                    idx = result.length - i;
                    break;
                }
            }
            for (int i = idx ; i >= 0 ; i--){
                System.out.print(result[i]);
            }
            System.out.println();
        }
    }

    public static void usingBigInteger() {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            BigInteger num1 = input.nextBigInteger();
            BigInteger num2 = input.nextBigInteger();

            System.out.println(num1.multiply(num2));
        }
    }
}