package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class FactorsOfN {
    public static void main(String[] args) {
        try{
            Scanner scan =new Scanner(System.in);
            int n=scan.nextInt();
            int count=0;
            System.out.print("The Factors of N are ");
            for(int i=1;i<=n/i;i++){//conditions//i<sqrt(n)//i*i<=n
                if(n%i==0){
                    if(n/i!=i){
                        System.out.print(i+" "+n/i+" ");
                        count=count+2;
                    }
                    else{
                        count++;
                        System.out.print(i);
                    }
                }

            }
            System.out.println("\nNo. of Factors of n are "+count);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
