package com.htp;

public class Task10 {

    public static void main(String[] args) {
        int[] task10  = {5,2,9,21,21,4,21,8,7};
        int task10Min = Integer.MAX_VALUE;
        int task10Max = Integer.MIN_VALUE;

        for (int c:task10){
            if (c<task10Min) task10Min=c;
            if (c>task10Max) task10Max=c;
        }

        System.out.println("arr min: " +task10Min +" arr max: " +task10Max);
        System.out.println(" ");
    }
}