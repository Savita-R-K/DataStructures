package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class DifferenceBtProductAndSumOfDigitsInN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

//        int prod = findProdOfDigitsOfN(n);
//        int sum = findSumOfDigitsOfN(n);
//        System.out.println("The difference b/w product and sum od digits of n is " + (prod - sum));

        int diff = findDiffOfProdAndSumOfDigitsOfNMethod(n);
        System.out.println("The difference b/w product and sum od digits of n is " + diff);
    }

    public static int findDiffOfProdAndSumOfDigitsOfNMethod(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n = n / 10;
        }
        return prod - sum;
    }

//    public static int findSumOfDigitsOfN(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum += n % 10;
//            n = n / 10;
//        }
//        return sum;
//    }
//
//    public static int findProdOfDigitsOfN(int n) {
//        int prod = 1;
//        while (n > 0) {
//            prod *= n % 10;
//            n = n / 10;
//        }
//        return prod;
//    }
}
