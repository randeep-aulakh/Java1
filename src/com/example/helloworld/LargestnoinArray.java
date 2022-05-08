package com.example.helloworld;

import java.util.Scanner;
public class LargestnoinArray {
    public static <max> void main(String[] args) {
        int[] a=new int[5]; int max;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int i;
        for (i=0; i<5; i++)
        {
            a[i]=s.nextInt();
        }
        max=a[0];
        for(i=1;i<5;i++)
        {
            if(a[i]>max) {
                max = a[i];
            }
        }
        System.out.println("Largest element "+max);
















    }
}
