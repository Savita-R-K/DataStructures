package org.dsaSeries.introductionToProblemSolving;

public class LeftRotationByKPos {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7};
        int k=3;
//        int n=num.length;
//        for(int i=0;i<k;i++){
//            int first=num[0];
//            for(int j=0;j<n-1;j++){
//                num[j]=num[j+1];
//            }
//            num[n-1]=first;
//        }
//        System.out.println(Arrays.toString(num));
        reverseArr(num,0,k-1);
        reverseArr(num,k,num.length-1);
        reverseArr(num);

    }

    public static void reverseArr(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
    }

    public static void reverseArr(int[] arr, int startInd, int endInd){
        int temp=0;
        for(int i=startInd;i<endInd/2;i++){
            temp=arr[i];
            arr[i]=arr[endInd-i];
            arr[endInd-i]=temp;
        }
    }
}
