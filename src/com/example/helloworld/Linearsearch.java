package com.example.helloworld;

public class Linearsearch {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 1, 4, 2};
        int item = 3;
        for (int i = 0; i < a.length; i++) {
            if (item == a[i]) {
                System.out.println("element  found at: " + i);
                break;
            } else {
                System.out.println("element not found");

            }
        }
    }
}
