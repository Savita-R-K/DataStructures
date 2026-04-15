package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    //n=5 = 1,2,3,4,5 = n*(n+1)/2 = 5*(5+1)/2 = 15
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int sum=n*(n+1)/2;
            System.out.println("The sum of N natural numbers are "+sum);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
