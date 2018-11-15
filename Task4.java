package com.htp;

public class Task4 {

    public static void main(String[] args) {
        double avgVal = 0;
        int[] task4 = {5,2,9,3,1,4,6,8,7};
        double sum=0;

        for(double x:task4) sum+=x;

        System.out.println("Sum " + sum);
        avgVal = sum/task4.length;
        System.out.println("AvgVal " +avgVal );
    }
}