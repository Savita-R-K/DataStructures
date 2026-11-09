package org.dsaSeries.sorting;

import java.sql.SQLOutput;

public class StringBuilderEg {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        //the default capacity of sb1 is 16 characters
        System.out.println(sb1.capacity());
        sb1.append("Selenium");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        //the capacity of sb2 is 16+4(java)=20 characters
        System.out.println(sb2.capacity());
        sb2.append(" selenium");
        //capacity increases as per need
        sb2.append(" java");
        System.out.println(sb2+" "+sb2.capacity());

        //set capacity to string builder
        StringBuilder sb3=new StringBuilder(50);
        System.out.println(sb3.capacity());

        sb3.append("java");
        System.out.println("sb3 appended with java - "+sb3);

        sb3.insert(2,"12345");
        System.out.println("insert 12345 at 2nd index - "+sb3);

        //ja12345va->ja1javaa
        //5 chars are replaced 2345v->java
        sb3.replace(3,8,"java");
        System.out.println("replace 3 to 8 by java - "+sb3);

        //ja1javaa->jaa
        sb3.delete(2,7);
        System.out.println("delete characters from 2 to 7 - "+sb3);

        sb3.deleteCharAt(2);
        System.out.println("delete char at 2nd index - "+sb3);

        sb3.append("vava");
        System.out.println("append vava - "+sb3);
        System.out.println("index of 'vava' - "+sb3.indexOf("vava"));

        System.out.println("reverse - "+sb3.reverse());
        System.out.println("sb3 modified after reverse function without reinitializing or assigning - "+sb3);

        System.out.println("length of sb3 = "+sb3.length());

        sb3.setCharAt(sb3.length()-1,'v');
        System.out.println("set char at sb3.length-1 by v - "+sb3);

        String str= sb3.toString();
        System.out.println("sb3 converted to String - \nsb3 = "+ sb3.getClass()+ "\nstr = "+str.getClass());
        String str2= sb3.substring(2);
        System.out.println(str2);


    }
}