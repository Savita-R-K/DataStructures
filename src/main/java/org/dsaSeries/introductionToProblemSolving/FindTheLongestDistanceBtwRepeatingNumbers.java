package org.dsaSeries.introductionToProblemSolving;

import java.util.*;

public class FindTheLongestDistanceBtwRepeatingNumbers {
    public static void main(String[] args) {
//        int[] arr={2,3,4,5,6,3,5,4,6,3,7,6,8,8,6,8};
        int[] arr={1,3,2,4,5,6,1,7,8,2,3};
        Map<Integer,Integer> map=new HashMap<>();
        int maxLen=0;
        int maxVal=0;
        for(int i=0;i< arr.length;i++){
            int dist=0;
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }else{
                dist=i-map.get(arr[i]);
            }
            if(maxLen<dist){
                maxLen=dist;
                maxVal=arr[i];
            }
        }
        System.out.println("MaxVal = "+maxVal+"\nMaxLen = "+maxLen);



    }
}
