package org.dsaSeries.introductionToProblemSolving;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str="Swiss";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c:str.toCharArray()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
    }

//    public static void main(String[] args) {
//        String str="Swiss";
//        str=str.toLowerCase();
//        for(int i=0;i<str.length()-1;i++){
//            int k=0;
//            for(int j=i+1;j<str.length();j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    k++;
//                    break;
//                }
//            }
//            if(k==0){
//                System.out.println(str.charAt(i));
//                break;
//            }
//        }
//    }
}
