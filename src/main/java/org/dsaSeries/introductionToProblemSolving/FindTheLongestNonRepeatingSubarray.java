package org.dsaSeries.introductionToProblemSolving;

import java.util.*;

public class FindTheLongestNonRepeatingSubarray {
    public static void main(String[] args) {
        int[] arr={1,3,5,1,2,4,1,6,7,8,9};
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int point=0;
        int maxLen=0;
        List<Integer> maxList=new ArrayList<>();
        while(point<arr.length){
            if(!map.containsKey(arr[point])){
                map.put(arr[point],point);
                point++;
            }else if(map.size()>maxLen){
                point=map.get(arr[point])+1;
                maxList.clear();
                maxList.addAll(map.keySet());
                maxLen=maxList.size();
                map.clear();
            }else{
                point= map.get(arr[point])+1;
                maxList.clear();
                map.clear();
            }
        }
        //end case
        if(maxLen<map.size()){
            maxList.clear();
            maxList.addAll(map.keySet());
            maxLen=maxList.size();
            map.clear();
        }
        System.out.println(maxLen);
        maxList.forEach(System.out::println);
    }
}
