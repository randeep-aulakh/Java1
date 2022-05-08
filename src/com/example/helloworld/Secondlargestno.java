package com.example.helloworld;

public class Secondlargestno {
    public static void main(String[] args) {
        int[] a={6,8,10,2,4,3,1,5};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }


            System.out.println("Second largest element is" +a[1]);
        }



    }

