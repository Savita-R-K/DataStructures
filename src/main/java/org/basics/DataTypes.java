package org.basics;

public class DataTypes {

    public static void main(String[] args) {
        int a=5;
        float b=a;
        System.out.println("int "+a);
        System.out.println(b+" int to float");

        int c=(int)b;
        System.out.println("float "+b);
        System.out.println(c+" float to int");

        double d=2;
        System.out.println(d +" int to double");

        long e=2222222222L;
        float f=e;
        long fl=(long) f;
        double g=e;
        long dl=(long) g;

        System.out.println(e);
        System.out.println(f+" long to float");
        System.out.println(fl+" float to long");
        System.out.println(g+" long to double");
        System.out.println(dl+" double to long");

        int h = 'a';
        char i= (char) 97;//char 0 to 9 -->int 48 to 57//char A to Z-->int 65 to 90//char a to z-->int 97 to 122
        System.out.println(h+" char to int");
        System.out.println(i+" int to char");
    }
}
