package com.htp;

public class Task9 {

    public static void main(String[] args) {
        int[] task9  = {5,2,9,21,21,4,21,8,7};
        int[] task9New  = new int[task9.length+1];
        int specificValTask9 = 643;
        int specificValTask9Index = 4;

        for (int c:task9) System.out.println("arr before " +c);
        System.out.println(" ");

        for (int c = 0; c<task9.length; c++){
            if (c<specificValTask9Index){
                task9New[c] = task9[c];
            }else if (c == specificValTask9Index){
                task9New[c] = specificValTask9;
            }else task9New[c] = task9[c-1];
        }

        for (int c:task9New) System.out.println("arr after " +c);
        System.out.println(" ");
    }
}