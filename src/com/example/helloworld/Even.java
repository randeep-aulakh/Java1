package com.example.helloworld;

import java.util.*;

public class Even {
    public static void main(String[] args) {


        int n, i;


        System.out.println("Enter no. of term ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {

                System.out.println(i + " ");
            }
        }
    }
}
