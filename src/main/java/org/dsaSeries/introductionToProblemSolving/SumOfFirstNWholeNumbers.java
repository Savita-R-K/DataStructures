package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class SumOfFirstNWholeNumbers {
    //n=5 = 0,1,2,3,4 = n*(n-1)/2 = 5*4/2 = 10
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sum = n * (n - 1) / 2;
            System.out.println("The sum of first n whole numbers is: " + sum);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
