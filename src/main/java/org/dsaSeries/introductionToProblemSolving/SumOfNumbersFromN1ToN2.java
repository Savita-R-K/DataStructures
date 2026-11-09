package org.dsaSeries.introductionToProblemSolving;

public class SumOfNumbersFromN1ToN2 {
    public static void main(String[] args) {
        //if n1 and n2 both are included ------ sum=(n2+n1)*(n2-n1+1)/2;
        //if n1 is excluded ------ sum=(n2-n1)*(n1+n2+1)/2;
        //if n2 is excluded ------ sum=(n2-n1)*(n1+n2-1)/2;
        //if n1 and n2 both are excluded ------ sum=(n2+n1)*(n2-n1-1)/2;

        int n1 = 5;
        int n2 = 10;
        int sum = (n2 + n1) * (n2 - n1 + 1) / 2;
        int sum1 = (n2 - n1) * (n1 + n2 + 1) / 2;
        int sum2 = (n2 - n1) * (n1 + n2 - 1) / 2;
        int sum3 = (n2 + n1) * (n2 - n1 - 1) / 2;
        ;
        System.out.println(sum + " " + sum1 + " " + sum2 + " " + sum3);
    }
}
