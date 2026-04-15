package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class SquareRootOfNFloorValue {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sqrtVal = 0;
            for (int i = 1; i * i <= n; i++) {
                if (sqrtVal < i) {
                    sqrtVal = i;
                }
            }
            System.out.println("The sqrt of " + n + " is " + sqrtVal);
        } catch (Exception e) {
            System.out.println(e.toString());;
        }
    }
}
