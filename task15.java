package com.htp;

public class task15 {

    public static void main(String[] args) {
        int[] task15N1 ={5,2,9,21,21,4,21,8,7};
        int[] task15N2 ={6,9,34,1,2,44,111,18,8};
        for (int c=0;c<7; c++){
            for (int k=0;k<7;k++){
                if(task15N1[c] == task15N2[k] ) System.out.println(" element "+c +" of first array equal to element " +k +" of second array");
            }
        }
        System.out.println(" ");
    }
}