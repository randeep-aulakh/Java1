package com.example.helloworld;

public class Binarysearch {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70};
       int  key = 20;
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("element is at:  " + m);
                break;
            } else if (a[m] < key) {
                l = m + 1;
            } else {

                h = m - 1;
            }

        }
    }
}
