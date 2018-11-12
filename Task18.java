package com.htp;

public class Task18 {
    public static void main(String[] args) {
        int[] task18  = {5,2,9,21,19,4,20,8,7};
        int[] task18MinMas = new int[2]; //task18MinMas[preMax,Max]
        task18MinMas[1] = Integer.MAX_VALUE;

        for (int c:task18){
            if (c<task18MinMas[1]) {
                task18MinMas[0]=task18MinMas[1];
                task18MinMas[1]=c;
            }else if(c<task18MinMas[0] && c!=task18MinMas[1]){
                task18MinMas[0]=c;
            }
        }

        System.out.println("arr Min: "+task18MinMas[1]  +" arr preMin: "+task18MinMas[0] );
        System.out.println(" ");
    }
}
