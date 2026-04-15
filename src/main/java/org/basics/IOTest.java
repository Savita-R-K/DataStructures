package org.basics;

import java.util.Scanner;

public class IOTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(n * 2 + "\n" + str);
    }
}
