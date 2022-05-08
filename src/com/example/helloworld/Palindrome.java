package com.example.helloworld;

public class Palindrome {


    public static void main(String[] args) {
        String s="deepak";
        String rev="";

        for(int i = s.length()-1; i>=0; i--)
        {
            rev=rev +s.charAt(i);

        }
        System.out.println(rev);
        if(s.equals(rev))
        {
            System.out.println("palindrome string" );
        }
        else{
            System.out.println("Not a palindrome string");
        }

    }
}
