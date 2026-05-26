package org.dsaSeries.introductionToProblemSolving;

import java.util.ArrayList;

public class SecondRepeatingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr={4,4,4,4,4,5,3,6,7,2,6};
        ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> uniquAarrayList=new ArrayList<>();
        int count=0;
        for(int i:arr){
            arrayList.add(i);
        }
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.subList(i+1,arr.length).contains(arrayList.get(i))){
                if(!uniquAarrayList.contains(arrayList.get(i))) {
                    uniquAarrayList.add(arrayList.get(i));
                    count++;
                }
            }
            if(count==2){
                System.out.println(arrayList.get(i));
                break;

            }
        }
    }
}
