package com.htp;

public class Task12 {

    public static void main(String[] args) {
        int[] task12 ={5,2,9,21,21,4,21,8,7};
        for (int c=0;c<7; c++){
            for (int k=c;k<7;k++){
                if(c!=k && task12[c] == task12[k] ) System.out.println(" element "+c +" equal to element " +k);
            }
        }
        System.out.println(" ");
    }
}
