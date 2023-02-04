package com.example.helloworld;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("reverse >> "+String.valueOf(reverseStringConstSpace("naseeb".toCharArray())));
        
    }

    public static char[] reverseStringConstSpace(char[] ch){
        char temp;
         
        for(int i=0,j=ch.length-1;i<j;i++,j--){
            temp= ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
        }
       return ch;
    }


}
