package org.dsaSeries.introductionToProblemSolving;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int count = 0;
            for (int i = 1; i <= n / i; i++) {
                if (n % i == 0) {
                    if (n / i != i) {
                        count = count + 2;
                    } else {
                        count = count + 1;
                    }
                }
                if (count > 2) {
                    System.out.println(n + " is not a prime number");
                    break;
                }
            }
            System.out.println(n + " is a prime number");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
