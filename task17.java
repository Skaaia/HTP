package com.htp;

public class task17 {
    public static void main(String[] args) {
        int[] task17  = {5,2,9,21,19,4,20,8,7};
        int[] task17MaxMas = new int[2]; //task17MaxMas[preMax,Max]
        task17MaxMas[1] = Integer.MIN_VALUE;

        for (int c:task17){
            if (c>task17MaxMas[1]) {
                task17MaxMas[0]=task17MaxMas[1];
                task17MaxMas[1]=c;
            }else if(c>task17MaxMas[0] && c!=task17MaxMas[1]){
                task17MaxMas[0]=c;
            }
        }

        System.out.println("arr Max: "+task17MaxMas[1]  +" arr preMax: "+task17MaxMas[0] );
        System.out.println(" ");
    }
}
