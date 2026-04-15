package org.dsaSeries.introductionToProblemSolving;

import java.util.Arrays;

public class LeftRotationByKPos {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int k=3;
        int n=num.length;
        for(int i=0;i<k;i++){
            int first=num[0];
            for(int j=0;j<n-1;j++){
                num[j]=num[j+1];
            }
            num[n-1]=first;
        }
        System.out.println(Arrays.toString(num));
    }
}
