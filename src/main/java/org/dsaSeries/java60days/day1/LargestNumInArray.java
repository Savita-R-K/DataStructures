package org.dsaSeries.java60days.day1;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max value in array = "+max);
    }
}
