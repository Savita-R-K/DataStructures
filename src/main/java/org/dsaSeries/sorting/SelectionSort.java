package org.dsaSeries.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={2,5,7,8,0};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}
