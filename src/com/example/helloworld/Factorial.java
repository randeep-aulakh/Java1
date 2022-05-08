package com.example.helloworld;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n;
        long factorial = 1;
        System.out.println("Enter any number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n < 0)
            System.out.println("can't find factorial of a negative number");
        else if(n<=1)
            System.out.println("factorial is 1");
        else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of a number is " + (factorial));

        }
    }
}
