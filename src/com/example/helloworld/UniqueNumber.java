package com.example.helloworld;

import java.util.HashMap;

/*
Given an array of integers. All numbers occur twice except one number which occurs
 once. Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 
 */
public class UniqueNumber {
    public static void main(String[] args) {

        System.out.println("Hello world");
        int a = uniqueNumber(new int[] {2, 3, 5, 4, 5, 3, 4});
        System.out.println("unique integer is "+a);

        
    }

    public static int uniqueNumber(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }

        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        
        return 0;

    }


    
}
