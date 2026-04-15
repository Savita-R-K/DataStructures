package org.basics;

import java.util.*;

public class CountNumberOfSteps {

    public static void main(String args[] ) throws Exception {
        Scanner scan=new Scanner(System.in);
        int l=scan.nextInt();
        long []a=new long[l];
        long []b=new long[l];
        for(int i=0;i<l;i++){
            a[i]=scan.nextLong();
        }
        for(int j=0;j<l;j++){
            b[j]=scan.nextLong();
        }
        System.out.println(calcCount(a,b));

    }

    public static long calcCount(long[] a,long[] b){
        long min=Arrays.stream(a).min().getAsLong();
        long count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=b[i] && a[i]>0 && b[i]>0){
                if((a[i]-min)%b[i]!=0){
                    System.out.println(min+" "+a[i]+" "+b[i]);
                    return -1;
                }
                count+=((a[i]-min)/b[i]);
            }
        }
        return count;
    }

}
