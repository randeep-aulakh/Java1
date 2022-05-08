package com.example.helloworld;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n;

        System.out.println("enter  n: ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 2; i <= n; i++) {
            int count=0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count==2) {
                    System.out.println(i);


                }


            }
        }
    }










