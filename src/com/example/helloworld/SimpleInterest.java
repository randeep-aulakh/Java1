package com.example.helloworld;

import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        float p , r , t , si;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principal,rate and time");
        p=s.nextFloat();
        r=s.nextFloat();
        t=s.nextFloat();
        si=p*r*t/100;
        System.out.println("Simple Interest is "+si);

    }
}
