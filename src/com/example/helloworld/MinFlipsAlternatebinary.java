package com.example.helloworld;


public class MinFlipsAlternatebinary {
    public static void main(String[] args) {
        System.out.println("hello world");
        String s = "00011100111";
        System.out.println(" min flips method 1 >> "+minFlipsAlternatebinary(s));
        System.out.println(" min flips method 2 >> "+minFlipsAlternatebinary2(s));
        
    }
    /**
     * @param s
     */
    public static int minFlipsAlternatebinary(String s){
    
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i)=='1') c1++;
            if(i%2!=0 && s.charAt(i)=='0') c1++;
            if(i%2==0 && s.charAt(i)=='0') c2++;
            if(i%2!=0 && s.charAt(i)=='1') c2++;
        }
        return Math.min(c1, c2);

    }

    public static int minFlipsAlternatebinary2(String s){
        String c1 = "";
        String c2 = "";
        for(int i=0; i<s.length();i++){
            if(i%2 == 0){
                c1 += "1";
                c2 += "0";
            } else {
                c1 += "0";
                c2 += "1";
            }
        }

        return Math.min(diffCount(s,c1),diffCount(s,c2));

    }

    private static int diffCount(String s, String c){
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != c.charAt(i)){
                count++;
            }
        }
        return count;
    }
    
}
