package org.dsaSeries.java60days.day1;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Mdam";
        str = str.toLowerCase();
//        StringBuilder sb=new StringBuilder(str);
//        sb.reverse();
//        System.out.println(sb.toString().equals(str));
        int len = str.length();
        boolean flag = true;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Is a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
