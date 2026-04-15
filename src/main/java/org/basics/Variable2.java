package org.basics;



public class Variable2 {
    public static void main(String args[]){
        Variable1 var1=new Variable1();
        System.out.println(var1.str);
    }
    public static void printStaticVariableOfOtherClass(){
        System.out.println(Variable1.str);
    }
}
