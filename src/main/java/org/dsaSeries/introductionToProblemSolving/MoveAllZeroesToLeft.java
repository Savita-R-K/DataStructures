package org.dsaSeries.introductionToProblemSolving;

import java.util.Arrays;

public class MoveAllZeroesToLeft {
    public static void main(String[] args) {
        int[] arr={1,5,0,8,2,0,0,1};
        int n= arr.length;
        int j=n-1;
        int i=n-1;
        while(i>=0){
            if(arr[i]==0){
                i--;
            }else{
                arr[j]=arr[i];
                i--;
                j--;
            }
        }while(j>=0){
            arr[j]=0;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
