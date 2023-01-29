package com.example.helloworld;

public class ThreeLargestElements {

    public static void main(String[] args) {
        System.out.println("Hello world");
        // threeLargestElements(new int[] {10, 4, 3, 50, 23, 90});
        // threeLargestElements2(new int[] {10, 4, 3, 50, 23, 90});
        threeLargestElements3(new int[] {10, 4, 3, 50, 23, 90,56,45});
    }

    public static void threeLargestElements(int[] arr) {

        for(int i=1; i<arr.length; i++){
            if(arr[0] < arr[i]){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Largest element >> "+arr[0]);
        
        for(int i=2; i<arr.length; i++){
            if(arr[1] < arr[i]){
                int temp = arr[1];
                arr[1] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("2nd Largest element >> "+arr[1]);
        
        for(int i=3; i<arr.length; i++){
            if(arr[2] < arr[i]){
                int temp = arr[2];
                arr[2] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("3rd Largest element >> "+arr[2]);
        
    }

    public static void threeLargestElements2(int[] arr) {
        for(int a = 0; a<=2; a++){
            for(int i=a+1; i<arr.length; i++){
                if(arr[a] < arr[i]){
                    int temp = arr[a];
                    arr[a] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println((a+1)+" Largest element >> "+arr[a]);
        }
        
    }

    public static void threeLargestElements3(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max3){
                max3 = arr[i];
                if(max3 > max2){
                    int temp = max3;
                    max3 = max2;
                    max2 = temp;
                }
                if(max2 > max1){
                    int temp = max2;
                    max2 = max1;
                    max1 = temp;
                }
            }
        }
    
        System.out.println(" Largest elements >> "+max1 + "  "+max2+"  "+max3);
        
        
    }
}
