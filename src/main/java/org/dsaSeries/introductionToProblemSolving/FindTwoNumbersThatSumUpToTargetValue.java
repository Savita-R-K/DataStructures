package org.dsaSeries.introductionToProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTwoNumbersThatSumUpToTargetValue {
    public static void main(String[] args) {
        //sortedArray
        int[] arr ={0,1,1,2,3,4,5,5,6};
        ArrayList<int[]> sums=new ArrayList<>();
        int tarVal=6;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==tarVal){
                sums.add(new int[]{arr[i], arr[j]});
                //to skip duplicate pair
                int lVal=arr[i];
                int rVal=arr[j];

                while(i<j && lVal==arr[i]){i++;}
                while(i<j && rVal==arr[j]){j--;}
            } else if(sum<tarVal){
                i++;
            }else{
                j--;
            }
        }
        sums.stream().map(Arrays::toString).forEach(System.out::println);
    }
}
