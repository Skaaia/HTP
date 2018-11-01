package com.htp;

public class task2 {
    public task2(){}

    public static void main(String[] args) {
        int[] task2 = {5,2,9,3,1,4,6,8,7};
        double sum=0;
        for(double x:task2) sum+=x;
        System.out.println("Sum " + sum);
    }
}